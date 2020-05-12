package treeset;

import java.util.TreeSet;

public class TreeSet03 {
	public static void main(String[] args) {
		TreeSet<String> tree_set1=new TreeSet<String>();
		tree_set1.add("Elsa");
		tree_set1.add("Anna");
		tree_set1.add("Olaf");
		System.out.println("Tree set 1 : "+tree_set1);
		
		TreeSet<String> tree_set2=new TreeSet<String>();
		tree_set2.add("Agnarr");
		tree_set2.add("Iduna");
		tree_set2.add("Jorgenbjorgen");
		System.out.println("Tree set 2 : "+tree_set2);
		
		// adding tree 2 to tree 1
		tree_set1.addAll(tree_set2);
		
		System.out.println("Total tree : "+tree_set1);
	}
}
