package com.example.chapter04;

import java.util.Scanner;

public class ClacAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("�¾ �ظ� �Է����ּ���.");
		int birthYear = input.nextInt();
		int age = 2021 - birthYear;
		
		System.out.println(age);
		System.out.printf("%d�⿡ �¾ ����� %d��", birthYear, age);
		

	}

}
