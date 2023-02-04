package day_7StreamClass;

import java.io.File;

public class FileClassDirDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f1=new File("mydir");
		System.out.println("is mydir a folder? "+ f1.exists());
		System.out.println("is mydir a folder "+ f1.isDirectory());
		System.out.println("is mydir is File "+ f1.isFile());
		
		String filenames[]= f1.list();
		System.out.println("Total files and folder in mydir "+ filenames.length);
		
		
	}

}
