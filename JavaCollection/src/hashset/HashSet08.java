package hashset;
import java.util.*;

public class HashSet08 {
	public static void main(String[] args) {
		HashSet<String> h_set=new HashSet<String>();
		h_set.add("Elsa");
		h_set.add("Anna");
		h_set.add("Olaf");
		h_set.add("Kristoff");
		h_set.add("Sven");
		System.out.println("Original Hash Set : "+h_set);
		
		// Create a TreeSet of HashSet elements
		Set<String> tree_set=new TreeSet<String>(h_set);
		
		// Display TreeSet elements
		System.out.println("TreeSet elements : ");
		for(String element : tree_set) {
			System.out.println(element);
		}
	}
}
