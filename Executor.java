import java.util.concurrent.CountDownLatch;

public class Executor {
	 final static int MAX_COUNT = 10;

	    public static void main(String[] args) throws InterruptedException {

	        System.out.println("starting counter: " + StaticCounter.getCounter());

	      /*  for (int i = 0; i < MAX_COUNT; i++) {

	            new Thread(new Runnable() {
	                @Override
	                public void run() {
	                    StaticCounter.addToCounter(1);
	                }
	            }).start();
	        }
*/

	        CountDownLatch start = new CountDownLatch(1);
	        CountDownLatch finished = new CountDownLatch(MAX_COUNT);

	        for (int i = 0; i < MAX_COUNT; ++i) {
	            new Thread(new Runner(start, finished)).start();
	        }
	        System.out.println("Starting the countdown...");
	        start.countDown(); // Starting all threads... way cool!
	        finished.await();  // Waiting for all threads to finish
	        System.out.println("=====> final count on Runner: " + Runner.count);
	    }
}
