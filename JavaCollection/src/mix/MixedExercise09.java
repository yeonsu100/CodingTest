package mix;

public class MixedExercise09 {
	static boolean sum_pair(int arr_int[], int n, int x) {
		int k;
		for(k=0; k<n-1; k++) {
			if(arr_int[k]>arr_int[k+1]) {
				break;
			}
		}
		int l=(k+1)%n;
		int r=k;
		
		while(l!=r) {
			if(arr_int[l]+arr_int[r] == x) {
				return true;
			}
			if(arr_int[l]+arr_int[r] < x) {
				l=(l+1)%n;
			}else {
				r=(n+r-1)%n;
			}
		}
	}
	
	public static void main(String[] args) {
		int arr_int[]= {29, 13, 17, 7, 18, 20};
		int sum=42;
		int n=arr_int.length;
	}
}
