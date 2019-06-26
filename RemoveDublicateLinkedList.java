import java.util.HashSet;

public class RemoveDublicateLinkedList {
	
	private void removeDublicatesSorted(Node head){
		Node p=head;
		Node q=null;
		while (p!=null && p.next!=null) {
			if(p.value==p.next.value){
				q=p.next.next;
				if(q==null){
					p.next=null;
					break;
				}
			p.next=q;
			}
			if(p.value!=p.next.value){
				p=p.next;
			}
		}
	}
	
	private void removeDublicatesUnsorted(Node head){
		Node current=head;
		Node prev=null;
		HashSet set= new HashSet();
		
		while(head!=null){
			int currVal=head.value;
			
			if(set.contains(currVal)){
				prev.next=current.next;
			}else{
				set.add(currVal);
				prev=current;
			}
			current= current.next;
		}
	}
	
public static void main(String[] args) {
	
}
}
