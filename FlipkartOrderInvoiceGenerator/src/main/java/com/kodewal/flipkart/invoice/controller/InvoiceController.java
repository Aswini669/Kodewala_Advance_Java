package com.kodewal.flipkart.invoice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kodewal.flipkart.invoice.entities.InvoiceEntity;
import com.kodewal.flipkart.invoice.request.InvoiceRequest;
import com.kodewal.flipkart.invoice.service.InvoiceService;

@RestController
public class InvoiceController {

	@Autowired
	InvoiceService invoiceService;
	
	@PostMapping("createInvoice")
	public String generateInvoice(@RequestBody InvoiceRequest invoiceRequest) {
		System.out.println("Invoice Status: " + invoiceRequest);
		int invId = invoiceService.createInvoice(invoiceRequest);
		return "Your invoice has benn generated successfully. Invoice id is : " + invId;
	}
	
	@PostMapping("fetchInvoice")
	public InvoiceEntity getInvoiceById(@RequestBody int invoiceId) {
		InvoiceEntity invoiceDetails = invoiceService.getInvoiceById(invoiceId);
		return invoiceDetails;
	}
	
	@PostMapping("updateInvoice")
	public String updateInvoice(@RequestBody InvoiceRequest invoiceRequest) {
		int invoiceId = invoiceService.updateInvoice(invoiceRequest);
		return "Invoice Update Successfully " + invoiceId;
	}
	
	@PostMapping("deleteInvoice")
	public String deleteInvoice(@RequestBody int invoiceId) {
		String deleteInvoice = invoiceService.deleteInvoiceByid(invoiceId);
		return deleteInvoice;
	}
	
	@GetMapping("/getInvId/{status}")
	public String findInvByStatus(@PathVariable String status) {
		List<InvoiceEntity> invoices = invoiceService.findInvoiceByStatus(status);
		return "your invoice data : " + invoices.get(0).getDescription();
	}
	
	@GetMapping("/getInvoice/{status}/{invValue}")
	public String filterInvByStatusAndValues(@PathVariable String status,@PathVariable int invValue) {
		List<InvoiceEntity> invoices = invoiceService.fiterInvByStatusAndValue(status, invValue);
		System.out.println("helo46125");
		System.out.println(invoices);
		return "your data is: " + invoices.get(0).getDescription();
	}
}
