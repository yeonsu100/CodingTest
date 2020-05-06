package linked_list;

import java.util.LinkedList;

public class LinkedList06 {
	public static void main(String[] args) {
		LinkedList<String> l_list=new LinkedList<String>();
		l_list.add("Elsa");
		l_list.add("Anna");
		l_list.add("Olaf");	
		System.out.println("Original linked list : "+l_list);
		
		// Add an element at the beginning
		l_list.addFirst("Frozen cast");
		
		// Add an element at the end of list
		l_list.addLast("Frohana");
		
		System.out.println("Final linked list : "+l_list);
	}
}
