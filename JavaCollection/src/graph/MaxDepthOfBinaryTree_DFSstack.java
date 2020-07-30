package graph;

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
		
	}
}
