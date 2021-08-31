package com.example.chapter07;

public class ArrayTest {

	public static void main(String[] args) {
		//배열의 선언과 초기화, 인덱스(첨자변수)의 사용
		int[] number = new int [] {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
		for(int i=0; i< number.length; i++) {
			System.out.println(number[i]);
		}
	}

}
