package day2assign.prob2;

public class Student {
	
	private String name;
	private int roll;
	private String mail;
	private int marks;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + ", mail=" + mail + ", marks=" + marks + "]";
	}
	public Student(String name, int roll, String mail, int marks) {
		super();
		this.name = name;
		this.roll = roll;
		this.mail = mail;
		this.marks = marks;
	}
	
	
}
