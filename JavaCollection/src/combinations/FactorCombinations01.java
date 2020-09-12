package combinations;

import java.util.*;

public class FactorCombinations01 {
	public List<List<Integer>> getFactors(int n){
		List<List<Integer>> result=new ArrayList<List<Integer>>();
		
		List<Integer> list=new ArrayList<Integer>();
	    helper(2,1,n,result,list);
	    
		return result;
	}
	
	public void helper(int start, int product, int n, 
			List<List<Integer>> result, List<Integer> curr){
		
	}
}
