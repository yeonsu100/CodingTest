package overseas;

import java.util.Scanner;

public class CheckAutomorphicOrNot {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Input a number : ");
		int num=sc.nextInt();
		int sq_num=num*num;
		
		String str_num=Integer.toString(num);
		String square=Integer.toString(sq_num);
		
		if(square.endsWith(str_num)) {
			System.out.println("Automorphic Number.");
		}else {
			System.out.println("Not an Automorphic number.");
		}
	}
}
