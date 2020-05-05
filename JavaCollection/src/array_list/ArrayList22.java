package array_list;

import java.util.ArrayList;

public class ArrayList22 {
	public static void main(String[] args) {
		ArrayList<String> f1=new ArrayList<String>();
		f1.add("Elsa");
		f1.add("Anna");
		f1.add("Olaf");
		f1.add("Kristoff");
		f1.add("Sven");
		System.out.println("\nOriginal array list : "+f1);
		System.out.println("\nPrint using index of an element : ");
		int numOfElements=f1.size();
		for(int index=0; index<numOfElements; index++) {
			System.out.println(f1.get(index));
		}
	}
}
