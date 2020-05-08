package linked_list;
import java.util.*;

public class LinkedList17 {
	public static void main(String[] args) {
		LinkedList<String> f1=new LinkedList<String>();
		f1.add("Elsa");
		f1.add("Anna");
		f1.add("Olaf");
		f1.add("Kristoff");
		f1.add("Sven");
		System.out.println("List of first linked list : "+f1);
		
		LinkedList<String> f2=new LinkedList<String>();
		f2.add("Iduna");
		f2.add("Agnarr");
		f2.add("Mattias");
		f2.add("Yelena");
		f2.add("Honeymaren");
		System.out.println("List of second linked list : "+f2);
		
		// Let join above two list
		LinkedList<String> a=new LinkedList<String>();
		a.addAll(f1);
		a.addAll(f2);
		System.out.println("New linked list : "+a);
	}
}
