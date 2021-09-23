public class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length == 0) return 0;

        int req_size = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] != val){
                nums[req_size] = nums[i];
                req_size++;
            }
        }
        return req_size;
    }
}


//Solution 2:

//public class Solution {
//    public int removeElement(int[] nums, int val) {
//        int start = 0, end = nums.length -1;
//        while (start <= end) {
//            if (nums[start] != val) {
//                start ++;
//                continue;
//            }
//            if (nums[end] == val) {
//                end --;
//                continue;
//            }
//            nums[start] = nums[end];
//            start ++;
//            end --;
//        }
//        return start;
//    }