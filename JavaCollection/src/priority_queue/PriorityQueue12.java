package priority_queue;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueue12 {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq
			=new PriorityQueue<>(10, Collections.reverseOrder());
		
		pq.add(10);
		pq.add(22);
		pq.add(36);
		pq.add(43);
		pq.add(55);
		pq.add(61);
		pq.add(75);
		pq.add(84);
		pq.add(97);
		System.out.println("\nOriginal priority queue : "+pq);
		
		System.out.println("\nMaximum priority queue : ");
		Integer val=null;
		while((val=pq.poll()) != null) {
			System.out.print(val+" ");
		}
		System.out.print("\n");
	}
}
