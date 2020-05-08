package linked_list;
import java.util.*;

public class LinkedList18 {
	public static void main(String[] args) {
		LinkedList<String> f1=new LinkedList<String>();
		f1.add("Elsa");
		f1.add("Anna");
		f1.add("Olaf");
		f1.add("Kristoff");
		f1.add("Sven");
		System.out.println("Original linked list : "+f1);
		
		LinkedList<String> new_f1=new LinkedList<String>();
		new_f1=(LinkedList)f1.clone();
		System.out.println("Cloned linked list : "+new_f1);

	}
}
