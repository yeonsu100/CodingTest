package linked_list;

public class ReverseNodesInKGroup {
	public ListNode reverseKGroup(ListNode head, int k) {
	    if(head==null||k==1)
	        return head;
	 
	    ListNode fake = new ListNode(0);
	    fake.next = head;
	    ListNode prev = fake;
	    int i=0;
	 
	    ListNode p = head;
	    while(p!=null){
	        i++;
	        if(i%k==0){
	            prev = reverse(prev, p.next);
	            p = prev.next;
	        }else{
	            p = p.next; 
	        }
	    }
	 
	    return fake.next; 
	}

	private ListNode reverse(ListNode prev, ListNode next) {
		// TODO Auto-generated method stub
		return null;
	}
}
