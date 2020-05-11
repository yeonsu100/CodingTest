package hashset;
import java.util.*;

public class HashSet10 {
	public static void main(String[] args) {
		HashSet<String> h_set=new HashSet<String>();
		h_set.add("Elsa");
		h_set.add("Anna");
		h_set.add("Agnarr");
		h_set.add("Iduna");
		h_set.add("Olaf");
		
		HashSet<String> h_set2=new HashSet<String>();
		h_set2.add("Elsa");
		h_set2.add("Anna");
		h_set2.add("jorgenbjorgen");
		h_set2.add("Mattias");
		h_set2.add("Olaf");
		
		// Comparison output in hash set
		HashSet<String> result_set=new HashSet<String>();
		for(String element : h_set) {
			System.out.println
				(h_set2.contains(element) ? "Yes":"No");
		}
	}
}
