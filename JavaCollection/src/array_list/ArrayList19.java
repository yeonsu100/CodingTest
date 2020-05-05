package array_list;

import java.util.ArrayList;

public class ArrayList19 {
	public static void main(String[] args) {
		ArrayList<String> f1=new ArrayList<String>();
		f1.add("Elsa");
		f1.add("Anna");
		f1.add("Olaf");
		f1.add("Kristoff");
		f1.add("Sven");
		System.out.println("Original array list : "+f1);
		f1.trimToSize();
		System.out.println("Array list after trim : "+f1);
	}
}
