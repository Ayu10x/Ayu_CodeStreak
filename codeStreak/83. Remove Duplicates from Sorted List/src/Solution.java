class ListNode{
    int val;
    ListNode next;
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

// 1 --> 1 --> 2 = 1 --> 2

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode p = head;
        while(p.next != null){
            if(p.val == p.next.val){
                p.next = p.next.next;
            }
            else{
                p= p.next;
            }
        }
        return head;
    }
}
