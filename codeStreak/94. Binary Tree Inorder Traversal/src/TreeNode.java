import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();

        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while(!stack.isEmpty()  || node != null){
            while(node != null){
                stack.push(node);
                node = node.left;
            }

            TreeNode top = stack.pop();
            res.add(top.val);
            node = top.right;
        }
        return res;
    }
}