package priority_queue;

import java.util.PriorityQueue;

public class PriorityQueue06 {
	public static void main(String[] args) {
		PriorityQueue<String> pq=new PriorityQueue<String>();
		pq.add("Elsa");
		pq.add("Anna");
		pq.add("Olaf");
		pq.add("Kristoff");
		pq.add("Sven");
		System.out.println("Priority queue : "+pq);	
		System.out.println("Size of the priority queue : "+pq.size());
	}
}
