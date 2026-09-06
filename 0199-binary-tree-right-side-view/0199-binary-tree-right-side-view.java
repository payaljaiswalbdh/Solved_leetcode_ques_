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
        private int level(TreeNode root){
            if(root==null) return 0;
            return 1+Math.max(level(root.left),level(root.right));
        }
        private void preOrder(TreeNode root, List<Integer> ans, int level){
            if(root==null) return;
            ans.set(level,root.val);
            preOrder(root.left,ans,level+1);
            preOrder(root.right,ans,level+1);

        }
        public List<Integer> rightSideView(TreeNode root) {
            List<Integer> ans=new ArrayList<>();
            int h=level(root);
            for (int i = 0; i < h; i++) {
                ans.add(0);
            }
            
            preOrder(root, ans, 0);
            return ans;


        }
    }