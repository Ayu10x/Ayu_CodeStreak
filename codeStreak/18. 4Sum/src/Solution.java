import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {


    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> fourSum(int[] nums, int target) {

        if(nums == null || nums.length == 0) return res;

        Arrays.sort(nums);

        for(int i=0; i< nums.length -3; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            for(int j= i+1; j< nums.length -2; j++){
                if(j > i+1 && nums[j] == nums[j-1]) continue;
                int l = j+1;
                int r = nums.length-1;

                while(l < r){
                    int sum = nums[i] + nums[j] + nums[l] + nums[r];
                    if(sum == target){
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[l]);
                        list.add(nums[r]);
                        res.add(list);
                        l++;
                        r--;
                        while(l<r && nums[l] == nums[l-1]) l++;
                        while(l<r && nums[r] == nums[r+1]) r--;
                    }else if(sum < target){
                        l++;
                    }else{
                        r--;
                    }

                }
            }
        }
        return res;
    }
}