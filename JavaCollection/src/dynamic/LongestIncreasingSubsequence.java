package dynamic;

import java.util.Arrays;

public class LongestIncreasingSubsequence {
	// algorithm should run in O(n2) complexity
	public static void main(String[] args) {
		LongestIncreasingSubsequence lis=new LongestIncreasingSubsequence();
		int[] nums= {1,2,3,2,5,2,6,10,4,12};
	 // int[] nums= {9,11,2,8,4,7,88,15};
		System.out.println("Value "+lis.solve(nums));
	}
	
	public int solve(int[] nums) {
		if(nums==null || nums.length==0) {
			return 0;
		}
		
		// 1. dp 방식으로 담을 그릇 결정 
		int[] dp=new int[nums.length];
		Arrays.fill(dp,1);
		int result=1;		// 결과값은 무조건 1개 이상이어야 한다 (0이 나오면 X)
		
		// 2. for문 돌리기 (n2이기 때문에 for문도 두번 사용한다) 
		for(int i=1; i<nums.length; i++) {
			
			for(int j=0; j<i; j++) {
				
				if(nums[j]<nums[i]) {
					dp[i]=Math.max(dp[j]+1, dp[i]);
				}
			}
			// 3. 값 추출하기 
			result=Math.max(result, dp[i]);
		}
		
		return 0;
	}
}
