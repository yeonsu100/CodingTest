package sorting;
import java.util.Arrays;

public class RadixSort {
	public static void sort(int[] array) {
		RadixSort.sort(array, 10);
	}
	
	public static void sort(int[] array, int radix) {
		if(array.length==0) {
			return;
		}
		
		int minValue=array[0];
		int maxValue=array[0];
		
		for(int i=1; i<array.length; i++) {
			if(array[i]<minValue) {
				minValue=array[i];
			}else if(array[i]>maxValue) {
				maxValue=array[i];
			}
		}
		
	}
	
	public static void main(String[] args) {
		RaidxSort ob=new RadixSort();
		int nums[]= {7, -5, 3, 2, 1, 0, 45};
		System.out.println("Original Array : ");
		System.out.println(Arrays.toString(nums));
	}
}
