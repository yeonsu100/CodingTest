package hashmap;
import java.util.*;

public class HashMap09 {
	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(1, "Elsa");
		hm.put(2, "Anna");
		hm.put(3, "Olaf");
		hm.put(4, "Kristoff");
		hm.put(5, "Sven");
		
		// create set view for the map
		Set set=hm.entrySet();
		// check set values
		System.out.println("Set values : "+set);
	}
}
