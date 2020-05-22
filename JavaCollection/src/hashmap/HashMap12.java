package hashmap;
import java.util.*;

public class HashMap12 {
	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(1, "Elsa");
		hm.put(2, "Anna");
		hm.put(3, "Olaf");
		hm.put(4, "Kristoff");
		hm.put(5, "Sven");
		
		// checking collection view of the map
		System.out.println("Collection view is "+hm.values());
	}
}
