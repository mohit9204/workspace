
public class DynamicStack<T extends Object> {
private T[] arr;
private int size;
private int top;


public DynamicStack(int size){
	this.size=size;
	 arr= (T[]) new Object[this.size];
	top=-1;
}
private void push(T i) throws Exception{
	if(this.isFull()){
		this.increaseCapacity();
	}else{
		
		this.arr[++top]=i;
		System.out.println("Element inserted in Stack");
	}

}

private T pop() throws Exception{
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
	T[] arr1= (T[]) new Object[this.size];
	for (int i = 0; i < this.arr.length; i++) {
		arr1[i]=arr[i];
	}
	this.size=size*2;
	this.arr=arr1;
}

public static void main(String[] args) throws Exception {
	DynamicStack<Object> stack= new DynamicStack<Object>(5);
	stack.push(4);
	stack.push(3);
	stack.push(6);
	stack.push("Mohit");
	stack.push(2.34);
	 System.out.println("Poped element "+ stack.pop());
	
}
}
