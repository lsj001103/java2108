package com.example.chapter04;

import java.util.Scanner;

public class CalcRect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("���θ� �Է����ּ��� : ");
		int a = input.nextInt();
		System.out.println("���θ� �Է����ּ��� : ");
		int b = input.nextInt();
		int c = a * b;
		
		System.out.printf("�簢�� ���� : %dcm^2", c);

	}

}
