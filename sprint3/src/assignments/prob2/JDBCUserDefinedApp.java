package assignments.prob2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCUserDefinedApp {

	public static void main(String[] args) {
		Connection conn=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/sb101_feb";
			String username="root";
			String password="root";
			conn= DriverManager.getConnection(url, username, password);
			
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter product id");
			int proId=sc.nextInt();
			
			System.out.println("Enter product name");
			String proName=sc.next();
			
			System.out.println("Enter quantity");
			int quan=sc.nextInt();
			
			System.out.println("Enter Product Price");
			int proPrice=sc.nextInt();
			
			String insertThis="INSERT INTO Product(pid,pname,quantity,price) VALUES(proId,proName,quan,proPrice)";
			Statement ment=conn.createStatement();
			if(ment.executeUpdate(insertThis)>0) {
				System.out.println("Moj kro");
			}else {
				System.out.println("Dekho kahan error aa gya bro..");
			}
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}finally {
			if(conn!=null) {
				try {
					conn.close();
					System.out.println("Connection closed");
				}catch (Exception e) {
					e.printStackTrace();
					// TODO: handle exception
				}
			}
		}

	}

}
