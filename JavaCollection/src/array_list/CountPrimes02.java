package array_list;

public class CountPrimes02 {
	public int countPrims(int n) {
		if(n<=2)
			return 0;
		
		// init an array to track prime numbers
		boolean[] primes=new boolean[n];
		for(int i=2; i<n; i++) {
			primes[i]=true;
		}

		int count=0;
		for(int i=2; i<n; i++) {
			if(primes[i])
				count++;
		}
		
		return count;
	}
}
