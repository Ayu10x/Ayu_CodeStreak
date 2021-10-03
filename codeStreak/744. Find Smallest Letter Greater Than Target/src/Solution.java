public class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int left = 0, right = letters.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (letters[mid] <= target) {
                left ++;
            }
            else {
                right --;
            }
        }
        if (left == letters.length) {
            return letters[0];
        }
        return letters[left];
    }
}



/*
Solution 2 :

public class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        Character minInGreater = null;
        Character min = null;
        for (int i = 0; i < letters.length; i ++) {
            char c = letters[i];
            if (min == null || c < min) {
                min = c;
            }
            if (c > target && (minInGreater == null || c < minInGreater)) {
                minInGreater = c;
            }
        }
        return minInGreater == null? min:minInGreater;
    }
}
*/