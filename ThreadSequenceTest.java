
public class ThreadSequenceTest implements Runnable {
	 Object o = new Object();
	    volatile boolean t3Only = false;

	    public void run() {
	        synchronized (o) {
	            if (Thread.currentThread().getName().equals("t1")) {
	                doSomething();
	                t3Only = true;
	            } else {
	                if (t3Only) {
	                    if (Thread.currentThread().getName().equals("t3")) {
	                        doSomething();
	                        t3Only = false;
	                        o.notifyAll();
	                    } else {
	                        try {
	                            System.out.println("going to sleep " + Thread.currentThread().getName());
	                            o.wait();
	                            doSomething();
	                        } catch (InterruptedException e) {
	                            e.printStackTrace();
	                        }
	                    }
	                } else {
	                    doSomething();
	                }

	            }
	        }
	    }

	    private void doSomething() {
	        System.out.println(Thread.currentThread().getName());
	    }

	    public static void main(String[] args) throws InterruptedException {
	        ThreadSequenceTest threadSequenceTest = new ThreadSequenceTest();
	        Thread t1 = new Thread(threadSequenceTest);
	        t1.setName("t1");
	        Thread t2 = new Thread(threadSequenceTest);
	        t2.setName("t2");
	        Thread t3 = new Thread(threadSequenceTest);
	        t3.setName("t3");
	        Thread t4 = new Thread(threadSequenceTest);
	        t4.setName("t4");

	        t1.start();
	        Thread.sleep(500);
	        t2.start();
	        t3.start();
	        t4.start();

	    }
}
