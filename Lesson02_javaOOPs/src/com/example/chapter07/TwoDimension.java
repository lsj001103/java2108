package com.example.chapter07;

public class TwoDimension {

	public static void main(String[] args) {
		// 2차원 배열 다루기
		int[][] array= {{1, 2, 3}, {4, 5, 6}};
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				System.out.printf("%3d", array[i][j]);
			}
			System.out.println();
		}

	}

}
