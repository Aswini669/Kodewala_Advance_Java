package com.kodewala.payment.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kodewala.payment.entities.PaymentEntity;
import com.kodewala.payment.exception.PaymentFailedException;

@Repository
public class PaymentDao {

	@Autowired
	SessionFactory sessionFactory;

	public int processPayment(PaymentEntity paymentEntity) {

		System.out.println("Confirm Payment: " + paymentEntity.getStatus());
		if(paymentEntity.getStatus().equals("PAID")) {
			Session session = sessionFactory.openSession();
			Transaction trns = session.beginTransaction();
		    Integer paymentId = (Integer) session.save(paymentEntity);
		    trns.commit();
		    System.out.println("payment id : " + paymentId);
		    return paymentId;
		}else {
			throw new PaymentFailedException("Payment Failed");
		}
		
	}
}
