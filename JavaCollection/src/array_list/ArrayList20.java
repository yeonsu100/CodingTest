package array_list;

import java.util.ArrayList;

public class ArrayList20 {
	public static void main(String[] args) {
		ArrayList<String> f1=new ArrayList<String>();
		f1.add("Elsa");
		f1.add("Anna");
		f1.add("Olaf");
		System.out.println("Original array list : "+f1);
		
		// Increase capacity to 6
		f1.ensureCapacity(6);
		f1.add("Agnarr");
		f1.add("Iduna");
		f1.add("Mattias");
		
		System.out.println("New array list : "+f1);
	}
}
