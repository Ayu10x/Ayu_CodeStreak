public class Solution {
    public int integerReplacement(int n) {
        long t = n;
        int cnt = 0;
        while (t > 1) {
            ++cnt;
            if ((t&1) == 1) {
                if (((t&2) == 2) && (t != 3)) ++t;
                else --t;
            } else {
                t >>= 1;
            }
        }
        return cnt;
    }
}