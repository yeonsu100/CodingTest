package olympiad;

public class SubArray {
	public static void main(String[] args) {
		int[] nums= {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		System.out.println(max_SubArray(nums));
	}
	
	public static int max_SubArray(int[] nums) {
		if(nums.length < 1) {
			return 0;
		}
		
		int max=nums[0];
		int max_Begin=0;
		int max_End=0;
		int begin=0;
		int ene=0;
		int sum=0;
		
		return 0;
	}
}
