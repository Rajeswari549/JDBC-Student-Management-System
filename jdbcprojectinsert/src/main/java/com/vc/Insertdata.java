package com.vc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Insertdata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		//STEP 1 LOAD THE DRIVER
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
//			STEP 2 ESTABLISH CONNECION
			
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "root");
//			STEP 3 CREAT STATEMENT
			
			
			PreparedStatement st = con.prepareStatement("insert into student values(?,?,?)");
			//here assinging values through the setters and getters
		
			
			st.setInt(1,502);       //unkown value,our data
		 st.setString(2,"HARDIK");
		st.setString(3,"html");
		
//			STEP 4 EXECUTE QUERY
		
		
		int noofrows = st.executeUpdate();
		System.out.println("no of rows inserted:"+noofrows);
		
//			Step 5 
		
			st.close();
			con.close();
			} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
