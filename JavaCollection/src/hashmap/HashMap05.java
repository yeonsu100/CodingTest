package hashmap;
import java.util.*;

public class HashMap05 {
	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(1, "Elsa");
		hm.put(2, "Anna");
		hm.put(3, "Olaf");
		hm.put(4, "Kristoff");
		hm.put(5, "Sven");
		
		// check if map is empty
		boolean result=hm.isEmpty();
		// check the result
		System.out.println("Is hash map empty? "+result);
		// removing all the elements from the linked map
		hm.clear();
		// check if map is empty
		result=hm.isEmpty();
		// check the result
		System.out.println("Is hash map empty? "+result);
	}
}
