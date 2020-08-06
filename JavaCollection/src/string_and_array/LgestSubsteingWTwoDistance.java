package string_and_array;

import java.util.*;
/* Longest Substring with at most Two distance 
* input : String s="ccaabbb", output: 5
* "aabbb" which its length is 5
*/

public class LgestSubsteingWTwoDistance {
	public static void main(String[] args) {
		String s="ccaabbb";
		System.out.println(solve(s));
	}
	
	public static int solve(String s) {
		int start=0, end=0, length=0, counter=0;
		Map<Character, Integer> map=new HashMap<>();
		
		while(end<s.length()) {		// s.length=7
			char endChar=s.charAt(end);
			// c=2, a=2, b=3
			map.put(endChar, map.getOrDefault(endChar,0)+1);
		}
	}
}
