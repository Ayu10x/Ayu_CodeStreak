class ListNode{
    int val;
    ListNode next;
    ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }
}

// 1 --> 2 --> 3 --> 4 --> 5 = 5 --> 4 --> 3 --> 2 --> 1

public class Solution {
    public ListNode reverseList(ListNode head) {

        ListNode prev = null;

        while(head != null){
           ListNode next_node = head.next;
           head.next = prev;
           prev = head;
           head = next_node;
        }
        return prev;
    }
}


/*
Recursion version:

public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode fakeHead = new ListNode(-1);
        reverse(head, fakeHead);
        return fakeHead.next;
    }
    //reverse returns the tail of the reversed list
    private ListNode reverse(ListNode node, ListNode fakeHead){
        if (node == null)
            return fakeHead;
        else{
            ListNode tail = reverse(node.next, fakeHead);
            tail.next = node;
            node.next = null;
            return node;
        }
    }
}
 */