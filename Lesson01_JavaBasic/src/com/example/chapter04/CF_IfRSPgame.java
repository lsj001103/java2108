package com.example.chapter04;

import java.util.Scanner;

public class CF_IfRSPgame {

	public static void main(String[] args) {
		// ���� ���� �� ���� �����
		//  ��ǻ�Ͱ� ���� ��, ����ڰ� ���� ���� ����ϱ� ���� ������ ���� �����Ѵ�.
		int computerNumber, gamerNumber;
		// ���ڿ� ���ڸ� ����ϴ� ���ڿ� ���� ����
		String winner = " ", loser = " ";
		//  ��ǻ���� ���� 1 ~ 3  ���� �� �ϳ��� ���Ƿ� �����Ѵ�.
		computerNumber = (int)(Math.random() * 100) % 3 + 1;
		// ����ڿ��� ���� �Է��϶�� �޽����� ����Ѵ�.
		System.out.println("1 : ����, 2 : �ָ�, 3 : �� �� �ϳ� �����ϼ���.");
		// ������� ���� �Է¹޴´�.
		Scanner input = new Scanner(System.in);
		gamerNumber = input.nextInt();
		
		// ��(��) ���ϱ�
		switch(gamerNumber) {
		case 1:  // ����ڰ� ������ �� ���
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
		case 2:  // ��밡�� ������ �� ���
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
		case 3:  // ����ڰ� ���� �� ���
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
			System.out.println("�߸� �����Ͽ����ϴ�.");
			break;
		}
		
		System.out.printf("Winner : %s, Loser : %s\n", winner, loser);
		System.out.printf("Gamer : %d, computer : %d", gamerNumber, computerNumber);
	}// end of main

}// end of class
