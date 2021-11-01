public class Solution {
    public int balancedStringSplit(String s) {
        int res = 0;
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'L') {
                counter++;
            } else {
                counter--;
            }
            if (counter == 0) {
                res++;
            }
        }
        return res;
    }
}