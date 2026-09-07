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
    public TreeNode build(int[] in, int inlow, int inhigh, int[] post, int plow, int phigh) {
        if (plow > phigh || inlow > inhigh) return null;
        TreeNode root = new TreeNode(post[phigh]);
        if (plow == phigh) return root;

        int i = inlow;
        while (i <= inhigh) {
            if (in[i] == post[phigh]) break;
            i++;
        }

        int lcount = i - inlow;
        root.left = build(in, inlow, i - 1, post, plow, plow + lcount - 1);
        root.right = build(in, i + 1, inhigh, post, plow + lcount, phigh - 1);
        return root;
    }

    public TreeNode buildTree(int[] in, int[] post) {
        int n = in.length;
        if (n == 0) return null;
        return build(in, 0, n - 1, post, 0, n - 1);
    }
}