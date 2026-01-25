package com.kodewala.shop.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kodewala.shop.entity.PaymentEntity;
import com.kodewala.shop.exception.PaymentFailedException;

@Repository
public class PaymentDao {

	@Autowired
	SessionFactory sessionFactory;

	public int processPayment(PaymentEntity entity) {

		System.out.println("inside payment dao");

		Session session = sessionFactory.openSession();
		Transaction trsn = session.beginTransaction();
		Integer paymentId = (Integer) session.save(entity);
		trsn.commit();

		boolean flag = true;
		if (flag) {
			throw new PaymentFailedException("Payment Failed");
		} else {
			return paymentId;
		}
	}
}
