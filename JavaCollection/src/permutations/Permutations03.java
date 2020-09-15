package permutations;

import java.util.*;

public class Permutations03 {
	public List<List<Integer>> permuteUnique(int[] nums) {
	    List<List<Integer>> result = new ArrayList<>();
	    
	    helper(0, nums, result);
	    return result;
	}
	
	private void helper(int start, int[] nums, List<List<Integer>> result){
	    if(start==nums.length-1){
	        ArrayList<Integer> list=new ArrayList<>();
	        for(int num: nums){
	            list.add(num);
	        }
	        result.add(list);
	        return;
	    }
	}
}
