import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int lastDupIndex = -1;
        int maxSize = 0;
        char [] chars = s.toCharArray();
        for(int i=0;i<chars.length;i++) {
            Integer lastIndex = map.get(chars[i]);
            if (lastIndex != null && lastDupIndex < lastIndex) {
                lastDupIndex = lastIndex;
            }
            maxSize = Math.max(maxSize, i-lastDupIndex);
            map.put(chars[i], i);
        }

        return maxSize;
    }
}