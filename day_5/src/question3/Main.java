package question3;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		Thread1 t1= new Thread1();
		Thread2 t2= new Thread2();
		
		t1.setName("Salman");
		t2.setName("Hritik");
		
		t1.start();
		
		t1.join();
		
		t1.sleep(1000);
		
		t2.start();
		

	}

}

class Thread1 extends Thread{

	@Override
	public void run() {
		 System.out.println("Even number by Thread "+ Thread.currentThread().getName());
		 for(int i=1;i<20;i++) {
			 
			 if(i%2==0) {
				 System.out.print(i+" ");
			 }
		 }
	}
	
}

class Thread2 extends Thread{

	@Override
	public void run() {
		System.out.println();
		 System.out.println("Odd number by Thread "+ Thread.currentThread().getName());
		 for(int i=1;i<20;i++) {
			 
			 if(i%2==1) {
				 System.out.print(i+" ");
			 }
		 }
	}
	
}
