package com.example.chapter04;

import java.util.Scanner;

public class CF_Scoring {

	public static void main(String[] args) {
		// 성적을 입력받아
		// 90이상이면 A등급을
		// 80이상이면 B등급을
		// 70이상이면 C등급을
		// 60이상이면 D등급을
		// 그외...F등급을
		
		/*
		 * if(조건) {}
		 * else if(조건2) {}
		 * else if(조건n) {}
		 * else {}
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		
		int sc = input.nextInt();
		
		if(sc >= 90) {
			System.out.println("A등급");
		}else if (sc >= 80) {
			System.out.println("B등급");
		}else if (sc >= 70) {
			System.out.println("C등급");
		}else if (sc >= 60) {
			System.out.println("D등급");
		}else {
			System.out.println("F등급");
		}
	}

}
