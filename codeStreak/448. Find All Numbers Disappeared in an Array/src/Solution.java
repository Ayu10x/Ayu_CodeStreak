import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for(int i = 0; i< nums.length; i++){
            int curr = Math.abs(nums[i]);
            nums[curr - 1] = -(Math.abs(nums[curr-1]));
        }
        List<Integer> res = new ArrayList<>();
        for(int i=0; i< nums.length; i++){
            if(nums[i] > 0){
                res.add((i+1));
            }
        }
        return res;
    }
}


//Solution-2
/*
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> missingNumbers = new ArrayList<>();

        HashSet<Integer> numbers = new HashSet<>(); // for Dealing with Repeated Numbers
        for(int i : nums) {
            numbers.add(i);
        }

        for (int i=1; i<= nums.length; i++){
            if(!numbers.contains(i)){
                missingNumbers.add(i);
            }
        }
        return missingNumbers;
    }
}
 */