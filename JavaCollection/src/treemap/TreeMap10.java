package treemap;
import java.util.*;

public class TreeMap10 {
	public static void main(String[] args) {
		TreeMap<String, String> tm=new TreeMap<String, String>();
		tm.put("Frohana 1", "Elsa");
		tm.put("Frohana 2", "Anna");
		tm.put("Frohana 3", "Olaf");
		tm.put("Frohana 4", "Jorgenbjorgen");
		
		System.out.println("Original TreeMap content : "+tm);
		System.out.println
			("Reverse order view of the keys : "+tm.descendingKeySet());
	}
}
