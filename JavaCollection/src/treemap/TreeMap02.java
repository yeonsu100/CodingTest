package treemap;
import java.util.*;

public class TreeMap02 {
	public static void main(String[] args) {
		TreeMap<String, String> tm1=new TreeMap<String, String>();
		tm1.put("Elsa", "Idina");
		tm1.put("Anna", "Kristen");
		tm1.put("Olaf", "Josh");
		tm1.put("Kristoff", "Jonathan");
		tm1.put("Sven", "Jonathan");
		System.out.println("Tree Map 1 : "+tm1);
		
		TreeMap<String, String> tm2=new TreeMap<String, String>();
		tm2.put("Mattias", "Sterling");
		tm2.put("Agnarr", "Alfred");
		tm2.put("Iduna", "Evan");
		tm2.put("Yelena", "Martha");
		tm2.put("Honeymaren", "Rachel");
		System.out.println("Tree Map 2 : "+tm2);
		
		tm1.putAll(tm2);
		System.out.println("After coping map2 to map1"+tm1);
	}
}
