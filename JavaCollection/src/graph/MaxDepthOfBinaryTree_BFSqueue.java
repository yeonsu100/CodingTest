package graph;
/*
 * 1. queue에 넣어 근접해서 한칸씩 빼고 넣는 방식으로 접근한다  
 */

public class MaxDepthOfBinaryTree_BFSqueue {
	public static void main(String[] args) {
		TreeNode tree=new TreeNode(3);
		tree.left=new TreeNode(1);
		tree.right=new TreeNode(4);
		tree.left.left=new TreeNode(5);
		tree.left.right=new TreeNode(8);
		tree.left.left.left=new TreeNode(7);
		MaxDepthOfBinaryTree_BFSqueue a=new MaxDepthOfBinaryTree_BFSqueue();
		System.out.println(a.bfs(tree));
	}
	
	public int bfs(TreeNode root) {
		
	}
}
