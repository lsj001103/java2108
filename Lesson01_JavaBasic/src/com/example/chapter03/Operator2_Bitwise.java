package com.example.chapter03;

public class Operator2_Bitwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 5, num2 = 10;
		
		int result1 = num1 & num2; // & 연산 0
		int result2 = num1 | num2; // | 연산 15
		int result3 = num1 ^ num2; // ^ XOR 연산 15
		int result4 = ~num2;       // ~ 반전 연산
		
		System.out.println("bitwise");
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
		System.out.println("shift");
		
		int num3 = 5;
		int result5  = num3 >> 2;
		System.out.println(result5);

		int numb = 0b00000100; //2진수
		int numx = 0x11;       //16진수
		int numo = 011;
		System.out.println(numb);
		System.out.println(numx);
		System.out.println(numo);
		
	}

}
