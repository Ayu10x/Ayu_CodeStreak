class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
 }

public class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast!= null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode rev = reverse(slow.next);
        slow = head;
        fast = rev;
        while (fast != null) {
            if (slow.val != fast.val) {
                return false;
            }
            slow = slow.next;
            fast = fast.next;
        }
        return true;
    }
    private ListNode reverse(ListNode node) {
        ListNode reverse = new ListNode(-1);
        while (node != null) {
            ListNode next = node.next;
            node.next = reverse.next;
            reverse.next = node;
            node = next;
        }
        return reverse.next;
    }
}


/*
Solution: 2

public class Solution {
    private ListNode left = null;
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        left = head;
        return isP(head);
    }
    private boolean isP(ListNode right) {
        if (right == null) {
            return true;
        }
        if (!isP(right.next)) {
            return false;
        }
        boolean result = left.val == right.val;
        left = left.next;
        return result;
    }
}
 */