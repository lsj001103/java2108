package com.example.chapter04;

import java.util.Scanner;

public class CF_OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 스캐너 입력변수 준비
		// 입력 메세지 출력
		// 숫자 입력
		// 입력된 숫자가 짝수면 짝수로 출력
		// 입력된 숫자가 홀수면 홀수로 출력
		Scanner input = new Scanner(System.in);
		
		System.out.println("임의 숫자를 입력하세요.");
		
		int num = input.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("입력한 숫자는 짝수입니다.");
			
		}else {
			System.out.println("입력한 숫자는 홀수입니다.");
		}
		
		System.out.println("프로그램 종료.");
		

	}

}
