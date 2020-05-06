package linked_list;

import java.util.LinkedList;

public class LinkedList01 {
	public static void main(String[] args) {
		// Create an empty linked list
		LinkedList<String> l_list=new LinkedList<String>();
		// use add() method to add values in the linked list 
		l_list.add("Elsa");
		l_list.add("Anna");
		l_list.add("Olaf");
		l_list.add("Kristoff");
		l_list.add("Sven");
		// print the list
		System.out.println("The linked list : "+l_list);
	}
}
