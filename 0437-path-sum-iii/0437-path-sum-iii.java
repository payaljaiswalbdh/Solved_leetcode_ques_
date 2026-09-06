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
        private int path(TreeNode root, long sum){
            if(root==null) return 0;
            int count=0;
            if((long) root.val == sum) count++;

            return count + 
            path(root.left, sum- (long) root.val) +
            path(root.right, sum- (long) root.val);
        }
        public int pathSum(TreeNode root, int targetSum) {
            if(root == null) return 0;
            int count= path(root, (long) (targetSum));
            count += pathSum(root.left,targetSum) +
            pathSum(root.right,targetSum);

            return count;      
        }
    }