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
     public void trim(TreeNode root, int low, int high) {
        if(root==null) return;
        while(root.left!=null){
            if(root.left.val<low)
            root.left=root.left.right;
            else if(root.left.val > high)
            root.left=root.left.left;
            else
            break;
        }

         while(root.right!=null){
            if(root.right.val>high)
            root.right=root.right.left;
            else if(root.right.val < low )
            root.right=root.right.right;
            else
            break;
        }
        trim(root.left,low,high);
        trim(root.right,low,high);
     }
    public TreeNode trimBST(TreeNode root, int low, int high) {
        TreeNode dummy =new TreeNode(Integer.MAX_VALUE);
        dummy.left = root;
        trim(dummy,low,high);
        return dummy.left;
    }
}