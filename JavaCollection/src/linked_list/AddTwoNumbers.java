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
		
		while(node != null) {
			System.out.println(node.val);
			node=node.next;
		}
	}
	
	public static ListNode solve(ListNode l1, ListNode l2) {
		// Dummy Data
		ListNode newHead=new ListNode(0);
		ListNode p1=l1, p2=l2, p3=newHead;
		int carry=0;
		
		while(p1!=null || p2!=null) {
			if(p1!=null) {
				carry+=p1.val;
				p1=p1.next;
			}
			
			if(p2!=null) {
				carry+=p2.val;
				p2=p2.next;
			}
			
			p3.next=new ListNode(carry%10);
			p3=p3.next; 	// 넘긴 값을 다시 p3에 담는다 
			carry /= 10;
		}
		
		if(carry==1) p3.next=new ListNode(1);
		
		return newHead.next;
	}
	
}
