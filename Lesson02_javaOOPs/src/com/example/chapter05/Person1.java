package com.example.chapter05;

public class Person1 {
	//member property
	int studentID; //학번
	String studentName; //이름
	int grade; //학년
	String address; //주소
	
	// member function or method
	// 한정자 리턴타입 메서드이름(패러미터){  }
	public void showStudentInfo( ) {
		System.out.println(studentName + "," + address);
	} //end of showStudentInfo()

}
