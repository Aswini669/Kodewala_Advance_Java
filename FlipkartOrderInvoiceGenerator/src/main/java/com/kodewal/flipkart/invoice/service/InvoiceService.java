package com.kodewal.flipkart.invoice.service;

import org.springframework.stereotype.Service;

import com.kodewal.flipkart.invoice.entities.InvoiceEntity;
import com.kodewal.flipkart.invoice.request.InvoiceRequest;

@Service
public interface InvoiceService {

	int createInvoice(InvoiceRequest invoiceRequest);
	InvoiceEntity getInvoiceById(int invoiceId);
	int updateInvoice(InvoiceRequest invoiceRequest);
	String deleteInvoiceByid(int invoiceId);
}
