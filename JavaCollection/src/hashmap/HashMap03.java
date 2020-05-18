package hashmap;
import java.util.*;

public class HashMap03 {
	public static void main(String[] args) {
		// Create two hash maps
		HashMap<Integer, String> hm1=new HashMap<Integer, String>();
		HashMap<Integer, String> hm2=new HashMap<Integer, String>();

		// populate hash maps
		hm1.put(1, "Elsa");
		hm1.put(2, "Anna");
		hm1.put(3, "Olaf");
		System.out.println("\nValues in first map : "+hm1);
		
		hm2.put(4, "Agnarr");
		hm2.put(5, "Iduna");
		hm2.put(6, "Jorgenbjorgen");
		System.out.println("\nValues in second map : "+hm2);
		
		// put all values in secondmap
		hm2.putAll(hm1);
		System.out.println("\nNow values in second map : "+hm2);
	}
}
