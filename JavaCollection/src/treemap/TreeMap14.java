package treemap;
import java.util.*;

public class TreeMap14 {
	public static void main(String[] args) {
		TreeMap<Integer, String> tm=new TreeMap<Integer, String>();
		tm.put(10, "Elsa");
		tm.put(20, "Anna");
		tm.put(40, "Olaf");
		tm.put(50, "Kristoff");
		tm.put(60, "Sven");
		
		System.out.println("Original TreeMap content : "+tm);
		System.out.println("Checking the entry for 10 : ");
		System.out.println("Key(s) : "+tm.headMap(10, true));
		System.out.println("Checking the entry for 30 : ");
		System.out.println("Key(s) : "+tm.headMap(30, true));
		System.out.println("Checking the entry for 70 : ");
		System.out.println("Key(s) : "+tm.headMap(70, true));
	}
}
