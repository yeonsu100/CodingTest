package treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet04 {
	public static void main(String[] args) {
		// Create an empty tree set
		TreeSet<String> t_set=new TreeSet<String>();
		// use add() method to add values in the tree set
		t_set.add("Elsa");		
		t_set.add("Anna");
		t_set.add("Olaf");
		t_set.add("Kristoff");
		t_set.add("Sven");

		// Print original list
		System.out.println("Original tree set : "+t_set);
		Iterator it=t_set.descendingIterator();
		
		// Print list elements in reverse order
		System.out.println("Elements in reverse order : ");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
