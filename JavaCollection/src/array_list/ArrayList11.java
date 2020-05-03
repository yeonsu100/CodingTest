package array_list;
import java.util.*;

public class ArrayList11 {
	public static void main(String[] args) {
		// Create a list and add some colors to the list
		List<String> list_Strings=new ArrayList<String>();
		list_Strings.add("Red");
		list_Strings.add("Blue");
		list_Strings.add("Black");
		list_Strings.add("White");
		list_Strings.add("Purple");
		list_Strings.add("Orange");
		
		System.out.println("List before reversing:\n" + list_Strings);  
		Collections.reverse(list_Strings);
		System.out.println("List after reversing:\n" + list_Strings);
	}
}
