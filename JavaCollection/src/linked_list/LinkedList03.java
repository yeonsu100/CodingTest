package linked_list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList03 {
	public static void main(String[] args) {
		// Create an empty linked list
		LinkedList<String> l_list=new LinkedList<String>();
		// use add() method to add values in the linked list 
		l_list.add("Elsa");
		l_list.add("Anna");
		l_list.add("Olaf");
		l_list.add("Kristoff");
		l_list.add("Sven");
		
		// set Iterator at specified index
		Iterator p=l_list.listIterator(1);
		
		// print list from second position
		while(p.hasNext()) {
			System.out.println(p.next());
		}
	}
}
