import java.util.ArrayList;
import java.util.List;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    class Solution {
        List<String> res = new ArrayList<>();
        public List<String> binaryTreePaths(TreeNode root) {

            if(root == null){
                return res;
            }

            buildPath(root, String.valueOf(root.val));
            return res;
        }

        void buildPath(TreeNode root, String list){
            if(root.left == null && root.right == null){
                res.add(list);
                return;
            }
            if(root.left != null){
                buildPath(root.left, list + "->" + String.valueOf(root.left.val));
            }

            if(root.right != null){
                buildPath(root.right, list + "->" + String.valueOf(root.right.val));
            }
        }
    }
