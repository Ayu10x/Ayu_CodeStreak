import java.util.Comparator;
import java.util.PriorityQueue;

public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


class Solution {
    public ListNode mergeKLists(ListNode[] lists) {

        PriorityQueue<ListNode> q = new PriorityQueue<ListNode>(Math.max(1,lists.length), new Comparator<ListNode>() {
            @Override
            public int compare(ListNode e1, ListNode e2) {
                return e1.val - e2.val;
            }
        });
        for (int i = 0; i < lists.length; i ++) {
            if (lists[i] != null) {
                q.add(lists[i]);
            }
        }
        ListNode fakeHead = new ListNode(-1);
        ListNode p = fakeHead;
        while (!q.isEmpty()) {
            ListNode n = q.poll();
            if (n.next != null) {
                q.add(n.next);
            }
            n.next = null;
            p.next = n;
            p = n;
        }
        return fakeHead.next;
    }
}