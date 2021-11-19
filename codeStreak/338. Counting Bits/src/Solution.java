public class Solution {
    public int[] countBits(int num) {
        int[] result = new int[num + 1];
        int pow = 1;
        int offset = 1;
        for (int i = 1; i <= num; i ++) {
            if (i == pow) {
                result[i] = 1;
                pow = pow << 1;
                offset = 1;
            }
            else {
                result[i] = result[offset] + 1;
                offset ++;
            }
        }
        return result;
    }
}