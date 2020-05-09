package linked_list;

import java.util.LinkedList;

public class LinkedList26 {
	public static void main(String[] args) {
		LinkedList<String> f1=new LinkedList<String>();
		f1.add("Elsa");
		f1.add("Anna");
		f1.add("Olaf");
		f1.add("Kristoff");
		f1.add("Sven");
		System.out.println("Original linked list : "+f1);
		
		// Replacing 3rd element with new value
		f1.set(2, "Snoggy");
		System.out.println("The value of third element changed.");
		System.out.println("New linked list : "+f1);
	}
}
