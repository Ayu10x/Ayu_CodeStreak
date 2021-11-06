public class Solution {
    public boolean detectCapitalUse(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i ++) {
            char c = word.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                count ++;
            }
            if (!(count == 0 || (count == 1 && word.charAt(0) >= 'A' && word.charAt(0) <= 'Z') || count == i + 1)) {
                return false;
            }
        }
        return true;
    }
}