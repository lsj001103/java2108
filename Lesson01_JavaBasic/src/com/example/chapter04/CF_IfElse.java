package com.example.chapter04;

import java.util.Scanner;

public class CF_IfElse {

	public static void main(String[] args) {
		// if else 제어구문 설명
		// if 조건식 {} else {}
		
		// 스캐너 변수 준비
		Scanner input = new Scanner(System.in);
		
		// 메세지 출력
		System.out.println("생년을 입력하세요.");
		
		// 생년입력
		int birthYear = input.nextInt();
		
		// 나이계산
		int age = 2021 - birthYear;
		
		// 계산된 나이가  20보다 작으면 {미성년 처리}
		if(age < 20) {
			System.out.println("머성년이네요.");
			System.out.println("안녕히가세요...");
		}
		
		// 그렇지 않다면 {성년 처리}
		else { 
			System.out.println("성년이네요.");
			System.out.println("술도 팔고, 담배도 팔고...");
		}
		
		System.out.println("프로그램 종료...");
	}

}
