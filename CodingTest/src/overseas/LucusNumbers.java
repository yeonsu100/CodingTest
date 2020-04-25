package overseas;

public class LucusNumbers {
	public static void main(String[] args) {
		System.out.print("\nFirst 10 Lucus numbers : ");
		
		int n=10;
		int n1=2, n2=1, n3;
		
		if(n>1) {
			System.out.println("\n2\n1");
			for(int i=2; i<n; ++i) {
				n3=n2;
				n2+=n1;
				n1=n3;
				System.out.println(n2);
			}
		}else {
			System.out.println("Input a positive number, please!");
		}
	}
}
