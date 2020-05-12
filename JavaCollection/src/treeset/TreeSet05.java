package treeset;

import java.util.TreeSet;

public class TreeSet05 {
	public static void main(String[] args) {
		TreeSet<String> t_set=new TreeSet<String>();
		t_set.add("Elsa");		
		t_set.add("Anna");
		t_set.add("Olaf");
		t_set.add("Kristoff");
		t_set.add("Sven");
		System.out.println("Tree set : ");
		System.out.println(t_set);
		
		// Find first element of the tree set
		Object first_element=t_set.first();
		System.out.println("First Element is "+first_element);
		
		// Find last element of the tree set
		Object last_element=t_set.last();
		System.out.println("Last Element is "+last_element);
	}
}
