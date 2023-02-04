package day2assign;

import java.util.Scanner;

public class demoImpl {
	static int convetStringToNumber(String x) {
		return Integer.parseInt(x);
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Any Number : ");
		String s=sc.next();
		
		Demo a= demoImpl :: convetStringToNumber;
		System.out.println(a.convetStringToNumber(s));
//		
		sc.close();
		

	}

}
