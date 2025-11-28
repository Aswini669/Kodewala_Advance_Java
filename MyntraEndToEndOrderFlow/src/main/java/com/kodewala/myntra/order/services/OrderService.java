package com.kodewala.myntra.order.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodewala.myntra.order.bean.OrderInfo;
import com.kodewala.myntra.order.dao.OrdreDao;
import com.kodewala.myntra.order.entities.Order;

@Service
public class OrderService {

	
	@Autowired
	OrdreDao ordreDao;
	
	public int createOrder(OrderInfo orderInfo) {
		System.out.println("Ordre Service: Item Name: " + orderInfo.getItemName());
		Order orderEntity = new Order();
		
		orderEntity.setItemName(orderInfo.getItemName());
		orderEntity.setQty(orderInfo.getQty());
		orderEntity.setPrice(orderInfo.getPrice());
		orderEntity.setAddress(orderInfo.getAddress());
		
		int orderId = ordreDao.saveOrder(orderEntity);
		return orderId;
		
	}
}
