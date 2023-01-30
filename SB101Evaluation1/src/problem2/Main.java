package problem2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		
		
		List<Student> list= new ArrayList<>();
		
		list.add(new Student(1,"Suraj",550,"delhi"));
		list.add(new Student(2,"Shivam",650,"dehradun"));
		list.add(new Student(3,"Soman",350,"mumbai"));
		list.add(new Student(4,"Mony",750,"deoghar"));
		list.add(new Student(5,"Manoj",250,"patna"));
		
		
		List<Employee> emps = list.stream().filter(s->s.getMarks()>500)
                .map(s-> new Employee(s.getRoll(),s.getName(),s.getMarks()*1000,s.getAddress()))
                .collect(Collectors.toList());



		emps.sort(new Comparator<Employee>(){
		
		@Override
		public int compare(Employee e1, Employee e2) {
		
		
		if(e1.getSalary() < e2.getSalary()) 
		
		return 1;
		
		else if(e1.getSalary() > e2.getSalary())
		
		return -1;
		
		return 0;
		
		
		}	
		
		});
		
		emps.forEach(e->System.out.println(e));
		
		System.out.println();
		list.forEach(s -> System.out.println(s));
	}
}
