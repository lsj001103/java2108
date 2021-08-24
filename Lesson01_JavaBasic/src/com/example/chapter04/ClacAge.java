package com.example.chapter04;

import java.util.Scanner;

public class ClacAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("태어난 해를 입력해주세요.");
		int birthYear = input.nextInt();
		int age = 2021 - birthYear;
		
		System.out.println(age);
		System.out.printf("%d년에 태어난 당신은 %d세", birthYear, age);
		

	}

}
