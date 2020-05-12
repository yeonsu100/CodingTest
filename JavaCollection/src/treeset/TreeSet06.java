package treeset;

import java.util.TreeSet;
import java.util.Iterator;

public class TreeSet06 {
	public static void main(String[] args) {
		TreeSet<String> t_set=new TreeSet<String>();
		t_set.add("Elsa");		
		t_set.add("Anna");
		t_set.add("Olaf");
		t_set.add("Kristoff");
		t_set.add("Sven");
		
		System.out.println("Original tree set : "+t_set);
		TreeSet<String> new_t_set=(TreeSet<String>)t_set.clone();
		System.out.println("Cloned tree list : "+t_set);
	}
}
