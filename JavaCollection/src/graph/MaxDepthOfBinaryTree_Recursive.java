package graph;
/*
 * 1. left, right를 호출한다 (null이 나오기 전까지 진행) 
 * 2. Math.max(leftMax, rightMax)를 이용한다
 */

class TreeNode{
	int val;
	TreeNode left, right;
	TreeNode(int x){
		this.val=x;
	}
}

public class MaxDepthOfBinaryTree_Recursive {
	public static void main(String[] args) {
		TreeNode tree=new TreeNode(3);
		tree.left=new TreeNode(1);
		tree.right=new TreeNode(4);
		tree.left.left=new TreeNode(5);
		tree.left.right=new TreeNode(8);
		tree.left.left.left=new TreeNode(7);
		MaxDepthOfBinaryTree_Recursive a=new MaxDepthOfBinaryTree_Recursive();
		System.out.println(a.maxDepth(tree));
	}
	
	public int maxDepth(TreeNode root) {
		if(root==null) return 0;
		System.out.println(root.val);
		int leftMax=maxDepth(root.left);
		int rightMax=maxDepth(root.right);
		return Math.max(leftMax, rightMax)+1;
	}
	
}
