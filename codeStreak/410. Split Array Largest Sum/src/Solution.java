class Solution {
    public int splitArray(int[] nums, int m) {
        int n = nums.length;
        long left = 0, right = 0;
        for (int num : nums) {
            left = Math.max(left, num);
            right += num;
        }
        if (m == 1) return (int) right;
        while (left < right) {
            long mid = left + (right - left) / 2;
            if (validGroup(nums, mid, m)) right = mid;
            else left = mid + 1;
        }
        return (int) right;
    }

    private boolean validGroup(int[] nums, long target, int m) {
        int count = 1;
        long sum = 0;
        for (int num : nums) {
            sum += num;
            if (sum > target) {
                count++;
                sum = num;
                if (count > m) return false;
            }
        }
        return true;
    }
}

/*
Example:

Input:
nums = [7,2,5,10,8]
m = 2

Output:
18

Explanation:
There are four ways to split nums into two subarrays.
The best way is to split it into [7,2,5] and [10,8],
where the largest sum among the two subarrays is only 18.
Thought Process
Brute Force
Cutting at every position, we have n - 1Cm - 1 possibilities
Time complexity O(n^m)
Space complexity O(n)
Dynamic Programing
Create an array dp, and dp[i][j] indicates the minimum of max sum splitting into i parts with j elements
Since each new split depends on previous split and loop 1 parts to m parts using i pointer
Also, current elements depends result of previous element range from 0 to j - 1
Therefore, dp[i][j] depends on dp[i - 1][k] where k range from 0 to j - 1 (or i - 1 to j - 1 because i - 1 is min index needed for having enough element for i parts)
Time complexity O(n^2m)
Space complexity O(n)
Binary Search
The result must lie between the max element and sum, referring as left and right pointer
Using binary search to search the mid value, we count how many element we need to split
If the count is greater than m, that mean our mid is too small so we need to increase our left pointer
Otherwise we decrease the right pointer
Time complexity O(nlog(s)) where n is number of elements and s is sum of array
Space complexity O(1)
 */