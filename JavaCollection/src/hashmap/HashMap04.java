package hashmap;
import java.util.*;

public class HashMap04 {
	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(1, "Elsa");
		hm.put(2, "Anna");
		hm.put(3, "Olaf");
		hm.put(4, "Kristoff");
		hm.put(5, "Sven");
		
		// print the map
		System.out.println("The Original linked map : "+hm);
		// removing all the elements from the linked map
		hm.clear();
		System.out.println("The new map : "+hm);
	}
}
