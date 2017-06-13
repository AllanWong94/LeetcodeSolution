package Y2017M6D13.SingleNumberII_NeedRevision;

/**
 * Created by Allan Wong on 2017/6/14.
 */
public class Solution {

    //Runtime:2ms Beats 65%  Reference: https://discuss.leetcode.com/topic/50315/a-summary-how-to-use-bit-manipulation-to-solve-problems-easily-and-efficiently/2
    //Counter of 3
    /*
    Current   Incoming   Next
    a   b       c       a   b
    0   0       0       0   0
    1   0       0       1   0
    0   1       0       0   1
    0   0       1       0   1
    0   1       1       1   0
    1   0       1       0   0

    public int singleNumber(int[] nums) {
        int t=0,a=0,b=0;
        for(int c:nums){
            t=(a&~b&~c)|(~a&b&c);
            b=(~a&b&~c)|(~a&~b&c);
            a=t;
        }
        return a|b;
    }*/
    //Runtime:
    /*



     */
    //singleNumber for all but one numbers appearing 5 times
    //Reference: https://discuss.leetcode.com/topic/2031/challenge-me-thx/18

    //Not clear: the order of calculation, the generation of the codes and the result
    int singleNumber(int A[]) {
        int na = 0, nb = 0, nc = 0;
        for(int i = 0; i < A.length; i++){
            nb = nb ^ (A[i] & na);
            na = (na ^ A[i]) & ~nc;
            nc = nc ^ (A[i] & ~na & ~nb);
        }
        return na & ~nb & ~nc;
    }


    public static void main(String[] args) {
        int[] k=new int[]{5,5,5,5,7,3,3,3,3,3,5};
        Solution s=new Solution();
        System.out.println("singleNumber: "+s.singleNumber(k));
        System.out.println("Done.");
    }






}
