class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) return false;
        ListNode p = head, q = head.next;
        while(p != null && q != null){
            if(p == q) return true;
            p = p.next;
            q = q.next;
            if(q != null) q = q.next;
        }
        return false;
    }
}
