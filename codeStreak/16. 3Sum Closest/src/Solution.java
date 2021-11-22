import java.util.Arrays;

public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        if (nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        int closed = 0;
        for (int i = 0; i < nums.length; i ++){
            if (i == 0 || nums[i] != nums[i-1]){
                int start = i + 1;
                int end = nums.length - 1;
                while (start < end){
                    int sum = nums[i] + nums[start] + nums[end];
                    if (Math.abs(sum - target) < min){
                        min = Math.abs(sum - target);
                        closed = sum;
                    }
                    if (sum < target){
                        start ++; }
                    else{ // >= target
                        end --;
                    }//if
                }//while
            }//if
        }//for
        return closed;
    }
}