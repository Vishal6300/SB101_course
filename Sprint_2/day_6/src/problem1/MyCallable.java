package problem1;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyCallable implements Callable<String>{
	
	int num;
	
	
	public MyCallable(int num) {
		super();
		this.num = num;
	}


	@Override
	public String call() throws Exception {
		System.out.println(Thread.currentThread().getName()+" is finding that the number "+num+" is");
		
		if(num%2!=0) {
			
			return "Odd Number";
		}else {
			
			return "Even Number";
		}
		
	}
	
	public static void main(String[] args) throws Exception {
		MyCallable[] jobs= {
				new MyCallable(10),
				new MyCallable(7),
//				new MyCallable(31),
//				new MyCallable(12),
//				new MyCallable(23),
				new MyCallable(10)
		};
		
		ExecutorService service= Executors.newFixedThreadPool(3);
//		ExecutorService serice2= Executors.newFixedThreadPool(3);
		
		for(MyCallable x: jobs) {
			Future<String> i= service.submit(x);
			Future<String> j= service.submit(x);
			System.out.println(i.get());
//			Thread.currentThread().join();
			System.out.println(j.get());
		}
		
		service.shutdown();
	}
	
}

