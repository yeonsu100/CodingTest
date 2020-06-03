package mix;
import java.util.Arrays;

public class MixedExercise04 {
	public static void main(String[] args) {
		int array_nums[]= {-4, 8, 6, -5, 6, -2, 1, 2, 3, -11};
		System.out.println("Original Array : "+Arrays.toString(array_nums));
		int j, temp, array_size;
		
		array_size=8;
		for(int i=0; i<array_size; i++) {
			j=i;
			
			// Shift positive numbers left, negative numbers right
			while((j>0) && (array_nums[j]>0) && (array_nums[j-1]<0)) {
				temp=array_nums[j];
				array_nums[j]=array_nums[j-1];
				array_nums[j-1]=temp;
				j--;
			}
		}
		System.out.println("New Array : "+Arrays.toString(array_nums));
	}
}
