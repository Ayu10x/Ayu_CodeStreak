public class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        for(int v : nums){
            res ^= v;
        }
        return res;
    }
}
