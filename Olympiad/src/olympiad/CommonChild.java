package olympiad;

import java.util.*;

public class CommonChild {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		String str2=sc.next();
		
		int result=commonChild(str1, str2);
	}
	
	public static int commonChild(String str1, String str2) {
		int[][] valueLength=new int[str1.length()+1][str2.length()+1];
		
		int result=valueLength[str1.length()][str2.length()];
		return result;
	}
}
