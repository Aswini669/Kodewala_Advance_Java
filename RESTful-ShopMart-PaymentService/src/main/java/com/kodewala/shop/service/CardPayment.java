package com.kodewala.shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.kodewala.shop.dao.PaymentDao;
import com.kodewala.shop.entity.PaymentEntity;
import com.kodewala.shop.request.PaymentRequest;

@Primary
@Service
public class CardPayment implements PaymentService{

	@Autowired
	PaymentDao paymentDao;
	
	@Override
	public int pay(PaymentRequest request) {
		PaymentEntity entity = new PaymentEntity();
		entity.setPaymentRef(request.getPaymentRefNo());
		entity.setOrderId(request.getOrderId());
		entity.setAmount(request.getAmount());
		entity.setStatus(request.getStatus());
		entity.setDescription(request.getDescription());
		int paymentId = paymentDao.processPayment(entity);
		return paymentId;
	}

}
