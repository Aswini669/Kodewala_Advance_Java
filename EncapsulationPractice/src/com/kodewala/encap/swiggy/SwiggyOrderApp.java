package com.kodewala.encap.swiggy;

public class SwiggyOrderApp {

	public static void main(String[] args) {
		SwiggyOrder swiggy1 = new SwiggyOrder("krishna", "mix veg", "aswini", "btm 1st stage");
		SwiggyOrder swiggy2 = new SwiggyOrder("mahura", "mushroom masala", "nikhil", "hsr");
		SwiggyOrder swiggy3 = new SwiggyOrder("kirti", "paneer curry", "abinash", "btm 2st stage");
		
		System.out.println(swiggy1.getResturant());
		System.out.println(swiggy1.getFoodItem());
		System.out.println(swiggy1.getCustomerName());
		System.out.println(swiggy1.getDeliveryAddress());
		System.out.println("**************-************");
		System.out.println(swiggy2.getResturant());
		System.out.println(swiggy2.getFoodItem());
		System.out.println(swiggy2.getCustomerName());
		System.out.println(swiggy2.getDeliveryAddress());
		System.out.println("**************-************");
		System.out.println(swiggy3.getFoodItem());
		System.out.println(swiggy3.getFoodItem());
		System.out.println(swiggy3.getCustomerName());
		System.out.println(swiggy3.getDeliveryAddress());
	}
}
