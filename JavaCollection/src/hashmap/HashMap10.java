package hashmap;
import java.util.*;

public class HashMap10 {
	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(1, "Elsa");
		hm.put(2, "Anna");
		hm.put(3, "Olaf");
		hm.put(4, "Kristoff");
		hm.put(5, "Sven");
		
		// get values of key 3
		String val=(String)hm.get(3);
		// check the value
		System.out.println("Value for key 3 is "+val);
	}
}
