package com.example.chapter03;

public class Operator2_Bitwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 5, num2 = 10;
		
		int result1 = num1 & num2; // & ���� 0
		int result2 = num1 | num2; // | ���� 15
		int result3 = num1 ^ num2; // ^ XOR ���� 15
		int result4 = ~num2;       // ~ ���� ����
		
		System.out.println("bitwise");
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
		System.out.println("shift");
		
		int num3 = 5;
		int result5  = num3 >> 2;
		System.out.println(result5);

		int numb = 0b00000100; //2����
		int numx = 0x11;       //16����
		int numo = 011;
		System.out.println(numb);
		System.out.println(numx);
		System.out.println(numo);
		
	}

}
