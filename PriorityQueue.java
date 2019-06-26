public class PriorityQueue {
	private Comparable[] queue;
	private int index;
	
	
	public PriorityQueue(int capacity){
		this.queue=new Comparable[capacity];
	}
	
	public void insert(Comparable element)
	{
		if(queue.length==index){
			System.out.println("queue is full cant insert element");
			return;
		}
		queue[index]=element;
		index++;
		System.out.println("Element added "+element);
	}
	
	public Comparable remove(){
		if(index==0){
			System.out.println("Queue is empty can't remove element ");
			return 0;
		}
		int maxindex=0;
		for (int i = 1; i < index; i++) {
			if(queue[i].compareTo(queue[maxindex])>0){
				maxindex=i;
			}
		}
		Comparable result= queue[maxindex];
		System.out.println("Element removed from queue is "+ result);
		index--;
		queue[maxindex]=queue[index];
		return result;
	}
public static void main(String[] args) {
	PriorityQueue priority= new PriorityQueue(5);
	 priority.insert(34);
     priority.insert(23);
     priority.insert(5);
     priority.insert(87);
     priority.insert(32);
     priority.remove();
     priority.remove();
     priority.remove();
     priority.remove();
     priority.remove();
	
	priority.remove();
}
}
