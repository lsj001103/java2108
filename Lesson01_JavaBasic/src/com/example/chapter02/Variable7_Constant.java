package com.example.chapter02;

public class Variable7_Constant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// constant 상수선언
		final double PI = 3.141592;
		
		char myChar = 'A';
		// explicit type conversion 명시적 형변환
		System.out.println((int)myChar);
		
		// implicit type conversion 묵시적 형변환
		int num1 = 5, num2= 3;
		double num3;
		num3 = num1/ 3.0; // num1은 실수로 형변환이 되어서 사용된다.
		System.out.println(num3);
		// 데이터 타입이 혼합되어 연산에 사용되면, 범위가 좀 더 큰쪽으로 간주된다. 
		

	}

}
