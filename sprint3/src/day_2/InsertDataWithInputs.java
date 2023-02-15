package day_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Scanner;

public class InsertDataWithInputs {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver class not found, check jar file");
			return;
		}
		
		int i=1;
		while(i<5) {
			System.out.println("Please enter rollNo,name,cgpa and registration date");
			String rollNumber=sc.next();
			String name= sc.next();
			double cgpa= sc.nextDouble();
			LocalDate registrationDate= LocalDate.parse(sc.next());
			
			String url="jdbc:mysql://localhost:3306/sb101_feb";
			String username="root";
			String password="root";
			
			String insertdata="INSERT INTO students(roll_number,name,cgpa,registration_date) VALUES('"+ rollNumber +"','"+ name +"','"+ cgpa +"','"+ registrationDate +"')";
			System.out.println(insertdata);
			try(Connection conn =DriverManager.getConnection(url, username, password)) {
//				If you are here means connection is established
				Statement statement= conn.createStatement();
				if(statement.executeUpdate(insertdata)>0) {
					System.out.println("studnet added successfully");
				}else {
					System.out.println("something went wrong");
				}
				
			}catch (SQLException e) {
				e.printStackTrace();
			}
			i++;
		}
//		code to take input from user
		
		sc.close();
	}

}
