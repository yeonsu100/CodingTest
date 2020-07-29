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
				case "C" : 		// C가 나오면 
					stack.pop();	// 값을 하나 빼낸다 
					break;
				case "D" :		// D가 나오면 
					stack.push(stack.peek()*2);  // 2번의 값을 더블 
					break;
				case "+" : 
					int x=stack.pop();
					int y=stack.pop();
					stack.push(y);			// y를 먼저 넣은 뒤 
					stack.push(x);			// x를 넣고 
					stack.push(x+y);		// 두 값을 합한 값을 넣는다 
					break;
				default : 
					stack.push(Integer.valueOf(op));
			}
		}
	}
}
