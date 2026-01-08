package com.myntra.order.service;

import org.springframework.stereotype.Service;
import com.myntra.order.request.OrderRequest;

@Service
public interface OrderService {

	int placeOrder(OrderRequest orderRequest);
}
