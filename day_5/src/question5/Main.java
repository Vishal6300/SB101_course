package question5;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		A a = new A();
		
		Thread t1= new Thread(new B(a));
		Thread t2= new Thread(new B(a));
		Thread t3= new Thread(new B(a));
		
		t1.start();
		
		t1.join();
		t2.start();
		t2.join();
		t3.start();
	}

}
