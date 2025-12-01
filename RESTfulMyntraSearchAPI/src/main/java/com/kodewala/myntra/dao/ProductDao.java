package com.kodewala.myntra.dao;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kodewala.myntra.entities.Product;
import com.kodewala.myntra.exception.ProductionNotFoundException;


@Repository
public class ProductDao {

	@Autowired
	SessionFactory sessionFactory;
	
	public void saveProduct(Product productEntity) {
		System.out.println("Product Name: " + productEntity.getItmName());
		Session session = sessionFactory.openSession();
		Transaction trs = session.beginTransaction();
		session.save(productEntity);
		trs.commit();
		System.out.println("inside product dao");
	}

	public List<Product> searchProduct(String searchString) {
		System.out.println("search product");
		Session session = sessionFactory.openSession();
		List<Product> list = session.createQuery("FROM Product where itmName LIKE: name", Product.class)
				.setParameter("name", "%" + searchString + "%").list();
		session.close();
		System.out.println("Search results: " + list);
		
		if(list.isEmpty() || list==null) {
			throw new ProductionNotFoundException("Product Not Found");
		}else {
			return list;
		}
	}
}
