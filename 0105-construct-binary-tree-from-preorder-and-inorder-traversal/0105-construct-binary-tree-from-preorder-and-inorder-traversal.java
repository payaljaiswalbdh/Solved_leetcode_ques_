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
        public TreeNode build(int[] pre, int plow, int phigh,int[] in, int  inlow, int inhigh ) {
            if(plow>phigh) return null;
            TreeNode root= new TreeNode(pre[plow]);
            if(plow==phigh) return root;
            int i=inlow;
            while(i<= inhigh){
                if(in[i]==pre[plow]) break;
                i++;
            }
            int lcount=i-inlow;
            int rcount= inhigh-i;
            root.left=build(pre, plow+1, plow+lcount, in, inlow, i-1);
            root.right=build(pre, plow+lcount+1, phigh, in, i+1, inhigh);
            return root;

        }
        public TreeNode buildTree(int[] pre, int[] in) {
            int n=pre.length;
            return build(pre,0,n-1,in,0,n-1);
        }
    }