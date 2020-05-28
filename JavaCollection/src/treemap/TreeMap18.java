package treemap;
import java.util.*;
import java.util.Map.Entry;

public class TreeMap18 {
	public static void main(String[] args) {
		TreeMap<Integer, String> tm=new TreeMap<Integer, String>();
		tm.put(10, "Elsa");
		tm.put(20, "Anna");
		tm.put(40, "Olaf");
		tm.put(50, "Kristoff");
		tm.put(60, "Sven");
		
		System.out.println("Original TreeMap content : "+tm);
		System.out.println
			("Original TreeMap content (KeySet) : "+tm.navigableKeySet());
	}
}
