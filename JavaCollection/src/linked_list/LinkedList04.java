package linked_list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList04 {
	public static void main(String[] args) {
		// Create an empty linked list
		LinkedList<String> l_list=new LinkedList<String>();
		// use add() method to add values in the linked list 
		l_list.add("Elsa");
		l_list.add("Anna");
		l_list.add("Olaf");
		l_list.add("Kristoff");
		l_list.add("Sven");
		
		// print original list
		System.out.println("Original linked list : "+l_list);
		Iterator it=l_list.descendingIterator();
		
		// print list elements in reverse order
		System.out.println("Elements in reverse order : ");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
