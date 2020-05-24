package hackerrank;
import java.util.*;

public class CommonChild {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		String str2=sc.next();
		
		int result=commonChild(str1, str2);
		
		System.out.println(result);
	}
	
	public static int commonChild(String str1, String str2) {
		int[][] valueLength=new int[str1.length()+1][str2.length()+1];
		for(int i=0; i<str1.length(); i++) {
			for(int j=0; j<str2.length(); j++) {
				
			}
		}
	}
}
