package com.example.chapter04;

import java.util.Scanner;

public class CF_OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��ĳ�� �Էº��� �غ�
		// �Է� �޼��� ���
		// ���� �Է�
		// �Էµ� ���ڰ� ¦���� ¦���� ���
		// �Էµ� ���ڰ� Ȧ���� Ȧ���� ���
		Scanner input = new Scanner(System.in);
		
		System.out.println("���� ���ڸ� �Է��ϼ���.");
		
		int num = input.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("�Է��� ���ڴ� ¦���Դϴ�.");
			
		}else {
			System.out.println("�Է��� ���ڴ� Ȧ���Դϴ�.");
		}
		
		System.out.println("���α׷� ����.");
		

	}

}
