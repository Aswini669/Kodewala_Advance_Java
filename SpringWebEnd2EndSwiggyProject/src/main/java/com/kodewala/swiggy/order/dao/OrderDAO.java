package com.kodewala.swiggy.order.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kodewala.swiggy.order.entities.Order;

@Repository
public class OrderDAO {

	@Autowired
	SessionFactory sessionFactory;
	
	public int saveOrder(Order orderEntity) {
		System.out.println("Ordre DAO: Item Name: " + orderEntity.getProdName());
		Session session = sessionFactory.openSession();
		Transaction tsn = session.beginTransaction();
		System.out.println("Save Order Starting....");
		Integer response = (Integer)session.save(orderEntity);
		tsn.commit();
		System.out.println("Save Order : Completed " + response);
		return response;
	}
}
