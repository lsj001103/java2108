package com.example.chapter02;

public class Variable4_Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char myChar = 'A'; // ��������ǥ�� ���� ���� ����
		String yourStr = "Apple"; // ū����ǥ�� ���� ���� ���ڿ�...

		System.out.println(myChar);// char A�� ���
		System.out.println(yourStr);// string A�� ���

		// char Ÿ�� ������ ascii�� ����� �� �ִ�.
		System.out.println((int) myChar); // 65

		int newChar = 66;
		// ascii �ڵ尪�� ���ڷ� ����� �� �ִ�.
		System.out.println((char) newChar); // B

		// ������ĺ� A~Z������ �ƽ�Ű�ڵ带 �̿��Ͽ� ���
		for (int ch = 65; ch < 91; ch++) {
			System.out.println((char) ch);
		}
		
		char ch1 = '��';
		char ch2 = '\uD55c';
		
		System.out.println(ch1);
		System.out.println(ch2);
	}

}
