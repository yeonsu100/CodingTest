package array_list;
import java.util.*;

public class ArrayList07 {
	public static void main(String[] args) {
		// Create a list and add some colors to the list
		List<String> list_Strings=new ArrayList<String>();
		list_Strings.add("Red");
		list_Strings.add("Blue");
		list_Strings.add("Black");
		list_Strings.add("White");
		list_Strings.add("Purple");
		list_Strings.add("Orange");
		
		// Search the value Purple
		if(list_Strings.contains("Purple")) {
			System.out.println("Found the element");
		}else {
			System.out.println("There is no element");
		}
	}
}
