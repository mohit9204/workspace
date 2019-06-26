import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class InterThread {
public static void main(String[] args) {
	BlockingQueue<Integer> queue= new ArrayBlockingQueue<Integer>(20);
	Thread producer= new Thread(new Producer(queue),"producer");
	Thread consumer1= new Thread(new Consumer(queue),"Consumer1");
	Thread consumer2= new Thread(new Consumer(queue),"Consumer2");
	
	producer.start();
	consumer1.start();
	consumer2.start();
}
}
