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
		// 1. 하이픈 없애기 (output : 8F3Z2e9wabcdef)
		String newStr=str.replace("-", "");	// (Char oldChar, Char newChar) 즉, -를 없애라는 의미
		System.out.println("newStr1 : "+newStr);
		
		// 2. 대문자로 변환 (output : 8F3Z2E9WABCDEF)
		newStr=newStr.toUpperCase();
		System.out.println("newStr2 : "+newStr);
		
		// 3. 네자리씩 끊기 
		int leng=newStr.length();		// 전체 길이 구하기 
		System.out.println("leng : "+leng); 	// 14
		// String을 StringBuilder로 변환한다 (메모리 및 멀티스레드 이슈때문에) 
		StringBuilder sb=new StringBuilder();
		for(int i=0; i<leng; i++) {
			sb.append(newStr.charAt(i));
		}
		System.out.println("sb : "+sb);	// (output : 8F3Z2E9WABCDEF) 
		for(int i=k; i<leng; i=i+k) {	// 4를 빼고, 8을 빼고, 12개를 빼낸다 
			sb.insert(leng-i, '-');		// String이 아니라 Char이므로 싱글따옴표 사용 
		}
		System.out.println("-sb : "+sb);	// (output : 8F-3Z2E-9WAB-CDEF)


		return newStr;
	}
}
