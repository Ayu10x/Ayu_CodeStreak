public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int pivot = 1;
        int sum = 0;
        for (int i = 0; i < 32; i ++){
            int p = pivot << i;
            if ((n & p) == p)
                sum ++;
        }
        return sum;
    }
}

/*
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int mask = 1;
        int count = 0;
        for (int i = 0; i < 32; i ++) {
            if ((n & mask) != 0) {
                count ++;
            }
            mask = (mask << 1);
        }
        return count;
    }
}
 */