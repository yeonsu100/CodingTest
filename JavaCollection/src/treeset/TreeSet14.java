package treeset;

import java.util.TreeSet;

public class TreeSet14 {
	public static void main(String[] args) {
		// Creating TreeSet
		TreeSet<Integer> tree_num=new TreeSet<Integer>();
		TreeSet<Integer> tree_headset=new TreeSet<Integer>();
		
		// Add numbers in the tree
		tree_num.add(10);
		tree_num.add(22);
		tree_num.add(36);
		tree_num.add(43);
		tree_num.add(55);
		tree_num.add(61);
		tree_num.add(75);
		tree_num.add(84);
		tree_num.add(97);
		
		System.out.println("Original tree set : "+tree_num);
		System.out.println
			("Removes the first(lowest) element : "+tree_num.pollFirst());
		System.out.println
			("Tree set after removing first element : "+tree_num);
	}
}
