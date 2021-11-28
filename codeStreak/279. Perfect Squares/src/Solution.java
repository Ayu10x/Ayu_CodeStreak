public class Solution {
    public int numSquares(int n) {
        int[] nums = new int[n + 1];
        for (int i = 1; i < n + 1; i ++) {
            nums[i] = Integer.MAX_VALUE;
        }
        int up = (int) Math.sqrt(n);
        for (int i = 1; i < n + 1; i ++) {
            for (int j = 1; j <= up && j * j <= i; j ++) {
                if (j * j == i) {
                    nums[i] = 1;
                }
                else {
                    nums[i] = Math.min(nums[i], nums[i - j * j] + 1);
                }
            }
        }
        return nums[n];
    }
}