package com.vvit.jdbcprog;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateJdbc {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (
		         // Step 1: Allocate a database 'Connection' object
				Connection conn = DriverManager.getConnection("jdbc://mysql://localhost:3306/b47","root","132001"); 
		 
		         // Step 2: Allocate a 'Statement' object in the Connection
		         Statement stmt = conn.createStatement();
		      ) {
		         // Step 3 & 4: Execute a SQL UPDATE via executeUpdate()
		         //   which returns an int indicating the number of rows affected.
		         // Increase the price by 7% and qty by 1 for id=2
		         String strUpdate = "update books set price = price*1.07, qty = qty+1 where id = 1";
		         System.out.println("The SQL statement is: " + strUpdate + "\n");  // Echo for debugging
		         int countUpdated = stmt.executeUpdate(strUpdate);
		         System.out.println(countUpdated + " records affected.\n");
		 
		         // Step 3 & 4 (again): Issue a SELECT (via executeQuery()) to check the UPDATE.
		         String strSelect = "select * from books where id = 2";
		         System.out.println("The SQL statement is: " + strSelect + "\n");  // Echo for debugging
		         ResultSet rset = stmt.executeQuery(strSelect);
		         while(rset.next()) {   // Move the cursor to the next row
		            System.out.println(rset.getInt("id") + ", "
		                    //+ rset.getString("author") + ", "
		                    + rset.getString("title") + ", "
		                    + rset.getDouble("price") + ", "
		                    + rset.getInt("qty"));
		         }
		      } catch(SQLException ex) {
		         ex.printStackTrace();
		      }  // Step 5: Close conn and stmt - Done automatically by try-with-resources
		   }

}
