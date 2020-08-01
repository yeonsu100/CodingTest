package string_and_array;

import java.util.HashSet;
import java.util.Set;

/*
 * 1. 보석은 대소문자를 구분해서 갖고있어야 한다 
 * 2. aA -> 2개 
 * 3. 스톤에서 보석을 비교 (aA가 몇개였는지 체크)
 *  * HashSet 이용 (중복 허용 X) 
 */
public class JewelsAndStones {
	public static void main(String[] args) {
		String J="aA", S="aAAbbbb";
		System.out.println(solve(J,S));
	}
	
	public static int solve(String jew, String stone) {
		Set<Character> set=new HashSet<>();
		for(char jewel:jew.toCharArray()) {
			set.add(jewel); 	// a,A
		}
		
		int count=0;
		for(char stoneChar:stone.toCharArray()) {
			System.out.println("Stone Char : "+stoneChar);
			if(set.contains(stoneChar)) {
				count++;
			}
		}
		return count;		// output : Stone에 저장된 문자열 출력, 3 
	}
}
