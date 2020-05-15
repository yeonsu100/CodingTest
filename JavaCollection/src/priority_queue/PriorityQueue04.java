package priority_queue;

import java.util.PriorityQueue;

public class PriorityQueue04 {
	public static void main(String[] args) {
		PriorityQueue<String> pq=new PriorityQueue<String>();
		pq.add("Elsa");
		pq.add("Anna");
		pq.add("Olaf");
		pq.add("Kristoff");
		pq.add("Sven");
		System.out.println("Original priority queue : "+pq);
		
		// Inserts the specified element into this queue
		pq.offer("FROHANA");
		
		System.out.println("The new priority queue : "+pq);
	}
}
