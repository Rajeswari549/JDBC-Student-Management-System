package com.vc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DeleteDta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "root");
			
			PreparedStatement st = con.prepareStatement("delete from student where id=?");
			st.setInt(1, 500);
			
		int noofrows = st.executeUpdate();
		System.out.println("no of rows deleted"+noofrows);
		st.close();
		con.close();
			st.executeQuery();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
