package com.example.chapter06;

public class Bus {
	int busNumber;
	int passengerCount;
	int money;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void takeOff() {
		passengerCount--;
	}
	
	public void showInfo() {
		System.out.println(busNumber + "¹ø ¹ö½º ÇöÀç ½Â°´ : " + passengerCount + ", ÇöÀç ÀÜ¾× : " + money); 
	}

}
