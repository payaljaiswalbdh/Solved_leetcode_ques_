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
        public TreeNode insertIntoBST(TreeNode root, int val) {
            if(root==null) return new TreeNode(val);
            else if(root.val > val) {   //go left
            if(root.left==null)  root.left=new TreeNode(val); //attach it here 
            else insertIntoBST(root.left,val);
            }

            else{ //go right 
                if(root.right ==null) { //attach it here
                    root.right= new TreeNode(val);
                }
                else insertIntoBST(root.right,val);

            }
        return root;

        }
    }