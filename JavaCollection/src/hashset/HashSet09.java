package hashset;
import java.util.*;

public class HashSet09 {
	public static void main(String[] args) {
		HashSet<String> h_set=new HashSet<String>();
		h_set.add("Elsa");
		h_set.add("Anna");
		h_set.add("Olaf");
		h_set.add("Kristoff");
		h_set.add("Sven");
		System.out.println("Original Hash Set : "+h_set);
		
		// Create a List from HashSet elements
		List<String> list=new ArrayList<String>(h_set);
		
		// Display ArrayList elements
		System.out.println("ArrayList contains : "+list);
	}
}
