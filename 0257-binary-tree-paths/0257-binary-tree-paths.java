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
    private void solve(TreeNode root,String s,List<String> ans){
        if(root==null) return;
        String a=String.valueOf(root.val);
        if(root.left==null && root.right==null){
            s+=a;
            ans.add(s);
            return;
        }
        solve(root.left,s+a+"->",ans);
        solve(root.right,s+a+"->",ans);

    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans=new ArrayList<>();
        solve(root,"",ans);

        return ans;

        
    }
}