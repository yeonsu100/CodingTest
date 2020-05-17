package priority_queue;

import java.util.PriorityQueue;

public class PriorityQueue09 {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();

		pq.add(10);
		pq.add(22);
		pq.add(36);
		pq.add(43);
		pq.add(55);
		pq.add(61);
		pq.add(75);
		pq.add(84);
		pq.add(97);
		
		System.out.println("Original priority queue : "+pq);
		System.out.println("Removes the first element : "+pq.poll());
		System.out.println
			("Priority queue after removing first element : "+pq);
	}
}
