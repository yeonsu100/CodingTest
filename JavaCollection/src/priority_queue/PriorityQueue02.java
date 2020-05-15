package priority_queue;

import java.util.PriorityQueue;

public class PriorityQueue02 {
	public static void main(String[] args) {
		PriorityQueue<String> pq=new PriorityQueue<String>();
		pq.add("Elsa");
		pq.add("Anna");
		pq.add("Olaf");
		pq.add("Kristoff");
		pq.add("Sven");
		System.out.println("Elements of the Priority Queue : ");
		
		// iterate the Priority queue
		for(String element:pq) {
			System.out.println(element);
		}
	}
}
