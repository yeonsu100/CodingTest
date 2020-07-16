package dynamic;

import java.util.HashMap;
import java.util.ArrayList;


public class DistinctSubsequencesTotal {
	public int numDistinct(String S, String T) {
		HashMap<Character, ArrayList<Integer>> map=new HashMap<Character, ArrayList<Integer>>();
	 
		for (int i=0; i<T.length(); i++) {
			if(map.containsKey(T.charAt(i))) {
				map.get(T.charAt(i)).add(i);
			}else{
				ArrayList<Integer> temp=new ArrayList<Integer>();
				temp.add(i);
				map.put(T.charAt(i), temp);
			}
		}
	 
		int[] result=new int[T.length()+1];
		result[0] = 1;
	 
		for (int i=0; i<S.length(); i++) {
			char c=S.charAt(i);
	 
			if(map.containsKey(c)) {
				ArrayList<Integer> temp=map.get(c);
				int[] old=new int[temp.size()];
	 
				for(int j=0; j<temp.size(); j++)
					old[j]=result[temp.get(j)];
	 
				// the relation
				for(int j=0; j<temp.size(); j++)
					result[temp.get(j)+1]=result[temp.get(j)+1]+old[j];
			}
		}
	 
		return result[T.length()];
	}
}
