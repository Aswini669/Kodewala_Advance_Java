package com.amazon.order.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amazon.order.entity.OrderEntity;

@Repository
public class OrderDao {

	@Autowired
	SessionFactory sessionFactory;
	
	public int saveOrder(OrderEntity orderEntity) {
		System.out.println("all order is saved here");
		Session session = sessionFactory.openSession();
		Transaction trsn = session.beginTransaction();
		Integer response = (Integer)session.save(orderEntity);
		trsn.commit();
		System.out.println("response is: " + response);
		return response;
	}
}
