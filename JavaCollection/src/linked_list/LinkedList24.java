package linked_list;
import java.util.*;

public class LinkedList24 {
	public static void main(String[] args) {
		LinkedList<String> f1=new LinkedList<String>();
		f1.add("Elsa");
		f1.add("Anna");
		f1.add("Olaf");
		f1.add("Kristoff");
		f1.add("Sven");
		
		LinkedList<String> f2=new LinkedList<String>();
		f2.add("Elsa");
		f2.add("Anna");
		f2.add("Olaf");
		f2.add("Kristen");
		
		// Comparison output in linked list
		LinkedList<String> f3=new LinkedList<String>();
		for(String e : f1) {
			f3.add(f2.contains(e) ? "Yes" : "No");
		System.out.println(f3);
		}
	}
}
