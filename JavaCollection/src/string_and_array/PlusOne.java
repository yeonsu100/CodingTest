package string_and_array;

public class PlusOne {
	public static void main(String[] args) {
		int[] digits= {1,2,3};
	 // int[] digits= {9,9,9};
		int[] result=plusOne(digits);
		
		for(int i:result) {
			System.out.println("val : "+i);
		}
	}
	
	public static int[] plusOne(int[] digits) {
		for(int i=digits.length-1; i>=0; i--) {
			if(digits[] != 9) {
				digits[i]++;
				break;
			}else {
				digits[i]=0;
			}
		}
		return digits;
	}
}
