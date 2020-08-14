package tree;

public class CountCompleteTreeNode2 {
	public int countNodes(TreeNode root) {
	    if(root==null)
	        return 0;
	 
	    int left=getLeftHeight(root)+1;    
	    int right=getRightHeight(root)+1;
	 
	    if(left==right){
	        return (2<<(left-1))-1;
	    }else{
	        return countNodes(root.left)+countNodes(root.right)+1;
	    }
	}
}
