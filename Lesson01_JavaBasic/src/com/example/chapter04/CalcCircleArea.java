package com.example.chapter04;

import java.util.Scanner;

public class CalcCircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner �Էº��� ����
		// ������ �Է� �޼��� ���
		// ������ �Է�
		// ���� ���� ��� : ������ * ������ * 3.14
		// ���� ���� ���� ���
		
		Scanner input = new Scanner(System.in);
		System.out.println("�������� �Է����ּ��� : ");
		int r = input.nextInt();
		double e = r * r * 3.14;
		
		System.out.printf("���� ���� : %fcm^2", e);

	}


}