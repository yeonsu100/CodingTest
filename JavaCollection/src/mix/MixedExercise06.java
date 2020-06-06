package mix;

public class MixedExercise06 {
	public static void main(String[] args) {
		int nums[]= {2, 4, 6, 7, 8};
		int target=7;
		
		int lower=0;
		int upper=nums.length-1;
		int index=-1;
		
		while(lower <= upper) {
			int mid=(lower+upper)>>1;
			if(nums[mid]==target) {
				index=mid;
			}
			if(nums[mid]>=target) {
				upper=mid-1;
			}else {
				lower=mid+1;
			}
		}
		System.out.println("Position of "+target+" is "+index);
	}
}
