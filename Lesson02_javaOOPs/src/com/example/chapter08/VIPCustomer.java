package com.example.chapter08;

public class VIPCustomer extends Customer {
	// Customer 클래스의 속성 외 추가 속성
	private int agentID;
	double saleRatio;
	
	public VIPCustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}
	
	public int calcPrice(int price) { 
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
	
	public int getAgentID( ) {
		return agentID;
	}
	
	public String showCustomerInfo() {
		return customerName + "님 등급 : " + customerGrade + ", 보너스 포인트 : " + bonusPoint;
	}
}
