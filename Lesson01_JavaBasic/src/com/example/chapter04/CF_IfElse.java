package com.example.chapter04;

import java.util.Scanner;

public class CF_IfElse {

	public static void main(String[] args) {
		// if else ����� ����
		// if ���ǽ� {} else {}
		
		// ��ĳ�� ���� �غ�
		Scanner input = new Scanner(System.in);
		
		// �޼��� ���
		System.out.println("������ �Է��ϼ���.");
		
		// �����Է�
		int birthYear = input.nextInt();
		
		// ���̰��
		int age = 2021 - birthYear;
		
		// ���� ���̰�  20���� ������ {�̼��� ó��}
		if(age < 20) {
			System.out.println("�Ӽ����̳׿�.");
			System.out.println("�ȳ���������...");
		}
		
		// �׷��� �ʴٸ� {���� ó��}
		else { 
			System.out.println("�����̳׿�.");
			System.out.println("���� �Ȱ�, ��赵 �Ȱ�...");
		}
		
		System.out.println("���α׷� ����...");
	}

}
