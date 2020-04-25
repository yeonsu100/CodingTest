package overseas;

public class PentagonalNumber {
	public static void main(String[] args) {
		int cnt=1;
		for(int i=1; i<=50; i++) {
			System.out.printf("%-6d", getPentagonalNum(i));
			
			if(cnt%10 == 0) {
				System.out.println();
				cnt++;
			}
		}
	}
	
	public static int getPentagonalNum(int i) {
		return(i*(3*i-1))/2;
	}
}
