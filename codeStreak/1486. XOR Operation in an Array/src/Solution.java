public class Solution {
    public int xorOperation(int n, int start) {
        int res = 0;
        int curr = start;
        for (int i = 0; i < n; i++) {
            res ^= curr;
            curr += 2;
        }
        return res;
    }
}
