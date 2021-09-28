public class Solution {
    public int climbStairs(int n) {
        //simple dp
        if(n<=2) return Math.max(n, 0); // or n > 0 ? n : 0;
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for(int i=3; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}

/*
Solution2
constant space.

public class Solution {
    public int climbStairs(int n) {
        // simple dp
        if(n <=2) return n > 0 ? n : 0;
        int dp1 = 1, dp2 = 2, res =0;
        for(int i=3; i<=n; i++){
            res = dp1+dp2;
            dp1 = dp2;
            dp2 = res;
        }

        return res;

    }
}
 */

/*
Solution3
less variable

public class Solution {
    public int climbStairs(int n) {
        if(n <=2 ) return n;
        int prev2 = 1;
        int prev1 = 2;
        for(int i=3; i<=n; i++){
            prev1 = prev1 + prev2;
            prev2 = prev1 - prev2;
        }
        return prev1;
    }
}

 */