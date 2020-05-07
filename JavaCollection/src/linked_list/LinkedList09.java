package linked_list;

import java.util.LinkedList;

public class LinkedList09 {
	public static void main(String[] args) {
		LinkedList<String> l_list=new LinkedList<String>();
		l_list.add("Elsa");
		l_list.add("Anna");
		l_list.add("Olaf");		
		// Print original list
		System.out.println("Original linked list : "+l_list);
		
		// Create an new collection and add some elements
		LinkedList<String> n_list=new LinkedList<String>();
		n_list.add("Kritoff");
		n_list.add("Sven");
		
		// Add the collection in the second position of the existing linked list
		l_list.addAll(2, n_list);
		
		// Print the new list
		System.out.println("New linked list : "+n_list);
	}
}
