package problem3;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		List<String> list= Arrays.asList("Mohan","Sohan","Rohan","Sibu","Sannidayal","dablu","Heralal","Govind","Vedantu","Rambo");
		
//		System.out.println(list);
		
		List<String> transList= list.stream().filter(s -> (s.length()%2==0)).map(m -> m.toUpperCase()).collect(Collectors.toList());
		
//		System.out.println(transList);
		
		transList .sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if(o1.compareTo(o2)>0) return -1;
				else if(o1.compareTo(o2)<0) return 1;
				
				
				else return 0;
			}	 
			 
		});

		System.out.println("Original List");
		 list.forEach(s-> System.out.println(s));  // original list
		 
		 System.out.println("Transformed List");
		 
		 transList.forEach(s->System.out.println(s)); // transformed list
		
	}

}
