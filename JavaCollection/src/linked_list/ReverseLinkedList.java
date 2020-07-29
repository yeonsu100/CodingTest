package linked_list;

class ListNodee {
	int val;
	ListNodee next;
	ListNodee(int x){
		this.val = x;
	}
}

public class ReverseLinkedList {
	public static void main(String[] args) {
		ListNodee l1=new ListNodee(1);
		l1.next=new ListNodee(1);
		l1.next=new ListNodee(2);
		l1.next.next=new ListNodee(3);
		
		printNode(l1);
		ListNodee head=reverseList(l1);
		printNode(head);
	}
	
	public static ListNodee reverseList(ListNodee current) {
		ListNodee prev=null;
		ListNodee next=null;
		
		while(current != null) {
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		return prev;
	}
	
	public static void printNode(ListNodee head) {
		System.out.println("print node : ");
		while(head != null) {
			System.out.println(head.val);
			head=head.next;
		}
		System.out.println();
	}
}
