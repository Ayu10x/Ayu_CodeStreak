class ListNode{
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}


public class Solution {
    public ListNode insertionSortList(ListNode head) {
        ListNode fakeHead = new ListNode(Integer.MIN_VALUE);
        while (head != null){
            ListNode p = fakeHead;
            while (p != null) {
                if ( head.val >= p.val && (p.next == null || head.val <= p.next.val)) {
                    ListNode next = head.next;
                    head.next = p.next;
                    p.next = head;
                    head = next;
                    break;
                }
                p = p.next;
            }
        }
        return fakeHead.next;
    }
}