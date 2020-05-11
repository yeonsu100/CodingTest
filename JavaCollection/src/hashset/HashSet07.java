package hashset;
import java.util.*;

public class HashSet07 {
	public static void main(String[] args) {
		HashSet<String> h_set=new HashSet<String>();
		h_set.add("Elsa");
		h_set.add("Anna");
		h_set.add("Olaf");
		h_set.add("Kristoff");
		h_set.add("Sven");
		System.out.println("Original Hash Set : "+h_set);
		
		// Creating an Array
		String[] new_array=new String[h_set.size()];
		h_set.toArray(new_array);
		
		// Displaying Array elements
		System.out.println("Array elements : ");
		for(String element : new_array) {
			System.out.println(element);
		}
	}
}
