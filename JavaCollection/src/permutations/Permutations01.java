package permutations;

import java.util.*;

public class Permutations01 {
	public List<List<Integer>> permute(int[] nums){
		List<List<Integer>> result=new ArrayList<>();
		helper(0, nums, result);

		return result;
	}
	
	private void helper(int start, int[] nums, List<List<Integer>> result) {
		if(start==nums.length) {
			ArrayList<Integer> list=new ArrayList<>();
			result.add(list);
			return;
		}
		
		
	}
}
