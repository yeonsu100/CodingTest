package priority_queue;

import java.util.PriorityQueue;

public class PriorityQueue07 {
	public static void main(String[] args) {
		PriorityQueue<String> pq1=new PriorityQueue<String>();
		pq1.add("Anna");
		pq1.add("Elsa");
		pq1.add("Olaf");
		pq1.add("Jorgenbjorgen");
		System.out.println("Priority Queue 1 : "+pq1);
		
		PriorityQueue<String> pq2=new PriorityQueue<String>();
		pq2.add("Agnarr");
		pq2.add("Elsa");
		pq2.add("Iduna");
		pq2.add("Jorgenbjorgen");
		System.out.println("Priority Queue 2 : "+pq2);
		
		// Comparison output in priority queue
		for(String element:pq1) {
			System.out.println(pq2.contains(element) ? "Yes":"No");
		}
	}
}
