class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
}


public class Solution {
    public TreeNode increasingBST(TreeNode root) {
        // corner cases
        if (root == null) {
            return null;
        }
        return inorder(root, null);
    }

    private TreeNode inorder(TreeNode root, TreeNode tail) {
        // corner cases
        if (root == null) {
            return tail;
        }

        TreeNode head = inorder(root.left, root);
        root.left = null;
        root.right = inorder(root.right, tail);
        return head;
    }
}
