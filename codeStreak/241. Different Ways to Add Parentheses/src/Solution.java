/*
Input: "2-1-1".

((2-1)-1) = 0
(2-(1-1)) = 2
Output: [0, 2] Example 2

Input: "23-45"

(2*(3-(4*5))) = -34
((2*3)-(4*5)) = -14
((2*(3-4))*5) = -10
(2*((3-4)*5)) = -10
(((2*3)-4)*5) = 10
Output: [-34, -14, -10, -10, 10]
 */

import java.util.LinkedList;
import java.util.List;
public class Solution {
    public List<Integer> diffWaysToCompute(String input) {
        List<Integer> result = new LinkedList<Integer>();
        for (int i = 0; i < input.length(); i ++) {
            char c = input.charAt(i);
            if (c == '+' || c == '-' || c == '*') {
                List<Integer> left = diffWaysToCompute(input.substring(0, i));
                List<Integer> right = diffWaysToCompute(input.substring(i + 1));
                for (Integer l:left) {
                    for (Integer r:right) {
                        result.add(cal(l, r, c));
                    }
                }
            }
        }
        if (result.size() == 0) {
            result.add(Integer.parseInt(input));
        }
        return result;
    }
    private int cal(int num1, int num2, char c) {
        if (c == '+') {
            return num1 + num2;
        }
        if (c == '-') {
            return num1 - num2;
        }
        if (c == '*') {
            return num1 * num2;
        }
        return 0;
    }
}