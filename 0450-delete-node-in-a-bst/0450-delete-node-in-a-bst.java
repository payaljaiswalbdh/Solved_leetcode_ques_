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
    public TreeNode inopre(TreeNode root){
        TreeNode pred=root.left;
        while(pred.right!=null){
            pred=pred.right;
        }
        return pred;
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return null;
        // step1
        if(root.val==key){
            // case1: No child
            if(root.left==null && root.right==null)
            return null;

            // case2: 1 child node
            if(root.left==null || root.right==null){
                if(root.left!=null)
                return root.left;
                else
                return root.right;
            }

            // case3: 2 child node
             if(root.left!=null && root.right!=null){
                // replace the root with its inorder predecessor or successor
                // after replacing delete the pred/successor
                TreeNode pred= inopre(root);
                root.val=pred.val;
                root.left=deleteNode(root.left,pred.val);
             }

        }

    // step2
     else if(root.val>key){ //go left
       root.left=deleteNode(root.left,key);
     }

    //  step3
    else{  //root.val<key //go right
         root.right=deleteNode(root.right,key);
    }
      return root;  
    }
}