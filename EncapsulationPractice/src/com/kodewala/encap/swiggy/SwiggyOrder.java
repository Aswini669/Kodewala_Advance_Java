package com.kodewala.encap.swiggy;

public class SwiggyOrder {

	private String resturant;
	private String foodItem;
	private String customerName;
	private String deliveryAddress;
	
	public SwiggyOrder(String resturant,String foodItem,String customerName,String deliveryAddress) {
		this.resturant = resturant;
		this.foodItem = foodItem;
		this.customerName = customerName;
		this.deliveryAddress = deliveryAddress;
	}
	
	public String getResturant() {
		return resturant;
	}
	
	public String getFoodItem() {
		return foodItem;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public String getDeliveryAddress() {
		return deliveryAddress;
	}
}
