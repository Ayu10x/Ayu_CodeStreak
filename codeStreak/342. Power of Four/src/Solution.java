public class Solution {
    public boolean isPowerOfFour(int num) {
        if (num <= 0) {
            return false;
        }
        while (num > 3) {
            if (num % 4 != 0) {
                return false;
            }
            num = num / 4;
        }
        return num == 1;
    }
}

/*

public class Solution {
    public boolean isPowerOfFour(int num) {
        return num == 1 || num == 4 || num == 16 || num == 64 || num == 256 || num == 1024 || num == 4096 || num == 16384 || num == 65536 || num == 262144 || num == 1048576 || num == 4194304 || num == 16777216 || num == 67108864 || num == 268435456 || num == 1073741824;
    }
}

 */

/*
public class Solution {
    public boolean isPowerOfFour(int num) {
        if (num <= 0) {
            return false;
        }
        double res = Math.log10(num) / Math.log10(4);
        return Double.compare(res, (int)res) == 0;
    }
}
 */