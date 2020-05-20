package hashmap;
import java.util.*;

public class HashMap08 {
	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(1, "Elsa");
		hm.put(2, "Anna");
		hm.put(3, "Olaf");
		hm.put(4, "Kristoff");
		hm.put(5, "Sven");
		
		// print the original map
		System.out.println("The original map : "+hm);
		
		System.out.println("\n1. Is key \'Olaf\' exists?");
		if(hm.containsValue("Olaf")) {
			// value exists
			System.out.println("Yes!");
		}else {
			// value dose NOT exists
			System.out.println("No!");
		}
		
		System.out.println("\n2. Is key 'Mattias' exists?");
		if(hm.containsValue("Mattias")) {
			System.out.println("Yes!");
		}else {
			System.out.println("No!");
		}
	}
}
