/*

For example:

    A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28


 */

public class Solution {
    public int titleToNumber(String columnTitle) {
        int res = 0;
        for(int i=0; i<columnTitle.length(); i++){
            res = res*26 + (columnTitle.charAt(i) - 'A' + 1);
        }
        return res;
    }
}