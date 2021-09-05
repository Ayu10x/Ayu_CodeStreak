// Optimal Solution solution 1, n*(n+1)/2 - sum(array)


public class Solution {
    public int missingNumber(int[] nums) {

        int sum = 0;
        for (int i : nums){
            sum+=i;
        }

        int n = nums.length + 1;
        return (n*(n-1)/2) - sum;
    }
}



/*
bit manipulation.(Solution)

public class Solution {
    public int missingNumber(int[] nums) {

        int res = 0;
        for(int i=0; i<nums.length; i++){

            res ^=(i+1) ^ nums[i];

            return res;
        }
        return -1;
    }
}

 */


/*

(Solution) Using HashSet

import java.util.HashSet;

public class Solution {
    public int missingNumber(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }

        for (int i = 0; i < nums.length; i++) {

            if(!set.contains(i)){
                return i;
            }
        }
        return -1;
    }
}

 */