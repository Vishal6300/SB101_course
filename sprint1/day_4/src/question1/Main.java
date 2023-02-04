package question1;

public class Main {

	public static void main(String[] args) {
		
		ThreadA t1= new ThreadA();
		ThreadB t2= new ThreadB();
		ThreadC t3= new ThreadC();
		
		t1.setName("salman");
		t2.setName("Hritik");
		t3.setName("Akshay");
		
		t1.start();
		t2.start();
		t3.start();

	}
	
	

}
class ThreadA extends Thread{
	int sum=0;
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			sum+=i;
		}
		System.out.println("Salman sum is "+ sum);
	}
	
	
}

class ThreadB extends Thread{
	@Override
	public void run() {
		int product=1;
		for(int i=1;i<=10;i++) {
			product*=i;
		}
		System.out.println("Hritik thread multiple of 10 Numbers is "+product);
	}
}

class ThreadC extends Thread{
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}
