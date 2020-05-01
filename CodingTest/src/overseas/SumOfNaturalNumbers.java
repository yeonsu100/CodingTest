package overseas;

import java.util.Scanner;

public class SumOfNaturalNumbers {
	public static void main(String[] args) {
		int i, n, sum=0;
		{
			Scanner in=new Scanner(System.in);
			n=in.nextInt();
		}
		System.out.println("The first n natural numbers are : "+n);
		
		for(i=1; i<=n; i++) {
			System.out.println(i);
			sum+=i;
		}
		System.out.println("The sum of Natural number upto "+n+" terms : "+sum);
	}
}
