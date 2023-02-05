package day_7;

public class Common {
	static boolean isPrinterAvaiable= true;
	static boolean isDVDWriterAvaiable= true;
	
	synchronized void occupyPrinter (Common c2) {
//		Check if printer is available or not.
		if(!isPrinterAvaiable) {
//			Print is not available so wait
			try {
				wait();
			}catch(InterruptedException ex) {
				
			}
		}
		System.out.println("Printer is occupied by "+ Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
			
		}catch(InterruptedException ex) {
			
		}
		isPrinterAvaiable = true;
		c2.occupyDVDWriter(this);
		notify();
	}
	synchronized void occupyDVDWriter (Common c1) {
		if(!isDVDWriterAvaiable) {
//			DVDWriter is not available so wait
			try {
				wait();
			}catch(InterruptedException ex) {
				
			}
		}
		System.out.println("DVDWriter is occupied by "+ Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
			
		}catch(InterruptedException ex) {
			
		}
		isDVDWriterAvaiable= true;
		c1.occupyPrinter(this);
		notify();
		}
	
}
class RunOne implements Runnable{
	Common c1,c2;

	public RunOne(Common c1, Common c2) {
		
		this.c1 = c1;
		this.c2 = c2;
	}
	
	@Override
	public void run() {
		
	}
}
