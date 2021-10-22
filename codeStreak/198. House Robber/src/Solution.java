public class Solution {
    public int rob(int[] nums) {
        if(nums ==null || nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];

        int prev=0; // res[i-1]
        int cur=0; // res[i];


        for(int i=0; i< nums.length;i++){
            int m = prev, n = cur;
            cur = prev + nums[i];
            prev = Math.max(m,n);
        }

        return Math.max(cur,prev);
    }
}

/*
Other Solutions:

//Using DP

public class Solution {
    public int rob(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        if(nums.length < 2) return nums[0];

        int[] res = new int[nums.length];
        res[0] = nums[0];
        res[1] = nums[0] > nums[1] ? nums[0] : nums[1];
        for(int i=2; i< nums.length; i++){
            res[i] = Math.max(res[i-2] + nums[i], res[i-1]);
        }

        return res[nums.length-1];

    }
}

//

public class Solution {
    public int rob(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];

        int prev2 = nums[0];
        int prev1 = nums[0] > nums[1] ? nums[0] : nums[1];

        for(int i=2; i< nums.length; i++){
            int tmp = prev1;
            prev1 = Math.max(nums[i]+prev2, prev1);
            prev2 = tmp;
        }
        return prev1;
    }
}

 */