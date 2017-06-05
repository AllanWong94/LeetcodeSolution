package SumofTwoIntegers;

/**
 * Created by Allan Wong on 2017/5/30.
 */
public class Solution {
    //Bitwise Ops Guide:https://discuss.leetcode.com/topic/50315/a-summary-how-to-use-bit-manipulation-to-solve-problems-easily-and-efficiently
    //Runtime:0ms
    public int getSum(int a, int b) {        return b==0?a:getSum(a^b,(a&b)<<1);}

    public static void main(String[] args) {
        int N=16;
        N = N | (N>>1);
        N = N | (N>>2);
        N = N | (N>>4);
        N = N | (N>>8);
        N = N | (N>>16);
        System.out.println((N+1)>>1);
    }
}
