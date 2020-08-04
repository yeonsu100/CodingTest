package tree;

public class CountCompleteTreeNode {
	public int countNodes(TreeNode root) {
	    int h=getHeight(root);
	    int total=(int)Math.pow(2, h)-1;
	 
	    //get num missed
	    int[] miss=new int[1];
	    helper(root, 0, h, miss);
	 
	    return total-miss[0];
	}
	 
	//true continue, false stop
	private boolean helper(TreeNode t, int level, int height, int[] miss){
	    if(t!=null){
	        level++;
	    }else{
	        return true;
	    }
	 
	    if(level>=height){
	        return false;
	    }
	 
	    if(level==height-1){
	        if(t.right==null){
	            miss[0]++;
	        }
	        if(t.left==null){
	            miss[0]++;
	        }
	 
	        if(t.left!=null){
	            return false;
	        }
	    }
	 
	    boolean r=helper(t.right, level, height, miss);
	    if(r) {
	        boolean l=helper(t.left, level, height, miss);
	        return l;
	    }
	 
	    return true;
	}
	 
	private int getHeight(TreeNode root){
	    TreeNode p=root;
	    int h=0;
	    while(p!=null){
	        h++;
	        p=p.left;
	    }
	    return h;
	}
}
