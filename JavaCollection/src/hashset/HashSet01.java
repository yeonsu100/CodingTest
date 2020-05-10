package hashset;

import java.util.HashSet;

public class HashSet01 {
	public static void main(String[] args) {
		// Create a empty hash set
		HashSet<String> h_set=new HashSet<String>();
	
		// use add() method to add values in the hash set
		h_set.add("Elsa");
		h_set.add("Anna");
		h_set.add("Olaf");
		h_set.add("Kristoff");
		h_set.add("Sven");

		// print the hash set
		System.out.println("The hash set : "+h_set);
	}
}
