import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class Consumer implements Runnable {

	BlockingQueue<Integer> queue;

	public Consumer(BlockingQueue<Integer> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		try {
			while (true) {
				 
				Integer number = queue.poll(5,TimeUnit.MILLISECONDS);
				 System.out.println("Consumed by "+Thread.currentThread().getName()+" "+number);

				if (number == null || number == -1) {
					break;
				}

				consume(number);

				Thread.sleep(1000);
			}

			System.out.println("Consumer STOPPED.");
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
	}

	public void consume(Integer number) {
		System.out.println("Consumer consumed " + number);
	}
}
