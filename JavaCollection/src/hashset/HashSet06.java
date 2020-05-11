package hashset;
import java.util.*;

public class HashSet06 {
	public static void main(String[] args) {
		HashSet<String> h_set=new HashSet<String>();
		h_set.add("Elsa");
		h_set.add("Anna");
		h_set.add("Olaf");
		h_set.add("Kristoff");
		h_set.add("Sven");
		System.out.println("Original Hash Set : "+h_set);
		
		HashSet<String> new_h_set=new HashSet<String>();
		new_h_set=(HashSet)h_set.clone();
		System.out.println("Cloned Hash Set : "+new_h_set);
	}
}
