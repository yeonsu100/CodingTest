package string_and_array;

public class AddOne {
	public static void main(String[] args) {
	    int[] digits= {9,9,9};
		int[] result=addOne(digits);
		
		for(int i:result) {
			System.out.println("val : "+i);
		}
	}
	
	public static int[] addOne(int[] digits) {
		for(int i=digits.length-1; i>=0; i--) {
			if(digits[i] != 9) {
				digits[i]++;
				break;
			}else {
				digits[i]=0;
			}
		}
		
		if(digits[0]==0) {
			int[] result=new int[digits.length+1];	
			result[0]=1;
			return result;
		}
		return digits;
	}
}
