package problem_1;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	
	private int empId;
	private String name;
	private String address;
	private Integer salary;
	
	



	public int getEmpId() {
		return empId;
	}





	public void setEmpId(int empId) {
		this.empId = empId;
	}





	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	public String getAddress() {
		return address;
	}





	public void setAddress(String address) {
		this.address = address;
	}





	public Integer getSalary() {
		return salary;
	}





	public void setSalary(Integer salary) {
		this.salary = salary;
	}





	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}





	public Employee(int empId, String name, String address, Integer salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}





	public static void main(String[] args) {
		
		List<Employee> list= new ArrayList<>();
		
		list.add(new Employee(1001,"suresh","Jhansi",500));
		list.add(new Employee(1002,"mahesh","Jhansi",4000));
		list.add(new Employee(1003,"brajesh","Jhansi",3000));
		list.add(new Employee(1004,"sherkhan","Jhansi",8000));
		list.add(new Employee(1005,"Mogli","Jhansi",5000));
		list.add(new Employee(1006,"dablu","Jhansi",7000));
		list.add(new Employee(1007,"bablu","Jhansi",1000));
		list.add(new Employee(1008,"mohan","Jhansi",2000));
		list.add(new Employee(1009,"sohan","Jhansi",3000));
		list.add(new Employee(1010,"rohan","Jhansi",6000));
		
		for(Employee e1: list) {
			if(e1.getSalary()<5000) {
				e1.setSalary(e1.getSalary()+1000);
			}
			System.out.println(e1);
		}
	}

}
