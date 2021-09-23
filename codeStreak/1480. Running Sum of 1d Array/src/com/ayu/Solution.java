package com.ayu;

public class Solution {
    public int[] runningSum(int[] nums) {
        int resultarr[] = new int[nums.length];

        int sum=0;
        for(int i=0; i<nums.length; i++){
            sum = sum+nums[i];
            resultarr[i] = sum;
        }
        return resultarr;
    }
}
