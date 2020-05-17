package priority_queue;

import java.util.PriorityQueue;

public class PriorityQueue11 {
	public static void main(String[] args) {
		PriorityQueue<String> pq=new PriorityQueue<String>();
		pq.add("Anna");
		pq.add("Elsa");
		pq.add("Olaf");
		pq.add("Kristoff");
		pq.add("Sven");
		System.out.println("Original priority queue : "+pq);

		//Convert Priority Queue to a string representation
	   String str;
	   str=pq.toString();
	   System.out.println
	   		("String representation of the priority queue : "+str);
	}
}
