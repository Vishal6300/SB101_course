package day_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class IntermediateOperationStreamDemo {

	public static void main(String[] args) {
		List<Integer> list= Arrays.asList(10,10,20,50,73,97,14,35);
		
		list.stream().distinct().forEach(i -> System.out.println(i));
		list.stream().filter(i -> i%2==0).forEach(i -> System.out.print(i+" "));
		System.out.println();
		
		
	List<String> nameList=Arrays.asList("ABC","PQRS","MNOP","JK");
	Function<String, Integer> fn= name -> name.length();
	List<Integer> listLength= nameList.stream().map(fn).collect(Collectors.toList());
	listLength.forEach(i -> System.out.print(i+" "));
	
	System.out.println();
	
	List<Student> studentList= new ArrayList<>();
	studentList.add(new Student(1,"Aarav",650));
	studentList.add(new Student(1,"Sudip",320));
	studentList.add(new Student(1,"Manav",210));
	studentList.add(new Student(1,"Mukesh",670));
	studentList.add(new Student(1,"Inayat",850));
	studentList.add(new Student(1,"Aarav",760));
	
	Comparator<Student> comp= (s1, s2) ->{
		if(s1.getMarks() < s2.getMarks())
			return 1;
		else return -1;
	};
	
	studentList.stream().filter(st -> st.getMarks() >=500).sorted(comp).forEach(System.out:: println);
	}

}
