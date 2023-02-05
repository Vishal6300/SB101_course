package problem2;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		try {
			File file= new File("students.txt");
			if(file.createNewFile()) {
				System.out.println("File created successfully");
			}else {
				System.out.println("File is already present");
				System.out.println("Name of file is " + file.getAbsolutePath());
			}
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		
		

	}

}
