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
		
		primes.add(2);
		primes.add(3);
		
		for(int i=4; i<=n; i++) {
			boolean isPrime=true;
			for(int p:primes) {
				int m=i%p;
				if(m==0) {
					isPrime=false;
					break;
				}
			}
		if(isPrime) {
			primes.add(i);
		}
	}
		return primes.size();
	}
}
