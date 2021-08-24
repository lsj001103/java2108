package com.example.chapter04;

import java.util.Scanner;

public class BasicInOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// println() : 라인단위로 출력
		// print()
		// printf()
		
		int a = 10, b = 20;
		System.out.println("Hello");
		System.out.println("Hello" + "Java"); // concatenate(문자열 결합)
		
		System.out.print(a);
		System.out.print(",");
		System.out.print(b);
		System.out.print("\n");
		System.out.print("korea\n");
		
		System.out.printf("%d, %d , %s\n", a, b, "Korea");
		System.out.printf("%10.3f, %o , %s\n", 1.234, b, "Korea");
		
		// 기본 입력
		Scanner read = new Scanner(System.in);
		
		System.out.println("데이터를 입력해주세요...");
		int data = read.nextInt();
		System.out.println(data);
	}

}
