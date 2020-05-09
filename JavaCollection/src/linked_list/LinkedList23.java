package linked_list;
import java.util.*;

public class LinkedList23 {
	public static void main(String[] args) {
		LinkedList<String> f1=new LinkedList<String>();
		f1.add("Elsa");
		f1.add("Anna");
		f1.add("Olaf");
		f1.add("Kristoff");
		f1.add("Sven");
		System.out.println("Original linked list : "+f1);
		
		// Convert a linked list to array list
		LinkedList<String> f2=new LinkedList<String>(f1);
		
		for(String str : f2) {
			System.out.println(str);
		}
	}
}
