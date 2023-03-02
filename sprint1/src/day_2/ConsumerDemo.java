package day_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		Consumer<String> c= s -> System.out.println(s.toUpperCase());
		c.accept("masai");
		c.accept("India is a great country");
		
		List<Student> studentList= new ArrayList<>();
		
		studentList.add(new Student(1,"ABC",650));
		studentList.add(new Student(2,"DEF",530));
		studentList.add(new Student(3,"GHI",172));
		studentList.add(new Student(4,"JKL",952));
		studentList.add(new Student(5,"MNO",834));
		
//		for(Student student: studentList) {
//			System.out.println(student.getName()+": "+(student.getMarks()));
//			
//		}
		studentList.forEach(st -> System.out.println(st.getName()+": "+ st.getMarks()));
		
		
		Map<Integer, String> map= new HashMap<>();
		
		map.put(1, "Aman");
		map.put(2, "Bhavya");
		map.put(3, "Ratan");
		map.put(4, "Bharti");
		
		map.forEach((i,s)->System.out.println("Roll: "+i+" Name: "+s));
		
	}

}
