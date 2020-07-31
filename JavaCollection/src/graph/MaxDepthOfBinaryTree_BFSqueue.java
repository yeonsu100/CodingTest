package graph;

import java.util.LinkedList;
import java.util.Queue;

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
		// 1. Null check
		if(root==null) return 0;
		
		// 2. 큐 구현 
		Queue<TreeNode> queue=new LinkedList<>();
		queue.offer(root);
		int count=0;
		
		// 3. pop
		while(!queue.isEmpty()) {
			int size=queue.size();
			for(int i=0; i<size; i++) {
				TreeNode node=queue.poll();
				if(node.left!=null) {
					queue.offer(node.left);
				}
				if(node.right!=null) {
					queue.offer(node.right);
				}
			}
			count++;		// 빼낼 때마다 카운트를 하나씩 증가시킨다 
		}
		
		return count;
	}
}
