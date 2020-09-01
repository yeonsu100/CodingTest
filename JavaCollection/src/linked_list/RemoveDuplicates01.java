package linked_list;

/*
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class RemoveDuplicates01 {
	public ListNode deleteDuplicates(ListNode head) {
		if(head==null || head.next==null) 
			return head;
		
		ListNode prev=head;
		ListNode p=head.next;
		
		while(p!=null) {
			if(p.val==prev.val) {
				prev.next=p.next;
				p=p.next;
				// no charge prev
			}else {
				prev=p;
				p=p.next;
			}
		}
		
		return head;
	}
}
