/*
Implement the MinStack class:

> MinStack() initializes the stack object.
> void push(int val) pushes the element val onto the stack.
> void pop() removes the element on the top of the stack.
> int top() gets the top element of the stack.
> int getMin() retrieves the minimum element in the stack.

Input
["MinStack","push","push","push","getMin","pop","top","getMin"]
[[],[-2],[0],[-3],[],[],[],[]]

Output
[null,null,null,null,-3,null,0,-2]

Explanation
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin(); // return -3
minStack.pop();
minStack.top();    // return 0
minStack.getMin(); // return -2

 */

import java.util.Stack;

public class MinStack {

    private Stack<Integer> data;
    private Stack<Integer> mins;

    public MinStack() {
        data = new Stack<Integer>();
        mins = new Stack<Integer>();
    }

    public void push(int val) {
        data.push(val);
        if (mins.isEmpty()) {
            mins.push(val);
        }
        else {
            mins.push(Math.min(val, mins.peek()));
        }
    }

    public void pop() {
        data.pop();
        mins.pop();
    }

    public int top() {
        return data.peek();
    }

    public int getMin() {
        return mins.peek();
    }
}
