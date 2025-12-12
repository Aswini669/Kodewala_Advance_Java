package com.kodewala.myntra.invoice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.kodewala.myntra.invoice.bean.InvoiceBean;
import com.kodewala.myntra.invoice.entities.InvoiceEntity;
import com.kodewala.myntra.invoice.repositories.InvoiceRepo;

@Service
public class InvoiceServiceImplementation implements InvoiceService{

	@Autowired
	InvoiceRepo invoiceRepo;
	
	@Override
	public int invoiceService(InvoiceBean invoiceBean) {
		InvoiceEntity invoiceEntity = new InvoiceEntity();
		invoiceEntity.setInvValue(invoiceBean.getInvValue());
		invoiceEntity.setNote(invoiceBean.getNote());
		invoiceEntity.setGstNo(invoiceBean.getGstNo());
		invoiceEntity.setStatus(invoiceBean.getStatus());
		invoiceEntity.setDescription(invoiceBean.getDescription());
		
		invoiceEntity = invoiceRepo.save(invoiceEntity);
		return invoiceEntity.getInId();
	}

	@Override
	public InvoiceEntity getDetailsById(int invoiceId) {
	    InvoiceEntity details = invoiceRepo.findById(invoiceId).get();
		return details;
	}

	@Override
	public int updateDetailsById(InvoiceBean invoiceBean) {
		
		InvoiceEntity details = invoiceRepo.findById(invoiceBean.getInvId()).get();
		
		if(invoiceBean.getInvValue() != 0) {
			details.setInvValue(invoiceBean.getInvValue());
		}
		if(invoiceBean.getNote() != null) {
			details.setNote(invoiceBean.getNote());
		}
		if(invoiceBean.getGstNo() != null) {
			details.setGstNo(invoiceBean.getGstNo());
		}
		if(invoiceBean.getStatus() != null) {
			details.setStatus(invoiceBean.getStatus());
		}
		if(invoiceBean.getDescription() != null) {
			details.setDescription(invoiceBean.getDescription());
		}
		
	   invoiceRepo.save(details);
		
		return invoiceBean.getInvId();
	}

	@Override
	public String deleteDetailsById(int invoiceId) {
		invoiceRepo.deleteById(invoiceId);
		return "Delete Successfully";
	}

}
