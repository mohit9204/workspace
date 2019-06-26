import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
	BlockingQueue<Integer> queue;

	public Producer(BlockingQueue<Integer> queue) {
		this.queue = queue;
	}

	private Integer produce() {
		  Integer number = new Integer((int) (Math.random() * 100));
	        System.out.println("Producing number => " + number);
		return number;

	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				queue.put(produce());

				Thread.sleep(500);
			}

			queue.put(-1); 
			System.out.println("Producer STOPPED.");

		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
	}
}
