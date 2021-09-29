public class Solution {
    public int maxSubArray(int[] nums) {
        int sum =0, max = 0;
        for(int i=0; i< nums.length; i++){
            sum += nums[i];
            if(sum > max || i == 0) max = sum;
            if(sum < 0) sum =0;// if the sum goes below zero, reset the sum to zero as it start counting from next item.
        }

        return max;
    }
}