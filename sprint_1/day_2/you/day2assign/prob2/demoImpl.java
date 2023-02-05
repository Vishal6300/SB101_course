package day2assign.prob2;

public class demoImpl {

	public demoImpl(Student stu) {
		System.out.println(stu.getName()+" "+" "+stu.getRoll()+stu.getMail()+" "+stu.getMarks());

	}

	public demoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}
	 public static void studentDetails(Student stu) {
		 System.out.println(stu.getName()+" "+stu.getMail()+" "+stu.getMarks()+" "+stu.getRoll());
	 }
	 public void printStudent(Student stu) {
			System.out.println(stu.getName()+" "+stu.getMail()+" "+stu.getMarks()+" "+stu.getRoll());	
		}
	 
	 public static void main(String[] args) {
		 Student stu= new Student( "monu",1, "monu@masai", 450);
			//using constructor
			Demo s = demoImpl :: new;
			s.printDetail(stu);
			
			//using static method
			Demo s2 = demoImpl:: studentDetails;
			s2.printDetail(stu);
			//using non static method
			demoImpl d1= new demoImpl();
			
			Demo s3 = d1 :: printStudent;
			s3.printDetail(stu);
	}
}
