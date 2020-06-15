package sorting;
import java.util.Arrays;

class MergeSort {
	void merge(int nums[], int left, int m, int right) {
		int n1=m-left+1;
		int n2=right-m;
		
		int Left_part_arr[]=new int[n1];
		int Right_part_arr[]=new int[n2];
		
		for(int i=0; i<n1; ++i) {
			Left_part_arr[i]=nums[left+i];
		}
		for(int j=0; j<n2; ++j) {
			Right_part_arr[j]=nums[m+1+j];
		}
		int i=0, j=0;
		
		int k=left;
		
		while(i<n1 && j<n2) {
			if(Left_part_arr[i] <= Right_part_arr[j]) {
				nums[k]=Left_part_arr[i];
				i++;
			}else {
				nums[k]=Right_part_arr[j];
				j++;
			}
			k++;
		}
		
		while(i<n1) {
			nums[k]=Left_part_arr[i];
			i++;
			k++;
		}
		
		while(j<n2) {
			nums[k]=Right_part_arr[j];
			j++;
			k++;
		}
	}
	
	// merge()
	void sort(int nums[], int left, int right) {
		if(left<right) {
			// Find the middle point
			int m=(left+right)/2;
			
			// Sort first halve
			sort(nums, left, m);
			// Sort second halve
			sort(nums, m+1, right);
			
			// Merge the sorted halves
			merge(nums, left, m, right);
		}
	}
	
	// Method to test above
	public static void main(String[] args) {
		MergeSort ob=new MergeSort();
		int nums[]= {11, -7, 25, 3, -5, 1, 20, 6, 0, 14, -2};
		
		System.out.println("Original Array : ");
		System.out.println(Arrays.toString(nums));
		ob.sort(nums, 0, nums.length-1);
		System.out.println("Sorted Array : ");
		System.out.println(Arrays.toString(nums));
	}
}
