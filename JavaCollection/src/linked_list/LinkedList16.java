package linked_list;
import java.util.*;

public class LinkedList16 {
	public static void main(String[] args) {
		LinkedList<String> l_list=new LinkedList<String>();
		l_list.add("Elsa");
		l_list.add("Anna");
		l_list.add("Olaf");
		l_list.add("Kristoff");
		l_list.add("Sven");
		
		System.out.println
				("Linked list before shuffling :\n "+l_list);
		Collections.shuffle(l_list);
		System.out.println
				("Linked list after shuffling :\n "+l_list);
	}
}
