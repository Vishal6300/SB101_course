package day_7StreamClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PrintWriterDemo {

	public static void main(String[] args) throws IOException {
		PrintWriter pw= new PrintWriter("F.txt");
//		BufferedReader brr= new BufferedReader(new FileReader("F.txt"));
		pw.write(100);
		pw.println();
		pw.print(100);
		pw.println();
		pw.print("Aao nacho gao jhumo");
		pw.println();
		pw.print(false);
		pw.close();
		
		
		Scanner sc= new Scanner(new FileInputStream("F.txt"));
		System.out.println("Name "+ sc.next());
		System.out.println("Age "+sc.nextInt() );
		sc.close();
	}

}
