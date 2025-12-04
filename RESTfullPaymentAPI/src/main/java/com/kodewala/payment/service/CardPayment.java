package com.kodewala.payment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.kodewala.payment.bean.PaymentBean;
import com.kodewala.payment.dao.PaymentDao;
import com.kodewala.payment.entities.PaymentEntity;

@Primary
@Service
public class CardPayment implements PaymentService{

	@Autowired
	PaymentDao paymentDao;
	
	@Override
	public int pay(PaymentBean paymentBean) {
		System.out.println("inside card payment");
		PaymentEntity entity = new PaymentEntity();
		entity.setPaymentRefNo(paymentBean.getPaymentRefNo());
		entity.setAmount(paymentBean.getAmount());
		entity.setStatus(paymentBean.getStatus());
		entity.setDescription(paymentBean.getDescription());
		
		int result = paymentDao.processPayment(entity);
		System.out.println(result);
		return result;
	}

}
