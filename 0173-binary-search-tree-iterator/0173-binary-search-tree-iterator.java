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
class BSTIterator {
    List<Integer> ans=new ArrayList<>();
    int index=0;

    public BSTIterator(TreeNode root) {
        inOrder(root);
    }
    private void inOrder(TreeNode root){
        if(root==null) return;
        inOrder(root.left);
        ans.add(root.val);
         inOrder(root.right);
    }
    
    public int next() {
    return ans.get(index++);
    }
    
    public boolean hasNext() {
        return index<ans.size();
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */