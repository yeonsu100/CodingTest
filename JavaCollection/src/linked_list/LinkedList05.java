package linked_list;

import java.util.LinkedList;

public class LinkedList05 {
	public static void main(String[] args) {
		LinkedList<String> l_list=new LinkedList<String>();
		l_list.add("Elsa");
		l_list.add("Anna");
		l_list.add("Olaf");
		l_list.add("Kristoff");
		l_list.add("Sven");
		
		System.out.println("Original linked list : "+l_list);
		System.out.println("Add the 'Snoggy' after 'Olaf'");
		l_list.add(3, "Snoggy");
		
		// print the list
		System.out.println("The linked list : "+l_list);
	}
}
