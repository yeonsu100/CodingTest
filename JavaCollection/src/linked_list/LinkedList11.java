package linked_list;

import java.util.LinkedList;

public class LinkedList11 {
	public static void main(String[] args) {
		LinkedList<String> l_list=new LinkedList<String>();
		l_list.add("Elsa");
		l_list.add("Anna");
		l_list.add("Olaf");
		l_list.add("Kristoff");
		l_list.add("Sven");
		
		System.out.println("Original linked list : "+l_list);
		for(int p=0; p<l_list.size(); p++) {
			System.out.println("Element at index "+p+": "+l_list.get(p));
		}
	}
}
