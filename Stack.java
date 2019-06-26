
public class Stack {
	private int[] arr;
	private int size;
	private int top;
	 
	
	public Stack(int size){
		this.size=size;
		this.arr=new int[size];
		top=-1;
	}
	private void push(int i) throws Exception{
		if(this.isFull()){
			this.increaseCapacity();
		}else{
			top++;
			arr[top]=i;
			System.out.println("Element inserted in Stack");
		}

	}
	
	private int pop() throws Exception{
		if(this.isEmpty()){
			throw new Exception("Stck is Empty");
		}else
			return arr[top--];
			
		}
	private boolean isFull(){
		if(top==size-1){
			return true;
		}
		return false;
	}
	
	private boolean isEmpty(){
		if(top==-1){
			return true;
		}
		return false;
	}
	
	private void increaseCapacity(){
		int[] arr1= new int[this.size*2];
		for (int i = 0; i < this.arr.length; i++) {
			arr1[i]=arr[i];
		}
		this.size=size*2;
		this.arr=arr1;
	}
	
public static void main(String[] args) throws Exception {
	Stack stack= new Stack(2);
	stack.push(3);
	stack.push(4);
	stack.push(5);
	System.out.println("Stack size");
	System.out.println("Poped element "+stack.pop());
}
}
