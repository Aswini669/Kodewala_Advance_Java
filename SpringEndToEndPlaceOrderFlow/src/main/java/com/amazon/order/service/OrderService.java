package com.amazon.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amazon.order.bean.OrderBean;
import com.amazon.order.dao.OrderDao;
import com.amazon.order.entity.OrderEntity;

@Service
public class OrderService {

	@Autowired
	OrderDao orderDao;
	
	public int createOrder(OrderBean order) {
		System.out.println("order service, item name: " + order.getItemName());
		OrderEntity orderEntity = new OrderEntity();
		
		orderEntity.setItemName(order.getItemName());
		orderEntity.setPrice(order.getPrice());
		orderEntity.setQty(order.getQty());
		orderEntity.setAddress(order.getAddress());
		
		int ordId = orderDao.saveOrder(orderEntity);
		return ordId;
	}
}
