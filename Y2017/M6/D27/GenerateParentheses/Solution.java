package Y2017.M6.D27.GenerateParentheses;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Allan Wong on 2017/6/26.
 */
public class Solution {
    //Runtime:4ms Better than or equals to 57%
    //Reference:https://discuss.leetcode.com/topic/8724/easy-to-understand-java-backtracking-solution
    /*
    public List<String> generateParenthesis(int n) {
        List<String> list=new LinkedList<>();
        recursive(list, "", 0, 0,n);
        return list;
    }

    public void recursive(List<String> list,String s, int open, int close, int n){
        if(s.length()==n*2){
            list.add(s);
            return;
        }
        if(open<n){
            recursive(list,s+"(",open+1,close,n);
        }
        if(close<open){
            recursive(list,s+")",open,close+1,n);
        }
    }

    //Runtime:
    */
    private List<String> generated;
    private char[] chars;

    public List<String> generateParenthesis(int n) {
        generated = new LinkedList<>();
        chars = new char[2 * n];
        generate(0, 0, n);
        return generated;
    }

    private void generate(int open, int closed, int n) {
        if(open + closed == 2* n) {
            generated.add(new String(chars));
            return;
        }

        if(open < n) {
            chars[open + closed] = '(';
            generate(open + 1, closed, n);
        }
        if(open >= closed + 1) {
            chars[open + closed] = ')';
            generate(open, closed + 1, n);
        }
    }



    public static void main(String[] args) {
        Solution s=new Solution();
        List res=s.generateParenthesis(3);
        System.out.println();
        System.out.println("Done.");
    }


}
