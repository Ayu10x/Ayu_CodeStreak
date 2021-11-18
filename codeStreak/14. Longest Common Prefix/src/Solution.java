public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        if (strs.length == 1) {
            return strs[0];
        }

        int lengthOfCommanPrefix = 0;
        while(true) {
            for(int i=0;i<strs.length;i++) {
                if (strs[i] == null) {
                    return "";
                }

                if (lengthOfCommanPrefix >= strs[i].length()){
                    return strs[i];
                }


                if (i > 0 && (strs[i].charAt(lengthOfCommanPrefix) !=  strs[i-1].charAt(lengthOfCommanPrefix))) {
                    return strs[i].substring(0, lengthOfCommanPrefix);
                }
            }
            lengthOfCommanPrefix ++;
        }

    }
}