package linked_list;

class ListNode{
	int val;
	ListNode next;
	ListNode(int x){
		this.val = x;
	}
}

public class ReverseLinkedList {
	public static void main(String[] args) {
		ListNode l1=new ListNode(1);
		l1.next=new ListNode(1);
		l1.next=new ListNode(2);
		l1.next.next=new ListNode(3);
		
		printNode(l1);
		ListNode head=reverseList(l1);
		printNode(head);
	}
	
	public static ListNode reverseList(ListNode current) {
		ListNode prev=null;
		ListNode next=null;
		
		while(current != null) {
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		return prev;
	}
}
