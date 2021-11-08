/*
/*
    Problem: Given an array of 2n integers, your task is to group these integers into n pairs of integer, say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) for all i from 1 to n as large as possible.
Example 1:
Input: [1,4,3,2]
Output: 4
Explanation: n is 2, and the maximum sum of pairs is 4 = min(1, 2) + min(3, 4).
 */

import java.util.Arrays;

public class Solution {
    /*
        Solution: First sort the input array, then pair up elements next to each other that way we dont
        loose much to Math.min() between pair
     */
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for(int i = 0 ; i < nums.length-1; i= i+2){
            sum = sum+ Math.min(nums[i],nums[i+1]);
        }
        return sum;
    }
}