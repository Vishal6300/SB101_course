package question2;

public class A implements Runnable{

	@Override
	public void run() {
//		int sum=0;
		System.out.println("Odd numbers by "+ Thread.currentThread().getName());
		for(int i=1;i<20;i++) {
			if(i%2==1) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		
	}
	public static void main(String[] args) throws InterruptedException {
		
		A a =new A();
		 Thread t1= new Thread(a);
		 
		 t1.start();
		 
		 t1.join();
		 System.out.println("Even number by Thread "+ Thread.currentThread().getName());
		 for(int i=1;i<20;i++) {
			 
			 if(i%2==0) {
				 System.out.print(i+" ");
			 }
		 }
		
	}
	
}
