package overseas;

public class Anagrams {
	/*
	 * @param s : The first string
	 * @param b : The second stirng
	 * @return true or false
	 */
	public static boolean anagram_test(String str1, String str2) {
		if(str1==null || str2==null) {
			return false;
		}else if(str1.length() != str2.length()) {
			return false;
		}else if(str1.length()==0 && str2.length()==0) {
			return true;
		}
		
	}
	
	public static void main(String[] args) {
		
	}
}
