package com.example.chapter06;

public class School {
	//2. 클래스 내부에서 static으로 유일한 인스턴스를 생성
	private static School instance = new School();
	//1. 생성자의 access modifier를 private르 한다.
	private School( ) {
		// none operation
	}
	
	//3. 외부에서 참조할 수 있도록 public 메서드를 만든다.
	public static School getInstance() {
		if(instance == null) {
			instance = new School();
		}
		return instance;
	}

}
