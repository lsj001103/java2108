package com.example.chapter04;

import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
		// Iterative / Loop �ݺ���
		
		// for ���� �̿��� �ݺ�����
		//for(int cnt = 1; cnt <= 10; cnt++) {
			//System.out.println("�ȳ��ϼ���.");
		//}
		/*
		 for(������ʱ��; �ݺ����� ���ǽ�; �����������){
		     �ݺ��� �ڵ���;
		 }
		 */
		// 1~10������ ���ڸ� ����ϴ� ���α׷�
		//for(int n=1; n<=10; n++) {
			//System.out.println(n);
		//}
		
		// 1���� 10������ �հ踦 ���ϼ���.
		//int sum = 0;
		//for(int n=1; n<=10; n++) {
			//sum += n;
			
		//}
		//System.out.println(sum);
		
		// while ��������
		//int sum = 0;
		//int number = 1;
		//while(number<=10) {
			//sum+=number;
			//number++;
		//}
		//System.out.printf("1���� 10������ �� : %d", sum);
		
		// while ���� variation ����
		// do{  } while();
		Scanner input = new Scanner(System.in);
		int jobNumber = 999;
		do {
			System.out.println("1. �ڷ����");
			System.out.println("2. �ڷ���ȸ");
			System.out.println("3. �ڷ����");
			System.out.println("4. �ڷ����");
			System.out.println("0. ���α׷�����");
			
			System.out.println("�۾��� �����ϼ���.");
			jobNumber = input.nextInt();
			System.out.println("�۾���ȣ : " +jobNumber);
		
		}while(jobNumber != 0);
		
		System.out.println("���α׷� ����.");

	}

}
