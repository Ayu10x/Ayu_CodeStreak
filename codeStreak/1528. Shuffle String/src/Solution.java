public class Solution {
    public String restoreString(String s, int[] indices) {

        StringBuilder sol = new StringBuilder(s);
        int l = s.length();
        for(int i = 0; i < l ; i++){
            sol.setCharAt((indices[i]), s.charAt(i));
        }
        return sol.toString();
    }
}