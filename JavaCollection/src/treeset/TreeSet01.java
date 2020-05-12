package treeset;

import java.util.TreeSet;

public class TreeSet01 {
	public static void main(String[] args) {
		TreeSet<String> tree_set=new TreeSet<String>();
		tree_set.add("Elsa");
		tree_set.add("Anna");
		tree_set.add("Olaf");
		tree_set.add("Kristoff");
		tree_set.add("Sven");

		System.out.println("Tree set : ");
		System.out.println(tree_set);
	}
}
