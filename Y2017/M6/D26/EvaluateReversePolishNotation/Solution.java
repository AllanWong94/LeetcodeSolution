package Y2017.M6.D26.EvaluateReversePolishNotation;

import java.util.Stack;

/**
 * Created by Allan Wong on 2017/6/26.
 */
public class Solution {
    //Runtime:15ms Better than or equals to 55%
    public int evalRPN(String[] tokens) {
        Stack<Integer> values = new Stack<>();
        int count=0;
        for(String s:tokens){
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                int val2 = values.pop(), val1 = values.pop();
                int res = 0;
                switch (s) {
                    case "+":
                        res = val1 + val2;
                        break;
                    case "-":
                        res = val1 - val2;
                        break;
                    case "*":
                        res = val1 * val2;
                        break;
                    case "/":
                        res = val1 / val2;
                        break;
                }
                values.push(res);
            }else {
                values.push(Integer.parseInt(s));
            }
        }
        return values.pop();
    }
    //Runtime:4ms
    /* Iterate backwards
    public class Solution {
        int p;

        public int evalRPNHelper(String[] tokens) {
            String c = tokens[p--];
            if(c.equals("+")){
                int b = evalRPNHelper(tokens);
                int a = evalRPNHelper(tokens);
                return a + b;
            }else if(c.equals("-")){
                int b = evalRPNHelper(tokens);
                int a = evalRPNHelper(tokens);
                return a - b;
            }else if(c.equals("*")){
                int b = evalRPNHelper(tokens);
                int a = evalRPNHelper(tokens);
                return a * b;
            }else if(c.equals("/")){
                int b = evalRPNHelper(tokens);
                int a = evalRPNHelper(tokens);
                return a / b;
            }else
                return Integer.parseInt(c);
        }

        public int evalRPN(String[] tokens) {
            p = tokens.length - 1;
            return evalRPNHelper(tokens);
        }
    }
    */

    public static void main(String[] args) {
        Solution s = new Solution();
        String[] strings = {"2", "1", "+", "3", "*"};
        int res = s.evalRPN(strings);
        String s1="+";
        System.out.println(s1.equals("+"));
        System.out.println("Done.");
    }


}
