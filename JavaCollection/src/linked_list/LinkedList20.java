package linked_list;
import java.util.*;

public class LinkedList20 {
	public static void main(String[] args) {
		LinkedList<String> f1=new LinkedList<String>();
		f1.add("Elsa");
		f1.add("Anna");
		f1.add("Olaf");
		f1.add("Kristoff");
		f1.add("Sven");
		System.out.println("Original linked list : "+f1);
		
		// Retrieve but does not remove, the first element of a linked list
		String x=f1.peekFirst();
		System.out.println("First element in the list : "+x);
		System.out.println("Original linked list : "+f1);
	}
}
