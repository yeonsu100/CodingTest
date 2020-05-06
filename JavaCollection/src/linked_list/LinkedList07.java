package linked_list;

import java.util.LinkedList;

public class LinkedList07 {
	public static void main(String[] args) {
		LinkedList<String> l_list=new LinkedList<String>();
		l_list.add("Elsa");
		l_list.add("Anna");
		l_list.add("Olaf");	
		System.out.println("Original linked list : "+l_list);
		
		// Add an element to front of Linked List
		l_list.offerFirst("Frozen");
		System.out.println("Final linked list : "+l_list);
	}
}
