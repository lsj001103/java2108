package com.example.chapter06;

public class TakeTrans {

	public static void main(String[] args) {
		// 학생이 버스를 타는 실 세계 표현

//		
//		 Student.classmoney = 100000;
//		  
//		 Student hong = new Student("홍길동", 10000); 
//		 Student chun = new Student("성춘향", 50000);
		 School mySchool = School.getInstance();
		 School yourSchool = School.getInstance();
		 School hisSchool = School.getInstance();
		 
		 System.out.println(mySchool);
		 System.out.println(yourSchool);
		 System.out.println(hisSchool);
//		  
//		  hong.showInfo(); hong.showclassMoney();
//		  
//		  hong.donate(1000);
//		  
//		  hong.showInfo(); hong.showclassMoney(); chun.showclassMoney();
//		  
//		  chun.donate(20000);
//		  
//		  hong.showInfo(); hong.showclassMoney(); chun.showclassMoney();
//		 

		// hong.showInfo();
		// chun.showInfo();

		// Bus bus700 = new Bus(700);

		// bus700.showInfo();

		// hong.takeBus(bus700);
		// chun.takeBus(bus700);

		// hong.showInfo();
		// chun.showInfo();
		// bus700.showInfo();

		// hong.takeOffBus(bus700);

		// hong.showInfo();
		// bus700.showInfo();

	}

}
