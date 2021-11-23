import java.util.Stack;

public class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        String ops = "+-/*";
        for(String s : tokens){
            if(ops.indexOf(s) == -1){
                stack.push(Integer.valueOf(s));
            }else{
                if(stack.size() < 2){
                    throw new RuntimeException("Invalid expression");
                }
                int second = stack.pop();
                int first = stack.pop();
                int res = 0;
                char op = s.charAt(0);
                switch(op){
                    case '+':
                        res = first + second;
                        break;
                    case '-':
                        res = first - second;
                        break;
                    case '*':
                        res = first * second;
                        break;
                    case '/':
                        //exceptions.
                        res = first/second;
                        break;
                    default:
                        throw new RuntimeException("Invalid operation");
                }
                stack.push(res);
            }

        }
        return stack.pop();
    }
}