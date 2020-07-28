package string_and_array;

public class MoveZeros {
	
	public static void main(String[] args) {
		// 1
		int[] nums= {0, 3, 2, 0, 8, 5};
		int index=0;
		
		// 2
		for(int i=0; i<nums.length; i++) {
			if(nums[i] != 0) {
				nums[index]=nums[i];
				index++;
				System.out.println("index "+index);
			}
		}
	}
}
