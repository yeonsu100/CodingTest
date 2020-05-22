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

	}
}
