package com.vvit.jdbcprog;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcSelect {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			Connection conn = DriverManager.getConnection("jdbc://mysql://localhost:3306/b47","root","132001");
			Statement st=conn.createStatement();// create a statement
			String  str=" select title,price,qty from book";
			System.out.println("the sql Statement is"+str+"\n");
			ResultSet rset=st.executeQuery(str);
			
			System.out.println("the records are");
			int rowCount=0;
			while(rset.next()) {
				String title=rset.getString("title");
				double price=rset.getDouble("price");
				int qty=rset.getInt("qty");
				System.out.println(title+" ,"+ price+ " " + qty);
				++rowCount;
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
