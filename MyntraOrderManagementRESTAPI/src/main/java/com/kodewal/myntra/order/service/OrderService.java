package com.kodewal.myntra.order.service;

import org.springframework.stereotype.Service;

import com.kodewal.myntra.order.bean.OrderBean;
import com.kodewal.myntra.order.bean.UpdateStatusBean;
import com.kodewal.myntra.order.request.OrderRequest;

@Service
public interface OrderService {

	int placeOrder(OrderBean orderBean);
	
	OrderRequest updateOrderStatus(int ordId,UpdateStatusBean updateBean);
}
