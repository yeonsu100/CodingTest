package treemap;
import java.util.*;
import java.util.Map.Entry;

public class TreeMap07 {
	public static void main(String[] args) {
		TreeMap<String, String> tm=new TreeMap<String, String>();
		tm.put("Frohana 1", "Elsa");
		tm.put("Frohana 2", "Anna");
		tm.put("Frohana 3", "Olaf");
		tm.put("Frohana 4", "Jorgenbjorgen");
		
		System.out.println(tm);
	}
}

class sort_key implements Comparator<String>{
	@Override
	public int compare(String str1, String str2) {
		return str1.compareTo(str2);
	}
}