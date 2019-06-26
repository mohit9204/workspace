
public class LinkedList {
private Node head;

private void addTolast(Node node){
	Node temp= head;
	while(temp.next!=null){
		temp=temp.next;
	}
	temp.next=node;
}

private void addfirst(Node node){
	Node temp=head;
	head=node;
	temp.next=head;
}

private void addMiddle(Node node){
	Node firstNode=head;
	Node secondNode=head;
	while(firstNode!=null && firstNode.next!=null && firstNode.next.next!=null ){
		secondNode=secondNode.next;
	}
	node.next=secondNode.next;
	secondNode.next=node;
}

private Node deleteFirst(){
	Node temp= head;
	head= head.next;
	return temp;
}

private void deleteAtPosition(int position){
	if (head==null)
		return;
	Node temp= head;
	
	if(position==0){
		head=temp.next;
		return;
	}
	for (int i = 0; temp!=null && i< position-1; i++) {
		
		temp=temp.next;
	}
	if(temp==null && temp.next==null)
		return;
	
	Node node=temp.next.next;
	temp.next=node;
}

private void deleteMiddle(){
	Node firstPointer=head;
	Node secondPointer=head;
	Node prev=null;
	while (firstPointer!=null && firstPointer.next!=null) {
		firstPointer=firstPointer.next.next;
		prev=secondPointer;
		secondPointer=secondPointer.next;
	}
	prev.next=secondPointer.next;
}
private Node deleteLast(){
	Node temp=head;
	Node prev=null;
	while (temp.next!=null) {
		prev=temp;
		temp=temp.next;
	}
	prev.next=null;
	return temp;
}


private void loopDetection(Node head){
	Node firstPtr=head;
	Node secondPtr=head;
	 while(firstPtr!=null){
		 if(firstPtr!=secondPtr){
		 firstPtr=firstPtr.next.next;
		 secondPtr=secondPtr.next;
		 }
		 else 
			 System.out.println("Loop detected");
	 }
	
}
private Node reverseInPairs(Node head, int k){
	 Node head_next=null;
	 Node prev_next=null;
	 Node h=head;
	 int x=k;
	 
	 while(x>0 && h!=null){
		 head_next=h.next;
		 h.next=prev_next;
		 prev_next=h;
		 h=head_next;
		 x--;
	 }
	  if(head_next!=null){
		  head.next=this.reverseInPairs(head_next, k);
	  }
	  return prev_next;
	 
	
}

private Node reverse(Node head){
	Node current= head;
	Node nextNode=null;
	Node previousNode=null;
	while (current!=null) {
		nextNode=current.next;
		current.next=previousNode;
		previousNode=current;
		current=nextNode;
	}
	return nextNode;
}


private Node nthElement(Node head, int n){
	Node firstNode=null;
	Node secondPtr=null;
	for (int i = 0; i < n; i++) {
		firstNode=firstNode.next;
		
	}
	while(firstNode!=null){
		firstNode=firstNode.next;
		secondPtr=secondPtr.next;
	}
	return secondPtr;
}


private Node middleElement(){
	return null;
	
}
public static void main(String[] args) {
	
}

}
