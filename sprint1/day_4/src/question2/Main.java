package question2;

public class Main {

	public static void main(String[] args) {
		
		Thread1 t1= new Thread1();
		Thread2 t2= new Thread2(); 

	}

}
class Thread1 extends Thread{
	A a= new A();
	
	

}
class Thread2 extends Thread{
	A a= new A();
}
