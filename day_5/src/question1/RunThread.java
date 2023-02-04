package question1;

public class RunThread implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<25;i++){
			int pri=Thread.currentThread().getPriority();
			String tname= Thread.currentThread().getName();
			System.out.println(tname +": is running with priority of :"+ pri);
			}
		
	}
	
	public static void main(String[] args) {
		RunThread work= new RunThread();
		
		Thread thread1= new Thread(work);
		Thread thread2= new Thread(work);
		
		thread1.setName("Dhoni_Thread");
		thread2.setName("Kohli_Thread");
		
		thread1.setPriority(5);
		thread2.setPriority(10);
		
		thread1.start();
		thread2.start();
	}

}


