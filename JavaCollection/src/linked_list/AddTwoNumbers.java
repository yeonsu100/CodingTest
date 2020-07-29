package linked_list;

class ListNode {
	int val;
	ListNode next;
	ListNode(int x) {
		this.val=x;
	}
}

public class AddTwoNumbers {
// List Node를 이용하여 예제 완성 
	public static void main(String[] args) {
		ListNode l1=new ListNode(2);
		l1.next=new ListNode(4);
		l1.next.next=new ListNode(3);
		
		ListNode l2=new ListNode(5);
		l2.next=new ListNode(6);
		l2.next.next=new ListNode(2);
		ListNode node=solve(l1, l2);
	}
	
	public static ListNode solve(ListNode l1, ListNode l2) {
		
	}
	
}
