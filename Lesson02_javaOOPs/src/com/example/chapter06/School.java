package com.example.chapter06;

public class School {
	//2. Ŭ���� ���ο��� static���� ������ �ν��Ͻ��� ����
	private static School instance = new School();
	//1. �������� access modifier�� private�� �Ѵ�.
	private School( ) {
		// none operation
	}
	
	//3. �ܺο��� ������ �� �ֵ��� public �޼��带 �����.
	public static School getInstance() {
		if(instance == null) {
			instance = new School();
		}
		return instance;
	}

}
