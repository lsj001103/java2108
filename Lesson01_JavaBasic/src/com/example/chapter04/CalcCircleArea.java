package com.example.chapter04;

import java.util.Scanner;

public class CalcCircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner 입력변수 선언
		// 반지름 입력 메세지 출력
		// 반지름 입력
		// 원의 넓이 계산 : 반지름 * 반지름 * 3.14
		// 계산된 원의 면적 출력
		
		Scanner input = new Scanner(System.in);
		System.out.println("반지름을 입력해주세요 : ");
		int r = input.nextInt();
		double e = r * r * 3.14;
		
		System.out.printf("원의 넓이 : %fcm^2", e);

	}


}