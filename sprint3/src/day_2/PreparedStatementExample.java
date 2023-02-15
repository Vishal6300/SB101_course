package day_2;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Scanner;

public class PreparedStatementExample {
	
	static final String url="jdbc:mysql://localhost:3306/sb101_feb";
	static final String username="root";
	static final String password="root";
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver class not found, check jar file");
			
		}
	}
	static Connection connectToDatabse() throws SQLException{
		return DriverManager.getConnection(url, username,password);
	}
	
	static void CloseConnection(Connection connection) throws SQLException{
		if(connection!= null) {
			connection.close();
		}
	}
	
	
	static boolean updateStudentDetails(String rollNumber, String name, double cgpa, LocalDate registrationDate) throws SQLException {
		
		Connection connection= connectToDatabse();
		String updateStatement="UPDATE students SET name = ?, cgpa= ?, registration_date = ? WHERE roll_number =?";
		
		
//			If you are here means connection is established
			PreparedStatement prepstatement= connection.prepareStatement(updateStatement);
			prepstatement.setString(1, name);
			prepstatement.setDouble(2, cgpa);
			prepstatement.setDate(3, Date.valueOf(registrationDate));
			prepstatement.setString(4, rollNumber);
			
			int result= prepstatement.executeUpdate();
			
			CloseConnection(connection);
			
			return result> 0? true:false;
		
	}
	
	
	static boolean deleteStudentDetails(String rollNumber) throws SQLException{
		
		Connection connection= connectToDatabse();
		String updateStatement="Delete students WHERE roll_number =?";
		
//			If you are here means connection is established
			PreparedStatement prepstatement= connection.prepareStatement(updateStatement);
			
			prepstatement.setString(1, rollNumber);
			
			int result= prepstatement.executeUpdate();
			
			CloseConnection(connection);
		return result >0 ? true: false;
	}
	
	static String getStudentData() throws SQLException {
		Connection connection= connectToDatabse();
		
		String selectStatement ="SELECT roll_number,name,cgpa,registration_date FROM students";
		PreparedStatement statement= connection.prepareStatement(selectStatement);
		
		ResultSet resultSet= statement.executeQuery();
		
		StringBuilder studentDetails= new StringBuilder();
		
		
		if(!resultSet.next()) {
			studentDetails.append("No Student found");
			
		}else {
			do {
				String recordInfo= resultSet.getString(1) +", "+resultSet.getString(2)+", "+resultSet.getString(3)+", "+resultSet.getString(4);
				studentDetails.append(recordInfo);
				
			}while(resultSet.next());
		}
		
		CloseConnection(connection);
		return studentDetails.toString();
		}
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int choice;
		System.out.println("Enter selection"+ "/n" +" 1. Update Student details"+" /n" +" 2.Delete Student");
		choice= sc.nextInt();
		if(choice==1) {
			try {
				System.out.println("Please enter rollNo,name,cgpa and registration date");
				String rollNumber=sc.next();
				String name= sc.next();
				double cgpa= sc.nextDouble();
				LocalDate registrationDate= LocalDate.parse(sc.next());
				
				if(updateStudentDetails(rollNumber,name,cgpa,registrationDate)) {
					System.out.println("Student added succesfully");
				}else {
					System.out.println("No updation");
				}
			}catch (Exception e) {
				
			}
			System.out.println("student added");
		}else if(choice==2) {
			System.out.println("Please enter rollNo");
			String rollNumber=sc.next();
			try {
				if(deleteStudentDetails(rollNumber)) {
					System.out.println("Student deleted Successfully");
				}else {
					System.out.println("No updation");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			System.out.println("Invaild selection");
		}
		sc.close();
	}
}
