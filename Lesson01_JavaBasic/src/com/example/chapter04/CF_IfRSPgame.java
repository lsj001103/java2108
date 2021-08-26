package com.example.chapter04;

import java.util.Scanner;

public class CF_IfRSPgame {

	public static void main(String[] args) {
		// 가위 바위 보 게임 만들기
		//  컴퓨터가 내는 수, 사용자가 내는 수를 기억하기 위한 변수를 각각 선언한다.
		int computerNumber, gamerNumber;
		// 승자와 패자를 기록하는 문자열 변수 선언
		String winner = " ", loser = " ";
		//  컴퓨터의 수를 1 ~ 3  숫자 중 하나를 임의로 결정한다.
		computerNumber = (int)(Math.random() * 100) % 3 + 1;
		// 사용자에게 수를 입력하라고 메시지를 출력한다.
		System.out.println("1 : 가위, 2 : 주먹, 3 : 보 중 하나 선택하세요.");
		// 사용자의 수를 입력받는다.
		Scanner input = new Scanner(System.in);
		gamerNumber = input.nextInt();
		
		// 패(수) 비교하기
		switch(gamerNumber) {
		case 1:  // 사용자가 가위를 낸 경우
			if(computerNumber == 1) {
				winner = "same";
				loser = "same";
			}
			else if(computerNumber == 2) {
				winner = "computer";
				loser = "gamer";
			}
			else {
				winner = "gamer";
				loser = "computer";
			}
			break;
		case 2:  // 사용가자 바위를 낸 경우
			if(computerNumber == 1) {
				winner = "gamer";
				loser = "computer";
			}
			else if(computerNumber == 2) {
				winner = "same";
				loser = "same";
			}
			else {
				winner = "computer";
				loser = "gamer";
			}
			break;
		case 3:  // 사용자가 보를 낸 경우
			if(computerNumber == 1) {
				winner = "computer";
				loser = "gamer";
			}
			else if(computerNumber == 2) {
				winner = "gamer";
				loser = "computer";
			}
			else {
				winner = "same";
				loser = "same";
			}
			break;
		default:
			System.out.println("잘못 선택하였습니다.");
			break;
		}
		
		System.out.printf("Winner : %s, Loser : %s\n", winner, loser);
		System.out.printf("Gamer : %d, computer : %d", gamerNumber, computerNumber);
	}// end of main

}// end of class
