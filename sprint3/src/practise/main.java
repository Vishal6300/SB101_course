package practise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class main {
	public static void main(String[] args) {
		Connection conn=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/sb101_feb";
			String username="root";
			String password="root";
			
			conn =DriverManager.getConnection(url, username, password);
			String insertdata="INSERT INTO product(pid,pname,quantity,price) VALUES(103,'Ipod',10,1200)";
			
			Statement state= conn.createStatement();
			if(state.executeUpdate(insertdata)>0) {
				System.out.println("Moj kro connection ho gya");
			}else {
				System.out.println("check kro kahan error hai");
			}
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}finally {
			if(conn!=null) {
				try {
					conn.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			}
		}
	}
}
