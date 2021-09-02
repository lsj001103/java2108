package com.example.chapter07;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// ArrayList ������ Ȱ��
		// ArrayList<E> �迭�̸� = new ArrayList<E>();
		
		ArrayList<Book> library = new ArrayList<Book>();
		
		library.add(new Book("�¹���", "���﷡"));
		library.add(new Book("���̾�", "�츣�� �켼"));
		library.add(new Book("��� �� ���ΰ�", "���ù�"));
		library.add(new Book("����", "�ڰ渮"));
		library.add(new Book("�����", "�������丮"));
		
		for(int i=0; i<library.size(); i++) {
			Book book = library.get(i);
			book.showInfo();
		}
		
		for(Book book :library) {
			book.showInfo();
		}

	}

}
