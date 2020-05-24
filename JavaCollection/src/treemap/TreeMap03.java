package treemap;
import java.util.*;

public class TreeMap03 {
	public static void main(String[] args) {
		TreeMap<String, String> tm=new TreeMap<String, String>();
		tm.put("Frohana 1", "Elsa");
		tm.put("Frohana 2", "Anna");
		tm.put("Frohana 3", "Olaf");
		tm.put("Frohana 4", "Jorgenbjorgen");
		
		System.out.println(tm);
		
		if(tm.containsKey("Frohana 1")) {
			System.out.println("The Tree Map contains key 'Frohana 1'");
		}else {
			System.out.println("The Tree Map does NOT contain key 'Frohana 1'");
		}
		
		if(tm.containsKey("Frohana 5")) {
			System.out.println("The Tree Map contains key 'Frohana 5'");
		}else {
			System.out.println("The Tree Map does NOT contain key 'Frohana 5'");
		}
	}
}
