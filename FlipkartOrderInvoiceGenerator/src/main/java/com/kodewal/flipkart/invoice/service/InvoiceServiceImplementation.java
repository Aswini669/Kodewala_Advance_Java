package com.kodewal.flipkart.invoice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodewal.flipkart.invoice.entities.InvoiceEntity;
import com.kodewal.flipkart.invoice.repositories.InvoiceRepo;
import com.kodewal.flipkart.invoice.request.InvoiceRequest;

@Service
public class InvoiceServiceImplementation implements InvoiceService{

	@Autowired
	InvoiceRepo invoiceRepo;
	
	@Override
	public int createInvoice(InvoiceRequest invoiceRequest) {
		InvoiceEntity entity = new InvoiceEntity();
		entity.setInvValue(invoiceRequest.getInvValue());
		entity.setNote(invoiceRequest.getNote());
		entity.setStatus(invoiceRequest.getStatus());
		entity.setGstNum(invoiceRequest.getGstNum());
		entity.setDescription(invoiceRequest.getDescription());
		entity = invoiceRepo.save(entity);
		return entity.getId();
	}

	@Override
	public InvoiceEntity getInvoiceById(int invoiceId) {
		InvoiceEntity invoice = invoiceRepo.findById(invoiceId).get();
		return invoice;
	}

	@Override
	public int updateInvoice(InvoiceRequest invoiceRequest) {
		InvoiceEntity invoice = invoiceRepo.findById(invoiceRequest.getInvId()).get();
		
		if(invoiceRequest.getInvValue() != 0) {
			invoice.setInvValue(invoiceRequest.getInvValue());
		}
		if(invoiceRequest.getNote() != null) {
			invoice.setNote(invoiceRequest.getNote());
		}
		if(invoiceRequest.getGstNum() != null) {
			invoice.setGstNum(invoiceRequest.getGstNum());
		}
		if(invoiceRequest.getStatus() != null) {
			invoice.setStatus(invoiceRequest.getStatus());
		}
		if(invoiceRequest.getDescription() != null) {
			invoice.setDescription(invoiceRequest.getDescription());
		}
		
		invoiceRepo.save(invoice);
		return invoiceRequest.getInvId();
	}

	@Override
	public String deleteInvoiceByid(int invoiceId) {
		invoiceRepo.deleteById(invoiceId);
		return "Delete Invoice Successfully";
	}

}
