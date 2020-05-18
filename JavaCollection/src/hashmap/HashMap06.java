package hashmap;
import java.util.*;

public class HashMap06 {
	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(1, "Elsa");
		hm.put(2, "Anna");
		hm.put(3, "Olaf");
		hm.put(4, "Kristoff");
		hm.put(5, "Sven");
		
		// print the map
		System.out.println("The original map : "+hm);
		HashMap<Integer, String> new_hm=new HashMap<Integer, String>();
		new_hm=(HashMap)hm.clone();
		System.out.println("Cloned map : "+new_hm);
	}
}
