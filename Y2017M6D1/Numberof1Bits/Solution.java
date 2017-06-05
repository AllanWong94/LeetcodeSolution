package Numberof1Bits;

/**
 * Created by Allan Wong on 2017/6/1.
 */
public class Solution {

    //Runtime:2ms Beats 16%
    // you need to treat n as an unsigned value
    /*public int hammingWeight(int n) {
        int count=0;
        while(n!=0){
            n=n&(n-1);
            count++;
        }
            return count;
    }
*/

    //Improved version
    public int hammingWeight(int n) {
        int count = 0;
        for(int i=0; i<32; i++){
            count += (n >> i & 1);
        }
        return count;
    }


/*
    Runtime:1ms
    No need to and every bit every time!
    public int hammingWeight(int n) {
        int count = 0;
        for(int i=0; i<32; i++){
            count += (n >> i & 1) == 1 ? 1: 0;
        }
        return count;
    }*/



    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println( s.hammingWeight(0));

    }
}
