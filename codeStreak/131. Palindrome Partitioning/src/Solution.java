/*

example, given s = "aab", Return

[
  ["aa","b"],
  ["a","a","b"]
]

 */


import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<List<String>> res = new ArrayList<>();
    public List<List<String>> partition(String s) {
        if(s == null || s.length() == 0) return res;
        part(s, 0, new ArrayList<String>());
        return res;
    }

    void part(String s, int start, List<String> list){
        if(s.length() == start){
            res.add(new ArrayList<String>(list));
            return;
        }

        for(int i=start+1; i<= s.length(); i++){
            String st = s.substring(start, i);
            if(isP(st)){
                list.add(st);
                part(s, i, list);
                list.remove(list.size()-1);
            }
        }
    }

    boolean isP(String s){
        int l = 0;
        int r = s.length()-1;
        while(l < r){
            if(s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}