package com.masai.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class JDBCDemo {

	public static void main(String[] args) {
		Connection connection=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			ResourceBundle bundle= ResourseBundle.getBundle("dbdetails");
			String url="jdbc:mysql://localhost:3306/sb101_feb";
			String username="root";
			String password="root";
			
			connection =DriverManager.getConnection(url, username, password); 
			
			String InsertQuery= "INSERT INTO student VALUES(?,?,?,?,?)";
			PreparedStatement ps= connection.prepareStatement(InsertQuery);
			
			System.out.println("Enter roll no ");
//			int rollNo= sc.nextInt();
			
		
		} catch (ClassNotFoundException | SQLException e) {
			
			
		}
		

	}

}
