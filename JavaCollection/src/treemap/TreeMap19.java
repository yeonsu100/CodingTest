package treemap;
import java.util.*;
import java.util.Map.Entry;

public class TreeMap19 {
	public static void main(String[] args) {
		TreeMap<Integer, String> tm=new TreeMap<Integer, String>();
		tm.put(10, "Elsa");
		tm.put(20, "Anna");
		tm.put(40, "Olaf");
		tm.put(50, "Kristoff");
		tm.put(60, "Sven");
		
		// Polling first entry
		System.out.println("Value before poll : "+tm);
		System.out.println("Value returned : "+tm.pollFirstEntry());
		System.out.println("Value after poll : "+tm);
	}
}
