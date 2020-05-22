package treemap;
import java.util.*;

public class TreeMap01 {
	public static void main(String[] args) {
		// Create a tree map
		TreeMap<Integer, String> tm=new TreeMap<Integer, String>();
		
		// Put elements to the map
		tm.put(1, "Elsa");
		tm.put(2, "Anna");
		tm.put(3, "Olaf");
		tm.put(4, "Kristoff");
		tm.put(5, "Sven");
		
		for(Map.Entry<Integer, String> entry : tm.entrySet()) {
			System.out.println(entry.getKey()+" => "+entry.getValue());
		}
	}
}
