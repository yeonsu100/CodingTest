package overseas;

public class RemoveWhiteSpaces {
	public static void main(String[] args) {
		String str1="Show yourself   I'm ready to learn		Ah ah ah ah";
		String str2=str1.replaceAll("\\s", "");
		System.out.println(str2);
	}
}
