package com.kodewala.encap.wallet;

public class PaymentWalletApp {

	public static void main(String[] args) {
		PaymentWallet payment = new PaymentWallet();
		payment.getBalance();
		payment.addmoney(5000);
		payment.makePayment(500);
		
	}
}
