package com.kodewala.zomato.request;

public class PaymentRequest {

	private int paymentRef;
	private int orderId;
	private int amount;
	private String status;
	private String description;

	public int getPaymentRef() {
		return paymentRef;
	}

	public void setPaymentRef(int paymentRef) {
		this.paymentRef = paymentRef;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
