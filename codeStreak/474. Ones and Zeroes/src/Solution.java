/*


Example 1:

Input: Array = {"10", "0001", "111001", "1", "0"}, m = 5, n = 3
Output: 4

Explanation: This are totally 4 strings can be formed by the using of 5 0s and 3 1s, which are “10,”0001”,”1”,”0”

Example 2:

Input: Array = {"10", "0", "1"}, m = 1, n = 1
Output: 2

Explanation: You could form "10", but then you'd have nothing left. Better form "0" and "1".
 */


public class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] max = new int[m + 1][n + 1];
        for (int i = 0; i < strs.length; i ++) {
            int one = 0;
            int zero = 0;
            for (int j = 0; j < strs[i].length(); j ++) {
                if (strs[i].charAt(j) == '0') {
                    zero ++;
                }
                else {
                    one ++;
                }
            }
            for (int k = m ; k >= zero; k --) {
                for (int l = n; l >= one; l --) {
                    max[k][l] = Math.max(max[k][l], max[k - zero][l - one] + 1);
                }
            }
        }
        return max[m][n];

    }
}