package com.kodewala.myntra.version.controller.v2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kodewala.myntra.version.request.PaymentInfo;
import com.kodewala.myntra.version.response.InvoiceResponse;
import com.kodewala.myntra.version.service.InvoiceGeneratorService;

@RestController
public class InvoiceControlV2 {
	
	@Autowired
	InvoiceGeneratorService invoiceGeneratorService;

	@PostMapping("generatedInvoiceV2.0")
	public ResponseEntity<InvoiceResponse> createInvoice(@RequestBody PaymentInfo paymentInfo){
		System.out.println(paymentInfo.getProdName());
		InvoiceResponse invoiceResponse = invoiceGeneratorService.generatedInvoiceWithGST(paymentInfo);
		return ResponseEntity.ok(invoiceResponse);
	}
}
