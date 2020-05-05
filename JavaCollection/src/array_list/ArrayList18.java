package array_list;

import java.util.ArrayList;

public class ArrayList18 {
	public static void main(String[] args) {
		ArrayList<String> f1=new ArrayList<String>();
		f1.add("Elsa");
		f1.add("Anna");
		f1.add("Olaf");
		f1.add("Kristoff");
		f1.add("Sven");
	System.out.println("Original array list : "+f1);
	System.out.println
		("Checking the above array list is empty or not => "+f1.isEmpty());
	f1.removeAll(f1);
	System.out.println("Array list after remove all elements : "+f1);
	System.out.println
		("Checking the above array list is empty or not => "+f1.isEmpty());
	}
}
