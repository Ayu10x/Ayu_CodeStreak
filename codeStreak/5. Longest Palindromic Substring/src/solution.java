public class Solution {
    public String longestPalindrome(String s) {
        boolean[][] isPa = new boolean[s.length()][s.length()];
        calIsPa(isPa, s);
        String longest = "";
        int max = 0;
        for (int i = 0; i < s.length(); i ++){
            for (int j = i; j < s.length(); j ++){
                if (isPa[i][j] == true && (j - i + 1) > max){
                    max = j - i + 1;
                    longest = s.substring(i, j + 1);
                }
            }
        }
        return longest;
    }
    private void calIsPa(boolean[][] isPa, String s){
        for (int i = 0; i < s.length(); i ++){
            isPa[i][i] = true;
        }
        for (int i = 0; i < s.length() - 1; i ++){
            if (s.charAt(i) == s.charAt(i+1)){
                isPa[i][i+1] = true;
            }
        }
        for (int l = 3; l <= s.length(); l ++ ){
            for (int i = 0; i < s.length() - l + 1; i ++){
                if (s.charAt(i) == s.charAt(i + l - 1) && isPa[i+1][i + l -2]){
                    isPa[i][i+ l - 1] = true;
                }
            }
        }
    }

}