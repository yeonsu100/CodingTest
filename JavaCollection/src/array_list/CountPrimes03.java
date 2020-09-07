package array_list;

import java.util.ArrayList;

public class CountPrimes03 {
	public int countPrimes(int n) {
		ArrayList<Integer> primes=new ArrayList<Integer>();
		
		if(n<=1)
			return 0;
		if(n==2)
			return 1; 
		if(n==3)
			return 2;
		
		return false;
	}
}
