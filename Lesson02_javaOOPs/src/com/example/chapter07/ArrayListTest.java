package com.example.chapter07;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// ArrayList 생성과 활용
		// ArrayList<E> 배열이름 = new ArrayList<E>();
		
		ArrayList<Book> library = new ArrayList<Book>();
		
		library.add(new Book("태백산맥", "조쟁래"));
		library.add(new Book("데미안", "헤르만 헤세"));
		library.add(new Book("어떻게 살 것인가", "유시민"));
		library.add(new Book("토지", "박경리"));
		library.add(new Book("어린왕자", "생택쥐페리"));
		
		for(int i=0; i<library.size(); i++) {
			Book book = library.get(i);
			book.showInfo();
		}
		
		for(Book book :library) {
			book.showInfo();
		}

	}

}
