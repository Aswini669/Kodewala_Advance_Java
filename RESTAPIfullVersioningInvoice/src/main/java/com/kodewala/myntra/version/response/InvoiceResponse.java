package com.kodewala.myntra.version.response;

public class InvoiceResponse {

	private int invoiceDd;
	private int paymentId;
	private String prodName;
	private String description;
	private String totalAmount;
	
	public int getInvoiceDd() {
		return invoiceDd;
	}
	public void setInvoiceDd(int invoiceDd) {
		this.invoiceDd = invoiceDd;
	}
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	
}
