package com.example.chapter02;

public class Variable4_Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char myChar = 'A'; // 작은따옴표로 묶인 것은 문자
		String yourStr = "Apple"; // 큰따옴표로 묶인 것은 문자열...

		System.out.println(myChar);// char A를 출력
		System.out.println(yourStr);// string A를 출력

		// char 타입 변수는 ascii로 출력할 수 있다.
		System.out.println((int) myChar); // 65

		int newChar = 66;
		// ascii 코드값을 문자로 출력할 수 있다.
		System.out.println((char) newChar); // B

		// 영어알파벳 A~Z까지를 아스키코드를 이용하여 출력
		for (int ch = 65; ch < 91; ch++) {
			System.out.println((char) ch);
		}
		
		char ch1 = '한';
		char ch2 = '\uD55c';
		
		System.out.println(ch1);
		System.out.println(ch2);
	}

}
