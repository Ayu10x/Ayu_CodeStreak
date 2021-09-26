/*
Time: O(n)
 */

public class Solution {
    public int maxProfit(int[] prices) {
        int sol = 0;
        if(prices == null || prices.length <= 1) return sol;

        int min = prices[0];
        for(int i=1; i<prices.length; i++){
            if(prices[i] > min){
                sol = Math.max(sol, prices[i] - min);
            }else {
                min = prices[i];
            }
        }
        return sol;
    }
}


/*
classic solution, will time limit exceeded. O(n^2)

public class Solution {
    public int maxProfit(int[] prices) {
        int res = 0;
        if(prices == null || prices.length <= 1) return res;
        int[] dp = new int[prices.length];

        dp[0] = 0;
        for(int i=1; i<dp.length; i++){
            for(int j=0; j<i; j++){
                dp[i] = Math.max(prices[i]-prices[j], dp[i]);
            }
            res = Math.max(dp[i], res);
        }

        return res;
    }
}


 */