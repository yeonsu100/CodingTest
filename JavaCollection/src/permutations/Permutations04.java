package permutations;

import java.util.*;

public class Permutations04 {
	public static ArrayList<ArrayList<Integer>> permuteUnique(int[] num) {
		ArrayList<ArrayList<Integer>> returnList = new ArrayList<ArrayList<Integer>>();
		returnList.add(new ArrayList<Integer>());
		
		for(int i=0; i<num.length; i++) {
			Set<ArrayList<Integer>> currentSet=new HashSet<ArrayList<Integer>>();
			
			for(List<Integer> l:returnList) {
				for (int j = 0; j < l.size() + 1; j++) {
					l.add(j, num[i]);
					ArrayList<Integer> T = new ArrayList<Integer>(l);
					l.remove(j);
					currentSet.add(T);
				}
			}
		}
		return returnList;
	}
}
