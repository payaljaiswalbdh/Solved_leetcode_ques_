class Solution {

    // Find height of tree
    int height(TreeNode root) {
        if (root == null)
            return 0;

        return 1 + Math.max(height(root.left),height(root.right));
    }

    // Print/store nodes of a particular level
    void printLevel(TreeNode root, int curr, int targetLevel,
                    List<Integer> list) {

        if (root == null)
            return;

        if (curr == targetLevel) {
            list.add(root.val);
            return;
        }

        printLevel(root.left, curr + 1, targetLevel, list);
        printLevel(root.right, curr + 1, targetLevel, list);
    }

    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();

        if (root == null)
            return result;

        int h = height(root);

        for (int i = 1; i <= h; i++) {
            List<Integer> level = new ArrayList<>();
            printLevel(root, 1, i, level);
            result.add(level);
        }

        return result;
    }
}