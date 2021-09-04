
/* Best Solution

O(n)Time complexity
O(1)Space Complexity

Using Floyd's Tortoise and Hare Algorithm

* */

public class Solution {

    public int findDuplicate(int[] nums) {
        int slow = 0;
        int fast = 0;
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        fast = 0;
        while (fast != slow) {
            fast = nums[fast];
            slow = nums[slow];
        }
        return fast;
    }
    }




/*

O(nlgn) Solution.
Space Complexity ---->O(1)

import java.util.Arrays;

public class Solution {

    public int findDuplicate(int[] nums){

        Arrays.sort(nums);

        int res = -1;
        for(int i=1; i< nums.length; i++){

            if (nums[i] == nums[i-1]){
                res = nums[1];
                break;
            }
        }
        return res;
    }
}

 */

/*

O(n) Solution.(Time complexity)
O(n) (Space Complexity)

public class Solution {

    public int findDuplicate(int[] nums){

        for(int i=0; i< nums.length; i++){
            if(nums[i] == i+1) continue;
            else if(nums[nums[i]-1] != nums[i]){
                int t =nums[nums[i] -1];
                nums[nums[i]-1] = nums[i];
                nums[i] = t;
                i--;
            }
        }

        int res = 0;
        for(int i=0; i< nums.length; i++){
            if(nums[i] != i+1){
                res = nums[i];
                break;
            }
        }
        return res;
    }
}

 */