package com.kodewal.myntra.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodewal.myntra.order.bean.OrderBean;
import com.kodewal.myntra.order.bean.UpdateStatusBean;
import com.kodewal.myntra.order.exception.OrderNotFoundException;
import com.kodewal.myntra.order.repository.OrderRepository;
import com.kodewal.myntra.order.request.OrderRequest;

@Service
public class OrderServiceImplementation implements OrderService{

	@Autowired
	OrderRepository orderRepository;
	
	@Override
	public int placeOrder(OrderBean orderBean) {
		OrderRequest request = new OrderRequest();
		request.setOrdName(orderBean.getOrdName());
		request.setPrice(orderBean.getPrice());
		request.setOrdStatus(orderBean.getOrdStatus());
		request.setDescription(orderBean.getDescription());
		request = orderRepository.save(request);
		return request.getOrdId();
	}

	@Override
	public OrderRequest updateOrderStatus(int ordId, UpdateStatusBean updateBean) {
		try {
			OrderRequest orderId = orderRepository.findById(ordId).get();
			orderId.setOrdStatus(updateBean.getNewStatus());
			OrderRequest result = orderRepository.save(orderId);
			return result;
		} catch (Exception e) {
			throw new OrderNotFoundException("Invalid id: " + ordId);
		}
		
	}

}
