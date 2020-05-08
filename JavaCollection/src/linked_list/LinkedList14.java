package linked_list;
import java.util.*;

public class LinkedList14 {
	public static void main(String[] args) {
		LinkedList<String> l_list=new LinkedList<String>();
		l_list.add("Elsa");
		l_list.add("Anna");
		l_list.add("Olaf");
		l_list.add("Kristoff");
		l_list.add("Sven");
		System.out.println("The original linked list : "+l_list);
		
		// Removing all the elements from the linked list
		l_list.clear();
		
		System.out.println("The new linked list : "+l_list);
	}
}
