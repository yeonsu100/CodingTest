package mix;
import java.util.*;

public class MixedExercise08 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count1=0;
		int count2=0;
		System.out.println
			("Input two adjoined sides and the diagonal of a parallelogram (comma separated):");
		
		String[] s=sc.nextLine().split(",");
		int len1=Integer.parseInt(s[0]);
		int len2=Integer.parseInt(s[1]);
		int len3=Integer.parseInt(s[2]);
		
		if(len3*len3==len1*len1+len2*len2)count1++;
		if(len1==len2)count2++;
		if(count1>0) {
			System.out.println("This is a rectangle.");
		}
		if(count2>0) {
			System.out.println("This is a rhombus.");
		}
	}
}
