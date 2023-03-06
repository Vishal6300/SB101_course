package problem2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		List<Student> list= new ArrayList<>();
		
		list.add(new Student(1,"Rahul",655.43,"New Delhi"));
		list.add(new Student(2,"Munna",493.43,"Manali"));
		list.add(new Student(3,"BhimRao",846.43,"Ladakh"));
		list.add(new Student(4,"Ambedkar",425.32,"Bali"));
		list.add(new Student(5,"Monu",515.73,"Dehradun"));
		
		List<Employee> empList= list.stream().filter(s->s.getMarks()>500)
                .map(s-> new Employee(s.getRoll(),s.getName(),s.getMarks()*10000,s.getAddress()))
                .collect(Collectors.toList());
		
		empList.sort(new Comparator<Employee>(){
			
			@Override
			public int compare(Employee e1, Employee e2) {
			
			
			if(e1.getSalary() < e2.getSalary()) 
			
			return 1;
			
			else if(e1.getSalary() > e2.getSalary())
			
			return -1;
			
			return 0;
			
			
			}	
			
			});
			//Transformed Employee List
			empList.forEach(e->System.out.println(e));
			
			System.out.println();
			//Original Student List
			list.forEach(s -> System.out.println(s));


	}

}
