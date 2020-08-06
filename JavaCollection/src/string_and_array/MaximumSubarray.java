package string_and_array;

/*
 * Subarray중에 합이 가장 큰 수를 return
 * 1) 새로운 값=(새로운 값과 새로운 값+SubArray 값) 비교 
 * 	  newSum=Math.max(새로운 값, 기존값과 합한 값)
 * 	  Max=Math.max(newSum, max);
 * 2) 1번에서 나온 max값을 따로 저장 (없을 경우 현재값이 max값) 
 */
public class MaximumSubarray {
	public static void main(String[] args) {
		int[] nums= {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(nums));
	}
	
	public static int maxSubArray(int[] nums) {
		int newSum=nums[0];
		int max=nums[0];
		
		for(int i=1; i<nums.length; i++) {
			Math.max(nums[i], newSum+nums[i]);
			max=Math.max(newSum, max);
		}
		return max;
	}
}
