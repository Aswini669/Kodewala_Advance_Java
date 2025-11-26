package com.kodewala.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.kodewala.entities.Payment;

public class Driver {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("\\com\\kodewala\\hibernet\\hibernet-cfg.xml");
		
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction txn = session.beginTransaction();
		
		Payment payment = new Payment();
		payment.setAmount(5000);
		payment.setSentBy("Deepankar");
		payment.setStatus("Done");
		payment.setDescription("This is For Vacation");
		
		session.save(payment);
		txn.commit();
	}
}
