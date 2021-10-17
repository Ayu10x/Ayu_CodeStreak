public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class solution{
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode p = dummy;
        int k = 0;
        while( ++k < left){
            if(p != null) p = p.next;
        }
        //TODO:
        ListNode tail = p.next;
        while(++k <= right){
            ListNode tmp = p.next;

            p.next = tail.next;
            tail.next = tail.next.next;
            p.next.next = tmp;
        }
        return dummy.next;
    }
}