public class ListNode {
    int val;
    ListNode next;
    ListNode (int x){
        val = x;
        next = null;
    }
}

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB){
        if(headA == null || headB == null) return null;

        int a = 0;
        int b = 0;
        ListNode ha = headA;
        ListNode hb = headB;
        while(ha != null || hb != null){
            if(ha != null){
                ha = ha.next;
                a++;
            }
            if(hb != null){
                hb = hb.next;
                b++;
            }
        }

        int delta = b - a;
        ha = headA;
        hb = headB;
        if(delta > 0){
            while(delta-- > 0){
                hb = hb.next;
            }
        }else if(delta < 0){
            while(delta++ <0){
                ha = ha.next;
            }
        }

        // ping ha and hb to the right pos in the list, so that both has k distance to the end.
        while(ha != null){
            if(ha == hb) return ha;
            ha = ha.next;
            hb = hb.next;
        }
        return null;
    }
}