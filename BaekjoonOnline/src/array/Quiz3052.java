package array;
import java.util.*;

public class Quiz3052 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int[] a=new int[10];
		int[] b=new int[10];
		int cnt=0;
		
		for(int i=0; i<a.length; i++) {
			a[i]=sc.nextInt();
			b[i]=(a[i]%42);
		}
		
		for(int i=0; i<b.length; i++) {
			for(int j=0; j<i; j++) {
				if(b[i]==b[j]) {
					cnt--;
					break;
				}
			}
			cnt++;
		}
		System.out.print(cnt);
	}
}
