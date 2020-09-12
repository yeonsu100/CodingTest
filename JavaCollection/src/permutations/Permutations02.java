package permutations;

import java.util.*;

public class Permutations02 {
	public ArrayList<ArrayList<Integer>> permute(int[] num){
		ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
		
		// start from an empty list
		result.add(new ArrayList<Integer>());
		
		for(int i=0; i<num.length; i++) {
			// list of list in currrent iteration of the array num
			ArrayList<ArrayList<Integer>> current=new ArrayList<ArrayList<Integer>>();
			
			for(ArrayList<Integer> l:result) {
				// # of locations to insert is largest index + 1
				for(int j=0; j<l.size()+1; j++) {
					// + add num[i] to different locations
					l.add(j, num[i]);
					
					ArrayList<Integer> temp=new ArrayList<Integer>(l);
					current.add(temp);

					// - remove num[i] add
					l.remove(j);
				}
			}
			result=new ArrayList<ArrayList<Integer>>(current);
		}
		
		return result;
	}
}
