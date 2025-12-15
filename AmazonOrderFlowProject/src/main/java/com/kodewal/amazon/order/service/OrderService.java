package com.kodewal.amazon.order.service;

import org.springframework.stereotype.Service;

import com.kodewal.amazon.order.bean.OrderBean;
import com.kodewal.amazon.order.bean.UpdateOrderBean;
import com.kodewal.amazon.order.entities.OrderEntity;

@Service
public interface OrderService {

	int createOrder(OrderBean orderBean);
	
	OrderEntity updateNewStatus(int orderId,UpdateOrderBean updateOrderBean);
}
