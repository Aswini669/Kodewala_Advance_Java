package com.kodewala.myntra.version.controller.v1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kodewala.myntra.version.entities.Invoice;
import com.kodewala.myntra.version.request.PaymentInfo;
import com.kodewala.myntra.version.response.InvoiceResponse;
import com.kodewala.myntra.version.service.InvoiceGeneratorService;

@RestController
public class InvoiceControlV1 {

	@Autowired
	InvoiceGeneratorService invoiceGeneratorService;
	
	@PostMapping("invoiceVersionv1.0")
	public ResponseEntity<InvoiceResponse> createInvoiceMsg(@RequestBody PaymentInfo paymentInfo) {
		System.out.println("Payment Id : " + paymentInfo.getPaymentId());
		InvoiceResponse invoiceResponse = invoiceGeneratorService.generatorVoice(paymentInfo);
		return ResponseEntity.ok(invoiceResponse);
	}
}
