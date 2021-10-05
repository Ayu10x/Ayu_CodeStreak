public class ListNode {
    int val;
    ListNode next;
    ListNode(){}
        ListNode(int val, ListNode next){
            this.val = val; this.next = next;
        }
}
class Solution {
    public int getDecimalValue(ListNode head) {
        int decimalValue = 0;
        ListNode temp = head;
        while (temp != null) {
            decimalValue <<= 1;
            decimalValue += temp.val;
            temp = temp.next;
        }
        return decimalValue;
    }
}