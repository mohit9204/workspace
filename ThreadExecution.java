
public class ThreadExecution implements Runnable {
	int numberstoPrint=10;
	static int number=1;
	int remainder;
	private static Object object= new Object();
	 
	
	public ThreadExecution( int remainder) {
    this.remainder=remainder;
	}
	
	
	
public static void main(String[] args) {
	ThreadExecution oddRunnable=new ThreadExecution(1);
	ThreadExecution evenRunnable=new ThreadExecution(0);
	//ThreadExecution evenRunnable1=new ThreadExecution(0);

	Thread t1=new Thread(oddRunnable,"t1");
	Thread t2=new Thread(evenRunnable,"t2");
	//Thread t3=new Thread(evenRunnable1,"t3");
	
	t1.start();
	t2.start();
	//t3.start();
}



@Override
public void run() {
	while (number < numberstoPrint-1) {
		synchronized (object) {
			while (number % 2 != remainder) { // wait for numbers other than remainder
				try {
					object.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(Thread.currentThread().getName() + " " + number);
			number++;
			object.notifyAll();
		}
		
	}
}
}
