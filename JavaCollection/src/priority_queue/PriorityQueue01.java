package priority_queue;

import java.util.PriorityQueue;

public class PriorityQueue01 {
	public static void main(String[] args) {
		// Create a new Priority queue
		PriorityQueue<String> queue=new PriorityQueue<String>();
		// use add() method to add values in the queue
		queue.add("Elsa");
		queue.add("Anna");
		queue.add("Olaf");
		queue.add("Kristoff");
		queue.add("Sven");
		
		System.out.println("Elements of the Priority Queue : ");
		System.out.println(queue);
	}
}
