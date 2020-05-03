package array_list;
import java.util.*;

public class ArrayList09 {
	public static void main(String[] args) {
		List<String> List1=new ArrayList<String>();
		List1.add("1");
		List1.add("2");
		List1.add("3");
		List1.add("4");
		System.out.println("List 1 : "+List1);
		
		List<String> List2=new ArrayList<String>();
		List1.add("A");
		List1.add("B");
		List1.add("C");
		List1.add("D");
		System.out.println("List 2 : "+List2);
		
		// Copy List 2 to List 1
		Collections.copy(List1, List2);
		System.out.println("Copy List to List2,\nAfter copy : ");
		System.out.println("List 1 : "+List1);
		System.out.println("List 2 : "+List2);
	}
}
