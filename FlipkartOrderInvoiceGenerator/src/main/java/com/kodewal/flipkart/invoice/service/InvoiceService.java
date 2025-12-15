package com.kodewal.flipkart.invoice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kodewal.flipkart.invoice.entities.InvoiceEntity;
import com.kodewal.flipkart.invoice.request.InvoiceRequest;

@Service
public interface InvoiceService {

	int createInvoice(InvoiceRequest invoiceRequest);
	InvoiceEntity getInvoiceById(int invoiceId);
	int updateInvoice(InvoiceRequest invoiceRequest);
	String deleteInvoiceByid(int invoiceId);
	List<InvoiceEntity> findInvoiceByStatus(String status);
	List<InvoiceEntity> fiterInvByStatusAndValue(String status,int invValue);
}
