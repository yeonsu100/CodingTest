package permutations;

import java.util.*;

public class Permutations02 {
	public ArrayList<ArrayList<Integer>> permute(int[] num){
		ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
		
		result.add(new ArrayList<Integer>());
		
		for(int i=0; i<num.length; i++) {
			ArrayList<ArrayList<Integer>> current=new ArrayList<ArrayList<Integer>>();
			
			for(ArrayList<Integer> l:result) {
				for(int j=0; j<l.size()+1; j++) {
					l.add(j, num[i]);
				}
			}
		}
		
		return result;
	}
}
