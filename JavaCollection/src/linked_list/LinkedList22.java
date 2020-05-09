package linked_list;
import java.util.*;

public class LinkedList22 {
	public static void main(String[] args) {
		LinkedList<String> f1=new LinkedList<String>();
		f1.add("Elsa");
		f1.add("Anna");
		f1.add("Olaf");
		f1.add("Kristoff");
		f1.add("Sven");
		System.out.println("Original linked list : "+f1);
		
		// Check whether the character "Anna" exists or not
		if(f1.contains("Anna")) {
			System.out.println("Anna is present in the linked list.");
		}else {
			System.out.println("Anna is NOT present in the linked list.");
		}
		
		// Check whether the character "Kristen" exists or not
		if(f1.contains("Kristen")) {
			System.out.println("Kristen is present in the linked list.");
		}else {
			System.out.println("Kristen is NOT present in the linked list.");
		}
	}
}
