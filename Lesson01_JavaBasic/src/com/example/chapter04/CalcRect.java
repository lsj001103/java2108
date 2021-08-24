package com.example.chapter04;

import java.util.Scanner;

public class CalcRect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("가로를 입력해주세요 : ");
		int a = input.nextInt();
		System.out.println("세로를 입력해주세요 : ");
		int b = input.nextInt();
		int c = a * b;
		
		System.out.printf("사각형 넓이 : %dcm^2", c);

	}

}
