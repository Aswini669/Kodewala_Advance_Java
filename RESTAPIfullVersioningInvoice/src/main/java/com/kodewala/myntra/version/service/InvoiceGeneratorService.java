package com.kodewala.myntra.version.service;

import com.kodewala.myntra.version.request.PaymentInfo;
import com.kodewala.myntra.version.response.InvoiceResponse;

public interface InvoiceGeneratorService {
	
	
	double CENTVATPERCENT = 0.5;
	double STATEVATPERCENT = 0.12;
	
	double GSTPERCENT = 0.18;

	InvoiceResponse generatorVoice(PaymentInfo paymentInfo);
	
	InvoiceResponse generatedInvoiceWithGST(PaymentInfo paymentInfo);
}
