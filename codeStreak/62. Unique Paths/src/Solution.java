public class Solution {
    public int uniquePaths(int m, int n) {
        int[] dp = new int[n];
        for(int i =0; i< n; i++) dp[i] = 1;

        for(int i=1; i < m;i++)
            for(int j=1;j<n;j++)
                dp[j] += dp[j-1];
        return dp[n-1];
    }
}

/*
O(mn), space(mn) : Solution

public class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int i=0; i<m;i++){
            dp[i][0] =1;
        }
        for(int i=0; i<n;i++){
            dp[0][i] =1;
        }

        for(int i=1; i<m; i++){
            for(int j=1;j<n;j++){
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
}
 */

/*
improve o(mn), space(2n): Solution

public class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[2][n];
        for(int i=0;i<n;i++){
            dp[0][i] = 1;
            dp[1][i] = 1;
        }
        int current =0;

        for(int i=1;i<m;i++){
            int next  = 1- current;
            for(int j=1; j<n;j++){
                dp[next][j] = dp[current][j] + dp[next][j-1];
            }
            current = 1- current; //current will be next.
        }

        return dp[current][n-1];// can use a simple example to figure out whether is current or 1-current.

    }
}
 */