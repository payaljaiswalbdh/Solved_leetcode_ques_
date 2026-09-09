/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode bstFromPreorder(int[] pre) {
    TreeNode root = new TreeNode(pre[0]);
    for(int i=1;i<pre.length;i++){
        inSert(root,pre[i]);
    }
        return root;
    }
  private void inSert(TreeNode root , int val){
    if(root==null) 
     root=new TreeNode(val);
    else if(root.val>val) { //go left
      if(root.left==null)
       root.left=new TreeNode(val);
       else 
       inSert(root.left,val);
    }

    else{ //go right
     if(root.right==null){
       root.right=new TreeNode(val);
     }
      else {
       inSert(root.right,val);
        } 
    } 
  } 
    
}