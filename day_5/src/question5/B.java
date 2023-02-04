package question5;

public class B implements Runnable{

	A a;
	
	
	public B(A a) {
		super();
		this.a = a;
	}


	@Override
	public void run() {
		a.sayHello("Vishal");
		
	}

}
