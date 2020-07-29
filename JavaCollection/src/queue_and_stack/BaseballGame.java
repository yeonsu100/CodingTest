package queue_and_stack;

import java.util.Stack;

public class BaseballGame {
	public static void main(String[] args) {
		String[] strs = {"5","-2","4","C","D","9","+","+"};
		System.out.println(points(strs));
	}
	
	public static int points(String[] strs) {
		// 데이터를 담을 공간 생성 
		Stack<Integer> stack=new Stack<>();
		
		// 데이터 출력 
		for(String op:strs) {
			switch(op) {
				case "C" : 
					stack.pop();
					break;
				case "D" :
					stack.push(stack.peek()*2);
				case "+" : 
					
				default : 
					stack.push(Integer.valueOf(op));
			}
		}
	}
}
