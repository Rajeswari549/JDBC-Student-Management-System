package com.vc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadAllData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		STEP 1:
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//step2
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "root");
			
			//step3    step3,4 always change 1,2 not change
			Statement st = con.createStatement();
			ResultSet res = st.executeQuery("select * from student");
			//step4
			while(res.next())
			{
				System.out.println(res.getInt(1));

				System.out.println(res.getString(2));
				
			System.out.println(	res.getString(3));
			System.out.println("===================================");
			}
			res.close();
			//step 5
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
