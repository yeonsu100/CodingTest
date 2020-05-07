package linked_list;

import java.util.LinkedList;

public class LinkedList12 {
	public static void main(String[] args) {
		LinkedList<String> l_list=new LinkedList<String>();
		l_list.add("Elsa");
		l_list.add("Anna");
		l_list.add("Olaf");
		l_list.add("Kristoff");
		l_list.add("Sven");
		System.out.println("The original linked list : "+l_list);
		
		// Remove the element in third position from the said linked list
		l_list.remove(2);
		System.out.println("The new linked list : "+l_list);
	}
}
