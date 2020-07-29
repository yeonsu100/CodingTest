package string_and_array;

import java.util.*;

public class DailyTemperature {
	public static void main(String[] args) {
		int[] nums= {73, 74, 75, 71, 69, 72, 76, 73};
		int[] res=dailyTemperatures(nums);
		
		System.out.println("=== result ===");
		for(int i:res) {
			System.out.print(i+" ");
		}
	}
	
	public static int[] dailyTemperatures(int[] temper) {
		// 1. 스택에 담기 
		Stack<Integer> stack=new Stack<>();
		int[] result=new int[temper.length];
		
		// 2. pop 
		for(int i=0; i<temper.length; i++) {
			while(!stack.isEmpty() && temper[stack.peek()] < temper[i]) {
				// result[0] = 1-0
				int index=stack.pop();
				result[index]=i-index;
			}
			stack.push(i);
		}
		return result;
	}
}
