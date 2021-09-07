package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	static final String JDBCDRV = "com.mysql.cj.jdbc.Driver";
	static final String URL = "jdbc:mysql://localhost:3306/javadb?useUnicode=true";
	static final String DBUSER = "javadb";
	static final String DBPASSWD = "1234";
	
	static Connection dbconn = null;
	public static void DBConnect() {
		try {
			//Step 1. driver loading
			Class.forName(JDBCDRV);
			System.out.println("JDBC Driver 정상적으로 로드되었씁니다.");
			//Step 2/ get connection
			dbconn = DriverManager.getConnection(URL, DBUSER, DBPASSWD);
			System.out.println("DB연결에 성공하였습니다.");
		}
		catch(ClassNotFoundException e1) {
			System.out.println("JDBC Driver 로딩에 실패하였습니다."+ e1.getMessage());
		}
		catch(SQLException e2) {
			System.out.println("DB연결에 실패하였습니다. " +e2.getMessage());
		}
	}// end of DBConnect
	
	public static void DBClose() {
		if(dbconn!=null) {
			try {
				dbconn.close();
				System.out.println("DB연결을 정상적으로 종료합니다.");
			}
			catch(Exception e) {
				System.out.println("DB연결 종료에 오류가 발생하였습니다." + e.getMessage());
			}
		}
	}

}
