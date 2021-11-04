import java.util.HashMap;

class Node {
    public int label;
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null) return null;
        Node curr = head;
        HashMap<Node, Node> map = new HashMap<>();
        //Copy all the nodes and push into hashmap
        while(curr != null){
            map.put(curr, new Node(curr.val)); //assign new node with value;
            curr = curr.next;
        }
        curr = head;
        //Pick each node in the map or the list and assign next and random pointers
        while(curr != null){
            map.get(curr).next = map.get(curr.next);
            map.get(curr).random = map.get(curr.random);
            curr = curr.next;
        }
        // Finally, return new head from map
        return map.get(head);
    }
}