package treeset;

import java.util.TreeSet;

public class TreeSet08 {
	public static void main(String[] args) {
		TreeSet<String> tree_set1=new TreeSet<String>();
		tree_set1.add("Elsa");
		tree_set1.add("Anna");
		tree_set1.add("Olaf");
		tree_set1.add("Jorgenbjorgen");
		System.out.println("First Tree set : "+tree_set1);
		
		TreeSet<String> tree_set2=new TreeSet<String>();
		tree_set2.add("Agnarr");
		tree_set2.add("Iduna");
		tree_set2.add("Mattias");
		tree_set2.add("Jorgenbjorgen");
		System.out.println("Second Tree set : "+tree_set2);
		
		// Comparison output in tree set
		TreeSet<String> result_set=new TreeSet<String>();
		for(String element : tree_set1) {
			System.out.println(tree_set2.contains(element) ? "Yes":"No");
		}
	}
}
