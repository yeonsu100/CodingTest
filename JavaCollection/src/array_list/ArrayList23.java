package array_list;
import java.util.*;

public class ArrayList23 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int[] a=new int[10];
		int[] b=new int[10];
		int cnt=0;
		
		for(int i=0; i<a.length; i++) {
			a[i]=scan.nextInt();
			b[i]=(a[i]%42);
		}
	}
}

