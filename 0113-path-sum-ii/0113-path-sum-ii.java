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
        private void helper(TreeNode root,List<Integer>v, List<List<Integer>> ans,int sum){
            if(root==null) return ;
            v.add(root.val);
            if(root.left==null && root.right==null){
                if(root.val==sum){
                   ans.add(new ArrayList<>(v));
                }
            }
            else{
            helper(root.left,v,ans,sum-(root.val));
            helper(root.right,v,ans,sum-(root.val));
        }
        v.remove(v.size() - 1);
    
        }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> v=new ArrayList<>();
        helper(root,v,ans,targetSum);

        return ans;
        
    }
}