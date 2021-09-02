package com.example.chapter08;

public class Customer {
	protected int customeID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	public Customer() {
		customerGrade = "Silver";
		bonusRatio = 0.01;
	}
	
	
	
	public int getCustomeID() {
		return customeID;
	}



	public String getCustomerName() {
		return customerName;
	}



	public String getCustomerGrade() {
		return customerGrade;
	}



	public int getBonusPoint() {
		return bonusPoint;
	}



	public double getBonusRatio() {
		return bonusRatio;
	}



	public void setCustomeID(int customeID) {
		this.customeID = customeID;
	}



	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}



	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}



	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}



	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}



	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + "님 등급 : " + customerGrade + ", 보너스 포인트 : " + bonusPoint; 
	}
	
	

}
