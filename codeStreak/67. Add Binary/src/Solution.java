public class Solution {
    public String addBinary(String a, String b) {
        int carry = 0;
        int al = a.length()-1, bl = b.length()-1;
        StringBuilder sb = new StringBuilder();
        while(al >=0 || bl>=0 || carry > 0){
            int x = al >= 0 ? a.charAt(al--) - '0' : 0;
            int y = bl >= 0 ? b.charAt(bl--) - '0' : 0;

            sb.append((x+y+carry)%2);
            carry = (x+y+carry)/2;
        }

        return sb.reverse().toString();
    }
}
