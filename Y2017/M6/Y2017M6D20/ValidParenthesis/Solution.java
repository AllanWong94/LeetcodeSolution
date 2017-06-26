package Y2017.M6.Y2017M6D20.ValidParenthesis;

import java.util.Stack;

/**
 * Created by Allan Wong on 2017/6/19.
 */
public class Solution {
    //Runtime:11ms Better than or equals to 41%
    //Can't ac. Reference:https://discuss.leetcode.com/topic/27572/short-java-solution
    //Caution:Only parenthesis appear in the string.
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            switch (c) {
                case '(':
                    stack.push(')');
                    break;
                case '[':
                    stack.push(']');
                    break;
                case '{':
                    stack.push('}');
                    break;
                default:
                    if (stack.isEmpty() || stack.pop() != c)
                        return false;
            }
        }
        return stack.isEmpty();
    }


    //Runtime:6ms
    //Comment:Avoided using Stack, instead use an array to fasten the operation.
    /*
    public boolean isValid(String s) {
        char[] stack = new char[s.length()];
        int sp = 0;
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack[sp++] = c;
            } else if (sp == 0) {
                return false;
            } else if (c == ')' && stack[--sp] != '(') {
                return false;
            } else if (c == ']' && stack[--sp] != '[') {
                return false;
            } else if (c == '}' && stack[--sp] != '{') {
                return false;
            }
        }
        return sp == 0;
    }
    */


    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println();
        System.out.println("Done.");
    }


}
