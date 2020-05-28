package treemap;
import java.util.*;
import java.util.Map.Entry;

public class TreeMap21 {
	public static void main(String[] args) {
		// Declare tree maps
		TreeMap<Integer, String> tm=new TreeMap<Integer, String>();
		SortedMap<Integer, String> sub_tm=new TreeMap<Integer, String>();
		
		// Put elements to the map
		tm.put(10, "Elsa");
		tm.put(20, "Anna");
		tm.put(40, "Olaf");
		tm.put(50, "Kristoff");
		tm.put(60, "Sven");
		
		System.out.println("Original TreeMap content : "+tm);
		sub_tm=tm.subMap(20, 50);
		System.out.println("Sub map key-values : "+sub_tm);
	}
}
