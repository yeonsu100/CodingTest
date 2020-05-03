package array_list;
import java.util.*;

public class ArrayList03 {
	public static void main(String[] args) {
		// Create a list and add some colors to the list
		List<String> list_Strings=new ArrayList<String>();
		list_Strings.add("Red");
		list_Strings.add("Blue");
		list_Strings.add("Black");
		list_Strings.add("White");
		list_Strings.add("Purple");
		list_Strings.add("Orange");
		
		// Print the list
		System.out.println(list_Strings);
		
		// Now insert a color at the first and last position of the list
		list_Strings.add(2, "Green");
		list_Strings.add(5, "Pink");
		
		// Print the list
		System.out.println(list_Strings);		
	}
}
