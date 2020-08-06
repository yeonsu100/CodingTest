package string_and_array;

public class PlusOne {
	public static void main(String[] args) {
	 //	int[] digits= {1,2,3};
	    int[] digits= {9,9,9};
		int[] result=plusOne(digits);
		
		for(int i:result) {
			System.out.println("val : "+i);
		}
	}
	
	public static int[] plusOne(int[] digits) {
		for(int i=digits.length-1; i>=0; i--) {
			if(digits[i] != 9) {
				digits[i]++;
				break;
			}else {
				digits[i]=0;
			}
		}
		
		// 0,0,0 -> 1,0,0,0
		if(digits[0]==0) {
			// 증가시킨 뒤 값을 넣을 새로운 배열을 만든다 
			int[] result=new int[digits.length+1];	// 4
			result[0]=1;
			return result;
		}
		return digits;
	}
}
