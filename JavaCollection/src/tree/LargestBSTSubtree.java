package tree;

class Wrapper{
	int size;
	int lower, upper;
	boolean isBST;
	
	public Wrapper() {
		lower=Integer.MAX_VALUE;
		upper=Integer.MIN_VALUE;
		isBST=false;
		size=0;
	}
}

public class LargestBSTSubtree {
	public int largestBSTSubtree(TreeNode root) {
		return helper(root).size;
	}
	
	public Wrapper helper(TreeNode node) {
		Wrapper curr=new Wrapper();
		
		if(node==null) {
			curr.isBST=true;
			return curr;
		}
		
		Wrapper l=helper(node.left);
		Wrapper r=helper(node.right);
		
		// current subtree's boundaries
		curr.lower=Math.min(node.val, l.lower);
		curr.upper=Math.max(node.val, r.upper);
		
		// check left and right subtrees are BST or not
        // check left's upper again current's value and right's lower against current's value
		if(l.isBST && r.isBST && l.upper<=node.val && r.lower>=node.val){
            curr.size=l.size+r.size+1;
            curr.isBST=true;
        }else{
            curr.size=Math.max(l.size, r.size);
            curr.isBST=false;
        }
 
        return curr;
	}
}
