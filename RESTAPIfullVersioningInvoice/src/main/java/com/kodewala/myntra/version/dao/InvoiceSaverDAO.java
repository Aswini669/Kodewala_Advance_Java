package com.kodewala.myntra.version.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kodewala.myntra.version.entities.Invoice;

@Repository
public class InvoiceSaverDAO {

	@Autowired
	SessionFactory sessionFactory;
	
	public int createInvoice(Invoice invoice) {
		Session session = sessionFactory.openSession();
		Transaction trsn = session.beginTransaction();
		Integer invoiceId = (Integer) session.save(invoice);
		trsn.commit();
		return invoiceId;
	}
}
