package com.vvit.jdbcprog;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@SuppressWarnings("unused")
public class SelectOperation {
public static void main(String[] args) {
	// "jdbc:mysql://localhost:3306/b47","root",132001
	try {
		Connection conn = DriverManager.getConnection("jdbc://mysql://localhost:3306/b47","root","132001");
		Statement st = conn.createStatement();
		String str = "select student_name,usn from student";
		//execute query
		ResultSet rst = st.executeQuery("str");
		System.out.println(" the records are");
		int rowCount=0;
		while(rst.next()) {
			
			String student_name=rst.getString("student_name");
			String usn = rst.getNString("usn");
		}
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	
}

}
