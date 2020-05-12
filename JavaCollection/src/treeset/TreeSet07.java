package treeset;

import java.util.TreeSet;

public class TreeSet07 {
	public static void main(String[] args) {
		TreeSet<String> t_set=new TreeSet<String>();
		t_set.add("Elsa");		
		t_set.add("Anna");
		t_set.add("Olaf");
		t_set.add("Kristoff");
		t_set.add("Sven");
		
		System.out.println("Original tree set: " + t_set);
	    System.out.println("Size of the tree set: " + t_set.size());
	}
}
