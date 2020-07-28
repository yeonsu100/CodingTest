package string_and_array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public static void main(String[] args) {
		// 문제 
		int[] nums= {2, 8, 11, 21};
		int target=10;
		// output : int[]={1, 2};
		
		// 객체 생성하기 
		TwoSum a=new TwoSum();
		int[] result=a.solve(nums, target);
	}
	
	public int[] solve(int[] nums, int target) {
		Map<Integer, Integer> map=new HashMap<>();
		int[] result=new int[2];
		
		for(int i=0; i<nums.length; i++) {
			// map에 값이 있는지 체크 
			if(map.containsKey(nums[i])) {
				int mapValue=map.get(nums[i]);	// i=1일 때 8, map(8,0)
				result[0]=mapValue+1;		// 값 : 1
				result[1]=i+1;				// 값 : 2
			}else {
				map.put(target-nums[i], i);		// key:10-2=8, value:i=0
			}
		}
		
		return nums;
	}
}
