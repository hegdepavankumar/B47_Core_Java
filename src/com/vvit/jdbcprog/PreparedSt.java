package com.vvit.jdbcprog;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedSt {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Connection con = null;// con is an object to establish the connection
	        PreparedStatement prSt = null;
	        try {
	          //  Class.forName("oracle.jdbc.driver.OracleDriver");// load and register the drivers
	            con = DriverManager.getConnection("root","132001", null); 
	           		 
	            String query = "insert into employee(id,firstname,lastname) values(?,?,?)";
	            prSt = con.prepareStatement(query);
	            
	            prSt.setInt(1, 75);
	            prSt.setString(2, "Manu");
	            prSt.setString(3, "kumar");
	            //count will give you how many records got updated
	            int count = prSt.executeUpdate();
	           
	            //Run the same query with different values
	            prSt.setInt(1, 55);
	            prSt.setString(2, "jyoti");
	            prSt.setString(3, "sharma");
	            count = prSt.executeUpdate();
	            System.out.println("no of records updated"+count);
	            
//	        } catch (ClassNotFoundException e) {
//	            // TODO Auto-generated catch block
//	            e.printStackTrace();
	        } catch (SQLException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        } 
//	            finally{
//	            try{
//	                if(prSt != null) prSt.close();
//	                if(con != null) con.close();
//	            } catch(Exception ex){}
//	        }
		
		 
     }

}
