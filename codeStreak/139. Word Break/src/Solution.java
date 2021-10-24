import java.util.List;

public class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] res = new boolean[s.length() +1];
        String t = "*" + s;
        res[0] = true;

        for(int i=1; i< t.length(); i++){
            for(int k = 0; k< i; k++){
                res[i] = res[k] && wordDict.contains(t.substring(k+1, i+1)); // this is i+1 cause we are calculating res[i], so charAt(i) should be included;
                if(res[i]) break;
            }
        }

        return res[res.length-1];
    }
}