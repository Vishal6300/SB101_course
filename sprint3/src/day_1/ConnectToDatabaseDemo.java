package day_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectToDatabaseDemo {
	
	public static void main(String[] args) {
		Connection conn=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url="jdbc:mysql://localhost/sb101_feb";
			String username="root";
			String password="root";
			conn= DriverManager.getConnection(url,username,password);
//			System.out.println("Connection successful");
			String insertStatement= "INSERT INTO student(rollNo,name,email,x_per,state) VALUES(12,'Vivek','vivek@francis',33.21,'Jharkhand')";
			
			Statement state= conn.createStatement();
			if(state.executeUpdate(insertStatement) >0) {
				System.out.println("statement added successfully");
			}else {
				System.out.println("something went wrong");
			}
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}finally {
			if(conn!=null) {
				try {
					conn.close();
					System.out.println("Connection closed");
				}catch(SQLException ex) {
					ex.printStackTrace();
				}
			}
		}
		
	}
}
