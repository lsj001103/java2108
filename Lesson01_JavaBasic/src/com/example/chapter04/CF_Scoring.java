package com.example.chapter04;

import java.util.Scanner;

public class CF_Scoring {

	public static void main(String[] args) {
		// ������ �Է¹޾�
		// 90�̻��̸� A�����
		// 80�̻��̸� B�����
		// 70�̻��̸� C�����
		// 60�̻��̸� D�����
		// �׿�...F�����
		
		/*
		 * if(����) {}
		 * else if(����2) {}
		 * else if(����n) {}
		 * else {}
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���.");
		
		int sc = input.nextInt();
		
		if(sc >= 90) {
			System.out.println("A���");
		}else if (sc >= 80) {
			System.out.println("B���");
		}else if (sc >= 70) {
			System.out.println("C���");
		}else if (sc >= 60) {
			System.out.println("D���");
		}else {
			System.out.println("F���");
		}
	}

}
