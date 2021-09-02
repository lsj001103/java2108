package com.example.chapter07;

public class ArrayTest {

	public static void main(String[] args) {
		//배열의 선언과 초기화, 인덱스(첨자변수)의 사용
		int[] number = new int [] {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
		int[] number2 = new int[15];
		System.arraycopy(number, 0, number2, 0, 14);
		number[14] = 15;
		
		for(int i=0; i< number.length; i++) {
			System.out.println(number[i]);
		}
		
		System.out.println("advanced for");
		for(int item : number) {
			System.out.println(item);
		}
	}

}
