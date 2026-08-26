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
    // approach-1
    // int maxDia=0;
    // private int levels(TreeNode root){
    //     if(root==null) return 0;
    //     return 1+Math.max(levels(root.left),levels(root.right));
    // }

    // public int diameterOfBinaryTree(TreeNode root) {
    //     if(root==null) return 0;
    //     int dia= levels(root.left) + levels(root.right);
    //     maxDia=Math.max(maxDia, dia);
    //     diameterOfBinaryTree(root.left);
    //     diameterOfBinaryTree(root.right);
    //     return maxDia; 



    // way of writing
int maxDia=0;
private int solve(TreeNode root){
    if(root==null) return 0;
        int dia= levels(root.left) + levels(root.right);
        maxDia=Math.max(maxDia, dia);
        solve(root.left);
        solve(root.right);
        return maxDia;
    }

    private int levels(TreeNode root){
        if(root==null) return 0;
        return 1+Math.max(levels(root.left),levels(root.right));
}

public int diameterOfBinaryTree(TreeNode root) {
    maxDia=0;
    return solve(root);
}
}