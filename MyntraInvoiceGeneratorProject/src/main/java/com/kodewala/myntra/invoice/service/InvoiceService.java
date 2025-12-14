package com.kodewala.myntra.invoice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kodewala.myntra.invoice.bean.InvoiceBean;
import com.kodewala.myntra.invoice.entities.InvoiceEntity;

@Service
public interface InvoiceService {

	int invoiceService(InvoiceBean invoiceBean);
	
	InvoiceEntity getDetailsById(int invoiceId);
	
	int updateDetailsById(InvoiceBean invoiceBean);
	
	String deleteDetailsById(int invoiceId);
	
	List<InvoiceEntity> findVoiceByStatus(String status);
	
}
