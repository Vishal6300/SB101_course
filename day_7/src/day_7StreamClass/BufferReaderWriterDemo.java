package day_7StreamClass;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferReaderWriterDemo {

	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new FileReader("b.txt"));
		BufferedWriter wr=new BufferedWriter(new FileWriter("E.txt"));
		
		
		String text= br.readLine();
		wr.write(text);
		wr.newLine();
		
		while(true) {
			int ch= br.read();
			if(ch== -1) {
				break;
//				wr.write(br);
			}
		}

	}

}
