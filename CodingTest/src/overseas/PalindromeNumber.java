package overseas;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Input a number : ");
		int n=in.nextInt();
		int sum=0, r;
		int temp=n;
		
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		
		if(temp==sum)System.out.println("It is a Palindrome Number");
		else
			System.out.println("NOT a Palindrome Number");
	}
}
