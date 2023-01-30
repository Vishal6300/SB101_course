package problem4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
		
	public static void main(String[] args) {
		List <String > Names = Arrays.asList("Roshan","Adhikari","Avinash","IA","Vishal","faizal","Aman","Bholu","Marry","Query");

		List<String> filterNames = Names.stream().filter(name -> name.length()>4)
				                       .collect(Collectors.toList());

	     
	     System.out.println(filterNames);
	     // Terminal Methods
	     
	     
	     Names.stream().forEach(name->System.out.println(name));
	}
		     
		}
