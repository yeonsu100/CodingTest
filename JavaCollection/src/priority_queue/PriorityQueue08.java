package priority_queue;

import java.util.PriorityQueue;

public class PriorityQueue08 {
	public static void main(String[] args) {
		// Create priority queue
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();

		// Add numbers in the queue
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
		System.out.println("The first element of the queue : "+pq.peek());
	}
}
