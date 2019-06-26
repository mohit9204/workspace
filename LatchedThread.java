import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class LatchedThread extends Thread{
	 private final CountDownLatch startLatch;

	  public LatchedThread(CountDownLatch startLatch) {
	    this.startLatch = startLatch;
	  }
	  public void run() {
	    try {
	    	System.out.println("Thread is running");
	      // ... perform task
	    } finally  {
	    	startLatch.countDown();
	    }
	  }
	  public static void main(String[] args) throws InterruptedException {
		  CountDownLatch startLatch = new CountDownLatch(1);
		  for (int threadNo = 0; threadNo < 4; threadNo++) {
		    Thread t = new LatchedThread(startLatch);
		    t.start();
		  }
		  // give the threads chance to start up; we could perform
		  // initialisation code here as well.
		
		  startLatch.await(20, TimeUnit.MILLISECONDS);
	}
}
