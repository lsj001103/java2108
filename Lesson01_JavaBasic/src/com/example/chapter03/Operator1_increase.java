package com.example.chapter03;

public class Operator1_increase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b;
		//a = a + 1
		b = ++a;
		// a = a - 1
		a--; // --a
		System.out.println(a);
		System.out.println(b);
		
		// 조건연산자 3항연산
		String result;
		result = 10 > 5 ? "false" : "true";
		System.out.println(result);
		

	}

}
