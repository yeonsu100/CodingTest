package hashset;
import java.util.*;

public class HashSet05 {
	public static void main(String[] args) {
		HashSet<String> h_set=new HashSet<String>();
		h_set.add("Elsa");
		h_set.add("Anna");
		h_set.add("Olaf");
		h_set.add("Kristoff");
		h_set.add("Sven");

		System.out.println("Original Hash Set : "+h_set);
		System.out.println
			("Check the above array list is empty or not! "+h_set.isEmpty());
		System.out.println("Remove all the elements from a Hash Set : ");
		h_set.removeAll(h_set);
		System.out.println
			("Hash Set after removing all the elements : "+h_set);
	}
}
