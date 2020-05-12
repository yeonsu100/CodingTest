package treeset;

import java.util.TreeSet;

public class TreeSet02 {
	public static void main(String[] args) {
		TreeSet<String> tree_set=new TreeSet<String>();
		tree_set.add("Elsa");
		tree_set.add("Anna");
		tree_set.add("Olaf");
		tree_set.add("Kristoff");
		tree_set.add("Sven");
		
		// Print the tree list
		for(String element : tree_set) {
			System.out.println(element);
		}
	}
}
