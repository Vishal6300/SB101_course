package problem3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Roshan","Adhikari","Avinash","IA","Vishal","faizal","Aman","Bholu","Marry","Query");

		
		 List <String> filtered = list.stream().filter(s -> s.length()%2 == 0).map(s -> s.toUpperCase())   
				                               .collect(Collectors.toList());

		 filtered .sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if(o1.compareTo(o2)>0) return -1;
				else if(o1.compareTo(o2)<0) return 1;
				
				
				else return 0;
			}	 
			 
		});


		 list.forEach(s-> System.out.println(s));  // original list
		 
		 System.out.println("-=-==-=-=-=-=--=-=-=--=-==--=-=-=-=");
		 
		 filtered.forEach(s->System.out.println(s)); // transformed list
		 
		 
	}

}
