package com.vc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReadOneDta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "root");
			
			PreparedStatement st = con.prepareStatement("select * from student where id=?");
			st.setInt(1, 500);
			//by using this we can retrive the data from table
			
			ResultSet res = st.executeQuery();
			while(res.next())
			{
				System.out.println(res.getInt(1)+"-"+res.getString(2)+"-"+res.getString(3));
				System.out.println("succesfully retived?");
			}
			
			
			res.close();
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
