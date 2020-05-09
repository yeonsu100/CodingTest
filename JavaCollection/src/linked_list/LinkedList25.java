package linked_list;

import java.util.LinkedList;

public class LinkedList25 {
	public static void main(String[] args) {
		LinkedList<String> f1=new LinkedList<String>();
		f1.add("Elsa");
		f1.add("Anna");
		f1.add("Olaf");
		f1.add("Kristoff");
		f1.add("Sven");
		System.out.println("Original linked list : "+f1);
		System.out.println
			("Check the above linked list is empty or not! "+f1.isEmpty());
		f1.removeAll(f1);
		System.out.println("Linked list after remove all elements "+f1);
		System.out.println
			("Check the above linked list is empty or not! "+f1.isEmpty());

	}
}
