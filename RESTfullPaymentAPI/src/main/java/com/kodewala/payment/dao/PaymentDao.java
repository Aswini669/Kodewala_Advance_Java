package com.kodewala.payment.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kodewala.payment.entities.PaymentEntity;

@Repository
public class PaymentDao {

	@Autowired
	SessionFactory sessionFactory;

	public String processPayment(PaymentEntity paymentEntity) {

		System.out.println("I am payment dao");

		Session session = null;
		Transaction txn = null;

		try {

			session = sessionFactory.openSession();
			txn = session.beginTransaction();
			session.save(paymentEntity);
			txn.commit();
			// Return a success message or reference number
			return "Payment Saved Successfully. Ref No : " + paymentEntity.getPaymentRefNo();

		} catch (Exception e) {

			if (txn != null) {
				txn.rollback();
			}
			e.printStackTrace();

			return "Payment Failed : " + e.getMessage();

		} finally {

			if (session != null) {
				session.close();
			}
		}
	}
}
