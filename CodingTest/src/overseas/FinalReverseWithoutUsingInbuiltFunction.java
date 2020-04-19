package overseas;

public class FinalReverseWithoutUsingInbuiltFunction {
	public static void main(String[] args) {
		String str="Into the Unknown";
		char chars[]=str.toCharArray(); 	// converted
		for(int i=chars.length-1; i>=0; i--) {
			System.out.print(chars[i]);
		}
	}
}
