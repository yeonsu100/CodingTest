package linked_list;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKSortedLists {
	public static void main(String[] args) {
		public static void main(String[] args) {
			ListNode l1=new ListNode(1);
			l1.next=new ListNode(4);
			l1.next.next=new ListNode(5);

			ListNode l2=new ListNode(1);
			l2.next=new ListNode(3);
			l2.next.next=new ListNode(4);

			ListNode l3=new ListNode(2);
			l3.next=new ListNode(6);

			ListNode[] list=new ListNode[3];
			list[0]=l1;
			list[1]=l2;
			list[2]=l3;
			MergeKSortedLists a=new MergeKSortedLists();
			ListNode result=a.mergeKLists(list);
			System.out.println("======");
		}
		
		public ListNode mergeKSortedLists(ListNode[] lists) {
			// output : 1->1->2->3->4->4->5->6 (오름차순 정렬) 
			PriorityQueue<ListNode> queue=new PriorityQueueM<ListNode>(Comp);
			ListNode newHead=new ListNode(0);	// Dummy Data
			ListNode p=newHead;
			for(ListNode node : lists) {
				if(node!=null) {
					queue.offer(node);
				}
			}
		}
		
		Comparator<ListNode> Comp=new Comparator<ListNode>() {
			@Override
			public int compare(ListNode a, ListNode b) {
				// TODO Auto-generated method stub
				return a.val -b.val;
			}
		};
	}
}
