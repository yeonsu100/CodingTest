package overseas;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		int j, n;
		System.out.print("Input the number (Table to be calculated) : ");
		{
			System.out.print("Input numbers of terms : ");
			Scanner in=new Scanner(System.in);
			n=in.nextInt();
			
			System.out.println("\n");
			for(j=0; j<=n; j++) {
				System.out.println(n+" * "+j+" = "+n*j);
			}
		}
	}
}
