package string_and_array;

/*
 * input에 대해 output은 다음과 같이 나와야 하는 조건이 있다.
 * 1. 하이픈 (-) 제거
 * 2. 대문자로 출력
 * 3. 끝에서부터 4자리씩 끊기
 * 
 * output : 8F3Z 2E9W  |  8 5G3J 
 */

public class LicenseKeyFormatting {
	public static void main(String[] args) {
		String str="8F3Z-2e-9-wabcdef";
	//	String str="8-5g-3-J";
		int k=4;
		solve(str,k);
	}
	
	public static String solve(String str, int k) {
		
	}
}
