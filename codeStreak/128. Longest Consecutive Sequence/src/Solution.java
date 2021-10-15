import java.util.HashSet;

public class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        int max = 0;
        for(int val : nums){
            if(set.contains(val)){
                set.remove(val);
                int low = val -1;
                while(set.contains(low)){
                    set.remove(low);
                    low--;
                }
                int up = val + 1;
                while(set.contains(up)){
                    set.remove(up);
                    up++;
                }
                max = Math.max(max, (up - low - 1));
            }
        }
        return max;
    }
}
