package assignments.prob1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCapp {

	public static void main(String[] args) throws SQLException {
		Connection conn=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url="jdbc:mysql://localhost: 3306/sb101_feb";
			String username="root";
			String password="root";
			 conn= DriverManager.getConnection(url, username, password);
			
			String insertStatement="INSERT INTO student(rollNo,name,email,x_per,state) VALUES(15,'Roshan','roshan@masai',65.34,'Uttar Pradesh')";
			
			Statement passthis= conn.createStatement();
			if(passthis.executeUpdate(insertStatement)>0) {
				System.out.println("Data added successfully");
			}else {
				System.out.println("Something went wrong");
			}
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}finally {
			if(conn!=null) {
				try {
					conn.close();
					System.out.println("Connection closed");
				}catch (Exception e) {
					System.out.println("Connection not completed");
					e.printStackTrace();
				}
				
			}
			
			
		}
	}

}
