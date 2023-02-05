package problem2;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPool implements Callable{
		
	private int roll;
	private String name;
	private int marks;
	
	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}



	public ThreadPool(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}



	@Override
	public Object call() throws Exception {
		if(getMarks()>500) {
			return "PASS";
		}else {
			return "FAIL";
		}
	}
	
	
	public static void main(String[] args) {
		ThreadPool[] jobs= {
			new ThreadPool(1,"monoj",623),
			new ThreadPool(2,"sanoj",432),
			new ThreadPool(3,"Heralal",900),
			new ThreadPool(4,"lalu",200),
			new ThreadPool(5,"Nitish",490),
			new ThreadPool(6,"Mayavati",740)
		};
		
		ExecutorService es= Executors.newFixedThreadPool(2);
		
		for(ThreadPool tp: jobs) {
			Future<ThreadPool> f= service.submit(tp);
		}
	}
		
}
