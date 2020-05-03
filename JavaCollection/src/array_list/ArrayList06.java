package array_list;
import java.util.*;

public class ArrayList06 {
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
		
		// Remove the third element from the list
		list_Strings.remove(2);
		
		// Print the list again
		System.out.println("After removing third element from the list : \n"+list_Strings);
	}
}
