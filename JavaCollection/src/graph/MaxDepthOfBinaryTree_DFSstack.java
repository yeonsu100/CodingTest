package graph;

import java.util.Stack;

public class MaxDepthOfBinaryTree_DFSstack {
	public static void main(String[] args) {
		MaxDepthOfBinaryTree_DFSstack a=new MaxDepthOfBinaryTree_DFSstack();
		TreeNode node=new TreeNode(1);
		node.left=new TreeNode(2);
		node.right=new TreeNode(3);
		node.left.left=new TreeNode(4);
		node.left.right=new TreeNode(5);
		node.left.left.left=new TreeNode(6);
		
		System.out.println("val : "+a.dfs(node));
	}
	
	public int dfs(TreeNode root) {
		// 1. Null check
		if(root==null) return 0;
		
		// 2. 스택 구현
		Stack<TreeNode> stack=new Stack<>();
		Stack<Integer> valueStack=new Stack<>();
		stack.push(root);
		valueStack.push(1);
		int max=0;
		
		// 3. pop
		while(!stack.isEmpty()) {
			TreeNode node=stack.pop();
			int count=valueStack.pop();
			max=Math.max(max, count);
			if(node.left!=null) {
				stack.push(node.left);
				valueStack.push(1+count);
			}
			if(node.right!=null) {
				stack.push(node.right);
				valueStack.push(1+count);
			}
		}
		
		return max;			// output : 4
	}
}
