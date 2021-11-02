import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (words.length != pattern.length())
            return false;
        Map index = new HashMap();
        for (int i=0; i<words.length; ++i)
            if (!Objects.equals(index.put(pattern.charAt(i), i),
                    index.put(words[i], i)))
                return false;
        return true;
    }
}

/*
a bit safer improvement

public class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, Integer> m1 = new HashMap<>();
        Map<String, Integer> m2 = new HashMap<>();

        String[] words = s.split(" ");
        if(words.length != pattern.length()) return false;

        for(int i=0; i<pattern.length(); i++){
            if(!Objects.equals(m1.put(pattern.charAt(i), i),
                        m2.put(words[i], i))) return false;
        }
        return true;
    }
}
 */