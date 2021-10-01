class ListNode{
int val;
ListNode next;
ListNode(int x) {
    val = x;
}
}


public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(val - 1);

        dummy.next =head;
        head = dummy;
        // if head.next is the val, remove it, don't update head, continue to check new next.
        // otherwise udpate it.
        while(head.next != null){
            if(head.next.val == val){
                head.next = head.next.next;
            }else
                head = head.next;
        }

        return dummy.next;
    }
}
