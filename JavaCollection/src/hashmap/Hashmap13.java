package hashmap;
import java.util.*;

public class Hashmap13 {
	public static void main(String[] args) {
		HashMap<String, Integer> hm=new HashMap<String, Integer>();
		hm.put("Elsa", 1);
		hm.put("Anna", 2);
		hm.put("Olaf", 3);
		hm.put("Kristoff", 4);
		hm.put("Sven", 5);
		
		System.out.println("The Original map : "+hm);
		
		System.out.println("\n1. Is key 'Olaf' exists?");
		if(hm.containsKey("Olaf")) {
			System.out.println("Yes, "+hm.get("Olaf"));
		}else {
			System.out.println("No.");
		}
		
		System.out.println("\n2. Is key 'Mattias' exists?");
		if(hm.containsKey("Mattias")) {
			System.out.println("Yes, "+hm.get("Mattias"));
		}else {
			System.out.println("No.");
		}
	}
}
