package com.kodewala.myntra.order.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kodewala.myntra.order.entities.Order;

@Repository
public class OrdreDao {

	@Autowired
	SessionFactory sessionFactory;
	
	public int saveOrder(Order orderEntity) {
		System.out.println("Ordre DAO: Item name" + orderEntity.getItemName());
		Session session = sessionFactory.openSession();
		Transaction txn = session.beginTransaction();
		System.out.println("Save Order : Strating");
		Integer response = (Integer)session.save(orderEntity);
		txn.commit();
		System.out.println("Save order : Completed and  " + response);
		return response;
	}
}
