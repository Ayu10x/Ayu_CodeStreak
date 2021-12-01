public class Solution {
    public int subtractProductAndSum(int n) {
        int m = 1, s = 0, d = -1;

        while(n!=0){
            d =n % 10;
            n /= 10;
            m *= d;
            s += d;
        }
        return m - s;
    }
}