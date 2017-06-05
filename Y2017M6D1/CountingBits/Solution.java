package CountingBits;

/**
 * Created by Allan Wong on 2017/6/1.
 */
public class Solution {
    //Runtime:5ms Beats 17%
    //Referenced:Numberof1Bits.Solution.java
    public int[] countBits(int num) {
        int[] ans=new int[num+1];
        for(int i=0;i<=num;i++){
            ans[i]=hammingWeight(i);
        }
        return ans;
    }

    public int hammingWeight(int n) {
        int count=0;
        while(n!=0){
            n=n&(n-1);
            count++;
        }
        return count;
    }
    /*Runtime:2ms  DP!
    public int[] countBits(int num) {

        int[] res = new int[num+1];

        for(int i = 1; i <= num; i++)
        {
            res[i] = res[i >> 1] + (i & 1);
        }

        return res;

    }*/

}
