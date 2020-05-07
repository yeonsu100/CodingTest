package linked_list;

import java.util.LinkedList;

public class LinkedList10 {
	public static void main(String[] args) {
		LinkedList<String> l_list=new LinkedList<String>();
		l_list.add("Elsa");
		l_list.add("Anna");
		l_list.add("Olaf");
		l_list.add("Kristoff");
		l_list.add("Sven");		
		// Print original list
		System.out.println("Original linked list : "+l_list);
		
		// Find first element of the list
		Object first_element=l_list.getFirst();
		System.out.println("First element is : "+first_element);
		
		// Find last element of the list
		Object last_element=l_list.getLast();
		System.out.println("Last element is : "+last_element);
	}
}
