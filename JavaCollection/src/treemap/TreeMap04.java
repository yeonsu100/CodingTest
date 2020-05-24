package treemap;
import java.util.*;

public class TreeMap04 {
	public static void main(String[] args) {
		TreeMap<String, String> tm=new TreeMap<String, String>();
		tm.put("Frohana 1", "Elsa");
		tm.put("Frohana 2", "Anna");
		tm.put("Frohana 3", "Olaf");
		tm.put("Frohana 4", "Jorgenbjorgen");
		
		System.out.println(tm);
		
		if(tm.containsValue("Anna")) {
			System.out.println("The Tree Map contains value 'Anna'");
		}else {
			System.out.println("The Tree Map does NOT contain value 'Anna'");
		}
		
		if(tm.containsValue("Kristoff")) {
			System.out.println("The Tree Map contains value 'Kristoff'");
		}else {
			System.out.println("The Tree Map does NOT contain value 'Kristoff'");
		}
	}
}
