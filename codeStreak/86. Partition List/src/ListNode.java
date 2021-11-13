/*
Given 1->4->3->2->5->2 and x = 3,
return 1->2->2->4->3->5.
 */

  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode gt = new ListNode(-1);
        ListNode lt = new ListNode(-1);
        ListNode t1 = gt;
        ListNode t2 = lt;

        while(head != null){
            if(head.val < x){
                t2.next = head;
                t2 = t2.next;
            }else{
                t1.next = head;
                t1 = t1.next;
            }
            head = head.next;
        }

        t2.next = gt.next;
        t1.next = null;
        return lt.next;
    }
}