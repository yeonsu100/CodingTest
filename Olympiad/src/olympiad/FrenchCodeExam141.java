package olympiad;
import java.util.*;

public class FrenchCodeExam141 {
	public static void main(String[] args) {
		String str="Arendelle";
		char[] A=str.toCharArray();
		int offset=3;
		int len=A.length;
		offset%=len;
		
		reverse(A, 0, len-offset-1);
		reverse(A, len-offset, len-1);
		reverse(A, 0, len-1);
	}
	
	private static void reverse(char[] str, int start, int end) {
		while(start<end) {
			char temp=str[start];
			str[start]=str[end];
			str[end]=temp;
			
			start++;
			end--;
		}
	}
}
