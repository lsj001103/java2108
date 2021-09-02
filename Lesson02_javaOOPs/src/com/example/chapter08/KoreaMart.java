package com.example.chapter08;

public class KoreaMart {

	public static void main(String[] args) {
		// KoreaMart
		Customer customerLee = new Customer();
		customerLee.setCustomeID(1001);
		customerLee.setCustomerName("이승재");
		customerLee.setBonusPoint(1000);
		System.out.println(customerLee.showCustomerInfo());
		
		Customer customerPark = new VIPCustomer();
		customerPark.setCustomeID(2001);
		customerPark.setCustomerName("박문수");
		customerPark.setBonusPoint(1000);
		System.out.println(customerPark.showCustomerInfo());
		
		System.out.println(customerLee.calcPrice(10000));
		System.out.println(customerPark.calcPrice(10000));

		System.out.println(customerLee.showCustomerInfo());
		System.out.println(customerPark.showCustomerInfo());
		
		
		
	}

}
