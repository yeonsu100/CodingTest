package linked_list;

import java.util.LinkedList;

public class LinkedList08 {
	public static void main(String[] args) {
		LinkedList<String> l_list=new LinkedList<String>();
		l_list.add("Elsa");
		l_list.add("Anna");
		l_list.add("Olaf");
		l_list.add("Kristoff");
		
		System.out.println("Original linked list : "+l_list);
		// Add an element at the end of a linked list
		l_list.offerLast("Sven");
		System.out.println("Final linked list : "+l_list);
	}
}
