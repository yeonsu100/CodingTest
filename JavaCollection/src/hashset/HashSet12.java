package hashset;
import java.util.*;

public class HashSet12 {
	public static void main(String[] args) {
		HashSet<String> h_set=new HashSet<String>();
		h_set.add("Elsa");
		h_set.add("Anna");
		h_set.add("Agnarr");
		h_set.add("Iduna");
		h_set.add("Olaf");
		System.out.println("Original Hash Set contains : "+h_set);
		
		// clear() method removes all the elements from a hash set
		// and the set becomes empty
		h_set.clear();
		
		// Display original hash set content again
		System.out.println("HashSet content : "+h_set);
	}
}
