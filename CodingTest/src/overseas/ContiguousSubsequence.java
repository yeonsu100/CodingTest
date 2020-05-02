package overseas;
import java.util.*;

public class ContiguousSubsequence {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("How many integers would you like to input?");
		int n=s.nextInt();
		int ans=-100000;
		int acc=0;
		System.out.println("Input the Integers : ");
		
		for(int i=0; i<n; i++) {
			acc+=s.nextInt();
			ans=Math.max(ans, acc);
			if(acc<0)acc=0;
		}
		System.out.println("Maximum sum of the said contiguous subsequence : ");
		System.out.println(ans);
	}
}
