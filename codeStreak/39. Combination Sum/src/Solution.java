import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(candidates);
        dfs(candidates, 0, list, 0, target);

        return res;
    }

    private void dfs(int[] candidates, int start, List<Integer>result, int sum, int target){
        if(sum == target){
            res.add(new ArrayList<Integer>(result));
            return;
        }
        for(int i=start; i < candidates.length;i++){
            if(i > start && candidates[i] == candidates[i-1]) continue; // if the set doesn't contains duplicates, then this line won't be needed.
            if(candidates[i] + sum > target) break ;

            result.add(candidates[i]);
            dfs(candidates, i, result, sum+candidates[i], target);
            result.remove(result.size() -1);
        }
    }
}
