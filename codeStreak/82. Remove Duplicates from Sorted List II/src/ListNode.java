public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode tail = dummy;
        ListNode prev = head;
        ListNode cur = head;

        while(cur != null && cur.next != null){
            while(cur.next != null && cur.val == cur.next.val){
                cur = cur.next;
            }
            if(cur == prev){
                tail.next = cur;
                tail = tail.next;
            }
            prev = cur.next;
            cur = cur.next;
        }
        tail.next = cur;
        return dummy.next;

    }
}