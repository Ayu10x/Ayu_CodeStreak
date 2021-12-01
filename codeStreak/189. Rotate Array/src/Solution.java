public class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if(n <=1) return; // no need to rotate.
        k = k % n;
        if(k == 0) return;

        swap(nums, 0, n-1);
        swap(nums, 0, k-1);
        swap(nums, k, n-1);

    }

    void swap(int[] nums, int l, int r){
        while(l<r){
            int t = nums[l];
            nums[l] = nums[r];
            nums[r] = t;
            l++;
            r--;
        }
    }
}