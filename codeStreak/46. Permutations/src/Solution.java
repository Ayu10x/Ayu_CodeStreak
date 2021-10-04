/*
For example, [1,2,3] have the following permutations:
[
  [1,2,3],
  [1,3,2],
  [2,1,3],
  [2,3,1],
  [3,1,2],
  [3,2,1]
]
 */


import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> list = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        permute_(nums, 0, nums.length-1);

        return res;
    }

    private void permute_(int[] nums, int start, int end){
        if(start == end){
            List<Integer> l = new ArrayList<>();
            for(int v : nums) l.add(v);
            res.add(l);
            return;
        }

        for(int i=start; i<=end; i++){
            swap(nums, i, start);
            permute_(nums, start+1, end);
            swap(nums, i, start);
        }
    }

    private void swap(int[] nums, int l, int r){
        if(r == l) return;
        int t = nums[l];
        nums[l] = nums[r];
        nums[r] = t;
    }
}
