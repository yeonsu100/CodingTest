package hashset;

import java.util.HashSet;

public class HashSet03 {
	public static void main(String[] args) {
		HashSet<String> h_set=new HashSet<String>();
		h_set.add("Elsa");
		h_set.add("Anna");
		h_set.add("Olaf");
		h_set.add("Kristoff");
		h_set.add("Sven");
		
		System.out.println("Original Hash Set : "+h_set);
		System.out.println("Size of the Hash Set : "+h_set.size());
	}
}
