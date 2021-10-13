import java.util.ArrayList;
import java.util.List;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        List<Integer> list = getValueList(list1);

        int end = list.get(list.size()-1);
        ListNode answer = new ListNode(list.get(end));
        for(int i=end-1; i> b; i--){
            answer = new ListNode(list.get(i), answer);
        }

        int max = getMax(list2);
        for(int i=max; i>= 1000000; i--){
            answer = new ListNode(i, answer);
        }

        for(int i=a-1; i >= 0; i--){
            answer = new ListNode(list.get(i), answer);
        }

        return answer;
    }
    public int getMax(ListNode list){
        int max = 0;
        while(list != null){
            if(list.next == null){
                max = list.val;
            }
            list = list.next;
        }
        return max;
    }
    public List<Integer> getValueList(ListNode list){
        List<Integer> arrList = new ArrayList<>();
        while(list != null){
            arrList.add(list.val);
            list = list.next;
        }
        return arrList;
    }
}


/*
Solution: 2
public class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {

        ListNode temp = new ListNode(0);
        temp.next = list1;
        ListNode front = temp;
        ListNode back = temp;

        for(int i = 0; i < a; i++){
            front = front.next;
        }
        front.next = list2;

        while(list2.next != null){
            list2 = list2.next;
        }
        for(int i = 0; i <= b; i++){
            back = back.next;
        }
        list2.next = back.next;

        return temp.next;
    }
 }
 */