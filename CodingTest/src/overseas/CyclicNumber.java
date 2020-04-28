package overseas;

import java.math.BigInteger;
import java.util.Scanner;

public class CyclicNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Input a number : ");
		String strnum=sc.nextLine().trim();
		
		BigInteger n=new BigInteger(strnum);
		int len=strnum.length()+1;
		String str=String.valueOf(len);
		
		BigInteger n1=new BigInteger(str);
		StringBuilder buf=new StringBuilder();
		
		for(int i=0; i<(len-1); i++) {
			buf.append('9');
		}
		
		BigInteger total=new BigInteger(buf.toString());
		if(n.multiply(n1).equals(total)) {
			System.out.println("This is a Cyclic number.");
		}else {
			System.out.println("NOT a cyclic number.");
		}
	}
}
