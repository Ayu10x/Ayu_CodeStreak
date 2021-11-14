import java.util.Stack;

class MyQueue {
    Stack<Integer> data = new Stack<Integer>();
    // Push element x to the back of queue.
    public void push(int x) {
        Stack<Integer> reverse = new Stack<Integer>();
        while (data.size() > 0) {
            reverse.push(data.pop());
        }
        data.push(x);
        while (reverse.size() > 0) {
            data.push(reverse.pop());
        }
    }

    // Removes the element from in front of queue.
    public int pop() {
        return data.pop();
    }

    // Get the front element.
    public int peek() {
        return data.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return data.size() == 0;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */