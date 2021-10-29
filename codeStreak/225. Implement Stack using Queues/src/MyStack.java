import java.util.LinkedList;
import java.util.Queue;

public class MyStack {

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    // Push element x onto stack.
    public void push(int x) {
        q2.offer(x);
        while(!q1.isEmpty()){
            q2.offer(q1.poll());
        }
        Queue<Integer> q;
        q = q1;
        q1 = q2;
        q2 = q;
    }

    // Removes the element on top of the stack.
    public int pop() {
        return q1.poll();
    }

    // Get the top element.
    public int top() {
        return q1.peek();
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return q1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */