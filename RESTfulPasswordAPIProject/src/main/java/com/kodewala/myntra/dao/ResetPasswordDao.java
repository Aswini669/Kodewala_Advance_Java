package com.kodewala.myntra.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kodewala.myntra.bean.ResetPassword;
import com.kodewala.myntra.entities.PasswordLogEntity;
import com.kodewala.myntra.entities.UserEntity;

@Repository
public class ResetPasswordDao {

	@Autowired
	SessionFactory sessionFactory;
	
	public String resetPassword(ResetPassword resetPassword) {

        Session session = sessionFactory.openSession();
        Transaction txn = session.beginTransaction();

        try {

            String currentEmail = resetPassword.getEmail();

            // Fetch userId
            String hql = "SELECT u.id FROM UserEntity u WHERE u.email = :email";
            Integer currentUserId = (Integer) session.createQuery(hql)
                    .setParameter("email", currentEmail)
                    .uniqueResult();

            if (currentUserId == null) {
                return "Email does not exist!";
            }

            // Fetch PasswordLogEntity
            String logHql = "FROM PasswordLogEntity p WHERE p.userId = :uid";
            PasswordLogEntity passwordLog = (PasswordLogEntity) session.createQuery(logHql)
                    .setParameter("uid", currentUserId)
                    .uniqueResult();

            if (passwordLog == null) {
                return "Password log not found for this user.";
            }

            String newPassword = resetPassword.getNewPassword();

            // 1️⃣ Check new password is not same as current
            if (newPassword.equalsIgnoreCase(passwordLog.getCurrentPassword())) {
                return "New password cannot be same as current password.";
            }

            // 2️⃣ If old and recent exist → check new password is not same as them
            if (passwordLog.getOldPassword() != null && passwordLog.getRecentMostPassword() != null) {

                if (newPassword.equalsIgnoreCase(passwordLog.getOldPassword())) {
                    return "Password cannot match old password!";
                }

                if (newPassword.equalsIgnoreCase(passwordLog.getRecentMostPassword())) {
                    return "Password cannot match recent password!";
                }
            }

            // 3️⃣ SWAP LOGIC (rotate passwords)
            passwordLog.setOldPassword(passwordLog.getRecentMostPassword());
            passwordLog.setRecentMostPassword(passwordLog.getCurrentPassword());
            passwordLog.setCurrentPassword(newPassword);

            // Update record
            session.update(passwordLog);

            txn.commit();
            return "Password updated successfully!";

        } catch (Exception e) {
            txn.rollback();
            e.printStackTrace();
            return "Error while updating password.";
        } finally {
            session.close();
        }
    }
}
