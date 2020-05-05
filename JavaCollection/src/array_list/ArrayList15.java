package array_list;

import java.util.ArrayList;

public class ArrayList15 {
	public static void main(String[] args) {
		ArrayList<String> c1=new ArrayList<String>();
			c1.add("Red");
			c1.add("Orange");
			c1.add("Yellow");
			c1.add("Green");
		System.out.println("List of first array : "+c1);
			
		ArrayList<String> c2=new ArrayList<String>();
			c2.add("Blue");
			c2.add("Navy");
			c2.add("Purple");
		System.out.println("List of second array : "+c2);
		
		// Join above two lists
		ArrayList<String> c3=new ArrayList<String>();
			c3.addAll(c1);
			c3.addAll(c2);
		System.out.println("New array : "+c3);
	}
}
