public class Solution {
    public int[] twoSum(int[] num, int target) {
        int l =0;
        int r = num.length -1;
        while(l < r){
            if(num[l] + num[r] == target) return new int[]{l+1,r+1};// convert into 1-based.
            else if(num[l] + num[r] > target){
                r--;
            }else{
                l++;
            }
        }

        return new int[0];
    }
}