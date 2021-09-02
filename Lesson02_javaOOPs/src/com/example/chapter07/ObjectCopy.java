package com.example.chapter07;

public class ObjectCopy {

	public static void main(String[] args) {
		// ����������ü �迭�� ����
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		// ���� bookArray1 �ʱ�ȭ
		bookArray1[0] = new Book("�¹���", "������");
		bookArray1[1] = new Book("���̾�", "������");
		bookArray1[2] = new Book("��� �� ���ΰ�", "���ù�");
		
		
		bookArray2[0] = new Book();
		bookArray2[1] = new Book();
		bookArray2[2] = new Book();
		
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		for(int i=0; i<bookArray2.length; i++) {
			bookArray2[i].setBookName(bookArray1[i].getBookName());
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
		}
		// �纻 bookArray2�� ����Ȯ��
		for(int i=0; i<bookArray2.length; i++) {
			bookArray2[i].showInfo();
		}
		
		// ���� bookArray1�� ���� ����
		bookArray1[0].setBookName("����");
		bookArray1[0].setAuthor("�ڿϼ�");
		
		for(int i=0; i<bookArray1.length; i++) {
			bookArray1[i].showInfo();
		}
		
		System.out.println("===========");
		// �纻 bookArray2�� ���� Ȯ��
		for(int i=0; i<bookArray2.length; i++) {
			bookArray2[i].showInfo();
			
		}
		
		System.out.println("�� �迭 Ȯ��");
		// �纻 bookArray2�� ���� Ȯ��
		for(int i=0; i<bookArray1.length; i++) {
			System.out.println(bookArray1[i] + ":" + bookArray2[i]);
			
		}


	}

}
