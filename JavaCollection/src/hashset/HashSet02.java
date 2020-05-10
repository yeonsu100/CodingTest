package hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet02 {
	public static void main(String[] args) {
		HashSet<String> h_set=new HashSet<String>();
		h_set.add("Elsa");
		h_set.add("Anna");
		h_set.add("Olaf");
		h_set.add("Kristoff");
		h_set.add("Sven");
		
		// set Iterator
		Iterator<String> p=h_set.iterator();
		// Iterator the hash set
		while(p.hasNext()) {
			System.out.println(p.next());
		}
	}
}
