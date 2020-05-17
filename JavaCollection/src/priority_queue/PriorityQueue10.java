package priority_queue;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueue10 {
	public static void main(String[] args) {
		PriorityQueue<String> pq=new PriorityQueue<String>();
		pq.add("Anna");
		pq.add("Elsa");
		pq.add("Olaf");
		pq.add("Kristoff");
		pq.add("Sven");
		System.out.println("Original priority queue : "+pq);
		
		// Convert a linked list to array list
		List<String> frohana=new ArrayList<String>(pq);
		System.out.println
			("Array containing all of the elements in the queue : "+frohana);
	}
}
