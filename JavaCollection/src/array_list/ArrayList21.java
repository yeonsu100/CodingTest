package array_list;

import java.util.ArrayList;

public class ArrayList21 {
	public static void main(String[] args) {
		ArrayList<String> couple=new ArrayList<String>();
		couple.add("Anna");
		couple.add("Kristoff");
		System.out.println("Original array list : "+couple);
		
		String new_couple="Elsa";
		couple.set(1, new_couple);
		
		int num=couple.size();
		System.out.println("Replace second element with 'Elsa'");
		
		for(int i=0; i<num; i++) {
			System.out.println(couple.get(i));
		}
	}
}
