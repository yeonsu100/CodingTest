package linked_list;
import java.util.*;

public class LinkedList15 {
	public static void main(String[] args) {
		LinkedList<String> l_list=new LinkedList<String>();
		l_list.add("Elsa");
		l_list.add("Anna");
		l_list.add("Olaf");
		l_list.add("Kristoff");
		l_list.add("Sven");
		System.out.println("The original linked list : "+l_list);
		
		// Swapping 1st (index 0) element (Elsa) with the 3rd (index 2) one (Olaf)
		Collections.swap(l_list, 0, 2);
		System.out.println("The new linked list after swap : "+l_list);
	}
}
