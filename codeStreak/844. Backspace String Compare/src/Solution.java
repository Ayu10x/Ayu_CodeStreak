/*
Input: s = "ab#c", t = "ad#c"
Output: true
Explanation: Both s and t become "ac".
 */

public class Solution {
    public boolean backspaceCompare(String s, String t) {
        int i = s.length() - 1, j = t.length() - 1;
        while (true) {
            for (int back = 0; i >= 0 && (back > 0 || s.charAt(i) == '#'); --i)
                back += s.charAt(i) == '#' ? 1 : -1;
            for (int back = 0; j >= 0 && (back > 0 || t.charAt(j) == '#'); --j)
                back += t.charAt(j) == '#' ? 1 : -1;
            if (i >= 0 && j >= 0 && s.charAt(i) == t.charAt(j)) {
                i--;
                j--;
            } else
                return i == -1 && j == -1;
        }
    }
}