package com.myntra.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myntra.order.entity.OrderEntity;
import com.myntra.order.repository.OrderRepo;
import com.myntra.order.request.OrderRequest;

@Service
public class OrderServiceImplementation implements OrderService{

	@Autowired
	OrderRepo orderRepo;
	
	@Override
	public int placeOrder(OrderRequest orderRequest) {
		OrderEntity orderEntity = new OrderEntity();
		
		orderEntity.setItemName(orderRequest.getItemName());
		orderEntity.setQty(orderRequest.getQty());
		orderEntity.setStatus(orderRequest.getStatus());
		orderEntity.setDescription(orderRequest.getDescription());
		
		orderEntity = orderRepo.save(orderEntity);
		return orderEntity.getOrdId();
	}

}
