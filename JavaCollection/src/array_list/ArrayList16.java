package array_list;

import java.util.ArrayList;

public class ArrayList16 {
	public static void main(String[] args) {
		ArrayList<String> f1=new ArrayList<String>();
			f1.add("Elsa");
			f1.add("Anna");
			f1.add("Olaf");
			f1.add("Kristoff");
			f1.add("Sven");
		System.out.println("Original array list : "+f1);
		
		ArrayList<String> f2=(ArrayList<String>)f1.clone();
		System.out.println("Cloned array list : "+f2);
	}
}
