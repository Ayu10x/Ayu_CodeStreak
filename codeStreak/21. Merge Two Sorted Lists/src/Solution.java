class ListNode{
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }
}

public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode fakeNode = new ListNode(-1);
        ListNode node = fakeNode;
        while (l1 != null && l2 != null){
            if (l1.val < l2.val){
                node.next = l1;
                l1 = l1.next;
                node = node.next;
            }//if
            else{
                node.next = l2;
                l2 = l2.next;
                node = node.next;
            }//else
        }//while l1 & l2
        if (l1 != null){
            node.next = l1;
        }
        else if (l2 != null){
            node.next = l2;
        }
        return fakeNode.next;
    }
}
