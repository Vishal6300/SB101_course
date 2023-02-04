package day_7StreamClass;

import java.io.File;
import java.io.IOException;

public class FileClassIODemo {
	public static void main(String[] args) throws IOException{
		
		File fileOne= new File("A.txt");
		System.out.println("Is A.txt exists?" + fileOne.exists());
	
		File fileTwo= new File("B.txt");
		System.out.println("Is B.txt exists?"+ fileTwo.exists());
		
		if(!fileTwo.exists()) {
//			If you are here means B.txt is not available.
			fileTwo.createNewFile();
		}
		
		System.out.println("Is B.txt exists?"+ fileTwo.exists());
		System.out.println("folder of B.txt" + fileTwo.isDirectory());
		System.out.println("Path =" + fileTwo.getPath());
		System.out.println("Absolute Path = " + fileTwo.getAbsolutePath());
		
//		fileTwo.delete();
	}
}
