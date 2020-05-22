package hashmap;
import java.util.*;

public class HashMap11 {
	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(1, "Elsa");
		hm.put(2, "Anna");
		hm.put(3, "Olaf");
		hm.put(4, "Kristoff");
		hm.put(5, "Sven");
		
		// get keyset value from map
		Set keyset=hm.keySet();
		// check key set values
		System.out.println("Key set values are "+keyset);
	}
}
