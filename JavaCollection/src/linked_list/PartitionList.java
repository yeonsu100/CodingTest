package linked_list;

public class PartitionList {
	public ListNode partiton(ListNode head, int x) {
		if(head==null) return null;
		
		ListNode fakeHead1=new ListNode(0);
		ListNode fakeHead2=new ListNode(0);
		fakeHead1.next=head;
		
		ListNode p=head;
		ListNode prev=fakeHead1;
		ListNode p2=fakeHead2;
		
		while(p!=null) {
			if(p.val < x) {
				p=p.next;
			}else {
				p2.next=p;
			}
		}

		return fakeHead1.next;
	}
}
