package com.kodewala.myntra.version.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodewala.myntra.version.dao.InvoiceSaverDAO;
import com.kodewala.myntra.version.entities.Invoice;
import com.kodewala.myntra.version.exception.PaymentFailedException;
import com.kodewala.myntra.version.request.PaymentInfo;
import com.kodewala.myntra.version.response.InvoiceResponse;

@Service
public class InvoiceGeneratorServiceImplementation implements InvoiceGeneratorService{

	
	@Autowired
	InvoiceSaverDAO invoiceSaverDAO;
	
	@Override
	public InvoiceResponse generatorVoice(PaymentInfo paymentInfo) {
		Invoice invoice = new Invoice();
		invoice.setPaymentId(paymentInfo.getPaymentId());
		invoice.setProdName(paymentInfo.getProdName());
		if(paymentInfo.getStatus().equals("PAID"))
		{
			invoice.setDescription("Your product has delevered in : " + paymentInfo.getAddress());
		}
		else 
		{
			throw new PaymentFailedException("Payment Failed...");
		}
		invoice.setTotalAmount(calculateVATAmount(paymentInfo.getAmount()));
		int invoiceId = invoiceSaverDAO.createInvoice(invoice);
		
		invoice.setInvoiceDd(invoiceId);
		InvoiceResponse innInvoiceResponse = generatedInvoiceResponse(invoice);
		return innInvoiceResponse;
		
	}
	
	
	public String calculateVATAmount(String amount) {
		double vatAmount = (Integer.parseInt(amount)*CENTVATPERCENT)*STATEVATPERCENT;
		double totalAmount =  Integer.parseInt(amount) + vatAmount;
		return Double.toString(totalAmount);
	}
	
	public String calculateTotalAmountWithGST(String amount) {
		double gstAmount = Integer.parseInt(amount)*GSTPERCENT;
		double totalAmount = Integer.parseInt(amount)+gstAmount;
		return Double.toString(totalAmount);
	}
	
	public InvoiceResponse generatedInvoiceResponse(Invoice invoice) {
		InvoiceResponse invoiceResponse = new InvoiceResponse();
		invoiceResponse.setInvoiceDd(invoice.getInvoiceDd());
		invoiceResponse.setPaymentId(invoice.getPaymentId());
		invoiceResponse.setProdName(invoice.getProdName());
		invoiceResponse.setDescription(invoice.getDescription());
		invoiceResponse.setTotalAmount(invoice.getTotalAmount());
		return invoiceResponse;
	}

	@Override
	public InvoiceResponse generatedInvoiceWithGST(PaymentInfo paymentInfo) {
		Invoice invoice = new Invoice();
		invoice.setPaymentId(paymentInfo.getPaymentId());
		invoice.setProdName(paymentInfo.getProdName());
		
		if(paymentInfo.getStatus().equals("PAID")) {
			invoice.setDescription("Your item is delevered in : " + paymentInfo.getAddress());
		}
		else {
			throw new PaymentFailedException("Payment Failed");
		}
		invoice.setTotalAmount(calculateTotalAmountWithGST(paymentInfo.getAmount()));
		
		int invoiceId = invoiceSaverDAO.createInvoice(invoice);
		invoice.setInvoiceDd(invoiceId);
		
		InvoiceResponse invoiceResponse = generatedInvoiceResponse(invoice);
		return invoiceResponse;
	}

}
