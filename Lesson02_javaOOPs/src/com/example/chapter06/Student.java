package com.example.chapter06;

public class Student {
	public String studentName;
	public int grade;
	public int money;
	static int classmoney=0;
	
	// constructor
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	//������ Ÿ��
	public void takeBus(Bus bus) {
		bus.take(1500);
		this.money -= 1500;
	}
	
	//���� ������
	public void takeOffBus(Bus bus) {
		bus.takeOff();
	}
	
	public void donate(int money) {
		classmoney += money;
		this.money -= money;
	}
	
	//�л��� ���� ���� ���� Ȯ��
	public void showInfo() {
		System.out.println(studentName + "���� ���� �ܾ� : " + money);
	}
	
	public void showclassMoney() {
		System.out.println(studentName + "�� �б��� �б޺� ���� �ܾ� : " + classmoney);
	}

	
	

}
