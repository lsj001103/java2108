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
			System.out.println("JDBC Driver ���������� �ε�Ǿ����ϴ�.");
			//Step 2/ get connection
			dbconn = DriverManager.getConnection(URL, DBUSER, DBPASSWD);
			System.out.println("DB���ῡ �����Ͽ����ϴ�.");
		}
		catch(ClassNotFoundException e1) {
			System.out.println("JDBC Driver �ε��� �����Ͽ����ϴ�."+ e1.getMessage());
		}
		catch(SQLException e2) {
			System.out.println("DB���ῡ �����Ͽ����ϴ�. " +e2.getMessage());
		}
	}// end of DBConnect
	
	public static void DBClose() {
		if(dbconn!=null) {
			try {
				dbconn.close();
				System.out.println("DB������ ���������� �����մϴ�.");
			}
			catch(Exception e) {
				System.out.println("DB���� ���ῡ ������ �߻��Ͽ����ϴ�." + e.getMessage());
			}
		}
	}

}
