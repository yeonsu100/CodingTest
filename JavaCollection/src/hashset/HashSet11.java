package hashset;
import java.util.*;

public class HashSet11 {
	public static void main(String[] args) {
		HashSet<String> h_set1=new HashSet<String>();
		h_set1.add("Elsa");
		h_set1.add("Anna");
		h_set1.add("Agnarr");
		h_set1.add("Iduna");
		System.out.println("First HashSet content : "+h_set1);
		
		HashSet<String> h_set2=new HashSet<String>();
		h_set2.add("Olaf");
		h_set2.add("Anna");
		h_set2.add("Agnarr");
		h_set2.add("Mattias");
		System.out.println("Second HashSet content : "+h_set2);
		
		h_set1.retainAll(h_set2);
		System.out.println("****************");
		System.out.println("HashSet content : "+h_set1);
	}
}
