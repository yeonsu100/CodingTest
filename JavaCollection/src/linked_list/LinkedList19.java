package linked_list;
import java.util.*;

public class LinkedList19 {
	public static void main(String[] args) {
		LinkedList<String> f1=new LinkedList<String>();
		f1.add("Elsa");
		f1.add("Anna");
		f1.add("Olaf");
		f1.add("Kristoff");
		f1.add("Sven");
		System.out.println("Original linked list : "+f1);
		
		System.out.println("Removed element : "+f1.pop());
		
		System.out.println("Linked list after pop operation : "+f1);
	}
}
