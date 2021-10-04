public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

/*
Input: nums = [-10,-3,0,5,9]
Output: [0,-3,9,-10,null,5]
 */

class Solution{
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums == null) return null;
        return subArrayBuilder(nums, 0 , nums.length - 1);
    }
    private TreeNode subArrayBuilder(int[] nums, int left, int right){
        if(left > right) return null;
        if(left == right) return new TreeNode(nums[left]);

        int mid = left + (right-left)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = subArrayBuilder(nums, left, mid-1);
        root.right = subArrayBuilder(nums, mid+1, right);

        return root;
    }

}