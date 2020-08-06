package hackerrank;

import java.io.*;

public class PrintTrianglePattern {
	public static void main(String[] args) {
		int n=5, i, j, num=1, gap;
		gap=n-1;
		
		for(j=1; j<=n; j++) {
			num=j;
		}
		for(i=1; i<=gap; i++) {
			System.out.println(" ");
		}
		gap--;
		for(i=1; i<=j; i++) {
			System.out.println(num);
			num++;
		}
		num--;
		
		for(i=1; i<j; i++) {
			System.out.println(num);
			num--;
		}
		System.out.println();
	}
}
