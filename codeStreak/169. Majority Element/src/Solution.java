public class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int major = 0;
        for(int val : nums){
            if(count == 0){
                major = val;
                count =1;
                continue;
            }
            if(major == val) count++;
            else count--;
        }
        return major;

    }
}