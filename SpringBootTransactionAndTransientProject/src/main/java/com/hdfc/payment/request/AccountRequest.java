package com.hdfc.payment.request;

public class AccountRequest {

	private String accountNum;
	private double amount;
	private String panNum;
	private String password;
	private String mobiNum;
	
	public String getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getPanNum() {
		return panNum;
	}
	public void setPanNum(String panNum) {
		this.panNum = panNum;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobiNum() {
		return mobiNum;
	}
	public void setMobiNum(String mobiNum) {
		this.mobiNum = mobiNum;
	}
	
}
