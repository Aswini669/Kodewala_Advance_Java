package com.kodewala.myntra.invoice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kodewala.myntra.invoice.bean.InvoiceBean;
import com.kodewala.myntra.invoice.entities.InvoiceEntity;
import com.kodewala.myntra.invoice.service.InvoiceService;

@RestController
public class InvoiceController {
	
	@Autowired
	InvoiceService invoiceService;

	@PostMapping("generatorInvoice")
	public String generatorInvoice(@RequestBody InvoiceBean invoiceBean) {
		System.out.println("Invoice status : " + invoiceBean.getStatus());
		int id = invoiceService.invoiceService(invoiceBean);
		return "Your Invoice Get Generated Successfully , And your Id is :  " + id;
	}
	
	@PostMapping("getDetils")
	public InvoiceEntity getDetailsById(@RequestBody int invoiceId) {
		InvoiceEntity msg = invoiceService.getDetailsById(invoiceId);
		return msg;
	}
	
	@PostMapping("updateDetails")
	public String updateDetailsById(@RequestBody InvoiceBean invoiceBean) {
		System.out.println("Invoice Descripiion  " + invoiceBean.getStatus());
		int id = invoiceService.updateDetailsById(invoiceBean);
		return "Update successfully " + id;
	}
	
	@PostMapping("deleteDetails")
	public String deleteById(@RequestBody int invoiceId) {
		String deleteMsg = invoiceService.deleteDetailsById(invoiceId);
		return deleteMsg;
	}
}
