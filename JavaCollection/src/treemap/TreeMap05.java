package treemap;
import java.util.*;

public class TreeMap05 {
	public static void main(String[] args) {
		TreeMap<String, String> tm=new TreeMap<String, String>();
		tm.put("Frohana 1", "Elsa");
		tm.put("Frohana 2", "Anna");
		tm.put("Frohana 3", "Olaf");
		tm.put("Frohana 4", "Jorgenbjorgen");
		
		Set<String> keys=tm.keySet();
			for(String key : keys) {
				System.out.println(key);
			}
	}
}
