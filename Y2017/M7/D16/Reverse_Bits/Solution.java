package Y2017.M7.D16.Reverse_Bits;

/**
 * Created by Allan Wong on 7/16/2017.
 */
public class Solution {
    //Runtime:2ms Better than or equals to 100%
    public int reverseBits(int n) {
        if(n==0)
            return 0;
        int res=n&1,count=31;
        n=n>>1;
        while(n>0||count>0){
            res=res<<1;
            res+=n&1;
            n=n>>1;
            count--;
        }
        return res;
    }
    //Runtime:
    /*
    */




    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println();
        System.out.println("Done.");
    }


}
