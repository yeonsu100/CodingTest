package linked_list;

import java.util.LinkedList;

public class LinkedList02 {
	public static void main(String[] args) {
		LinkedList<String> l_list=new LinkedList<String>();
		l_list.add("Elsa");
		l_list.add("Anna");
		l_list.add("Olaf");
		l_list.add("Kristoff");
		l_list.add("Sven");
		// print the linked list using 'for'
		for(String element : l_list) {
			System.out.println(element);
		}
	}
}
