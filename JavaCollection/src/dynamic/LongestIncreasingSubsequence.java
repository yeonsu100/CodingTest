package dynamic;

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
		
		return 0;
	}
}
