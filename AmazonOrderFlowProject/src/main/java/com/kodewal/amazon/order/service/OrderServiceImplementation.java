package com.kodewal.amazon.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodewal.amazon.order.bean.OrderBean;
import com.kodewal.amazon.order.bean.UpdateOrderBean;
import com.kodewal.amazon.order.entities.OrderEntity;
import com.kodewal.amazon.order.exception.InvalidDataException;
import com.kodewal.amazon.order.repository.OrderRepository;

@Service
public class OrderServiceImplementation implements OrderService{

	@Autowired
	OrderRepository orderRepository;
	
	@Override
	public int createOrder(OrderBean orderBean) {
		OrderEntity entity = new OrderEntity();
		entity.setOrderName(orderBean.getOrderName());
		entity.setOrderStatus(orderBean.getOrderStatus());
		entity.setPrice(orderBean.getPrice());
		entity.setDescription(orderBean.getDescription());
		entity = orderRepository.save(entity);
		return entity.getOrderId();
	}

	@Override
	public OrderEntity updateNewStatus(int orderId, UpdateOrderBean updateOrderBean) {
		
		try {
			OrderEntity orders = orderRepository.findById(orderId).get();
			
			orders.setOrderStatus(updateOrderBean.getNewStatus());
			OrderEntity result = orderRepository.save(orders);
			return result;
		} catch (Exception e) {
			throw new InvalidDataException("Invalid Id: "+ orderId);
		}
		
	}

}
