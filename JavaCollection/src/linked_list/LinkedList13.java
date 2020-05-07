package linked_list;
import java.util.*;

public class LinkedList13 {
	public static void main(String[] args) {
		LinkedList<String> l_list=new LinkedList<String>();
		l_list.add("Elsa");
		l_list.add("Anna");
		l_list.add("Olaf");
		l_list.add("Kristoff");
		l_list.add("Sven");
		System.out.println("The original linked list : "+l_list);
		
		// Remove the first element
		Object firstElement=l_list.removeFirst();
		System.out.println("Element removed : "+ firstElement);
		
		// Remove the last element
		Object lastElement = l_list.removeLast();
	    System.out.println("Element removed : "+ lastElement);
	    
	    System.out.println("The New linked list : " + l_list);
	}
}
