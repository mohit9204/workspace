
public class StaticCounter {
	 private static int counter = 0;

	    public StaticCounter() {
	    }

	    public static synchronized void addToCounter(final int number) {
	        counter = counter + number;
	        System.out.println("counter value: " + counter);
	    }

	    public static synchronized int getCounter() {
	        return counter;
	    }
}
