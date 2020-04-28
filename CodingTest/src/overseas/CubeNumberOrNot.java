package overseas;

import java.util.Scanner;

public class CubeNumberOrNot {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Input a number : ");
		int num=sc.nextInt();
		int n=(int)Math.round(Math.pow(num, 1.0/3.0));
		
		if((num==n*n*n)) {
			System.out.print("This number is a cube.");
		}else {
			System.out.print("This number is NOT a cube.");
		}
		System.out.println("\n");
	}
}
