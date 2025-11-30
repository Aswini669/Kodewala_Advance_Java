package com.kodewala.swiggy.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodewala.swiggy.order.bean.OrderInfo;
import com.kodewala.swiggy.order.dao.OrderDAO;
import com.kodewala.swiggy.order.entities.Order;

@Service
public class OrderService {

	@Autowired
	OrderDAO orderDAO;
	
	public int createOrdre(OrderInfo orderInfo) {
		System.out.println("Order Service:  Order Product Name: " + orderInfo.getProdName());
		Order orderEntity = new Order();
		orderEntity.setProdName(orderInfo.getProdName());
		orderEntity.setQty(orderInfo.getQty());
		orderEntity.setPrice(orderInfo.getPrice());
		orderEntity.setAddress(orderInfo.getAddress());
		
		int orderId = orderDAO.saveOrder(orderEntity);
		return orderId;
	}
}
