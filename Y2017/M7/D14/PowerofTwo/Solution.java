package Y2017.M7.D14.PowerofTwo;

/**
 * Created by Allan Wong on 7/14/2017.
 */
public class Solution {
    //Runtime:2ms Better than or equals to 99%  One-time AC!
    public boolean isPowerOfTwo(int n) {
        if(n<=0)
            return false;
        while(n>1){
            if((n&1)==1)
                return false;
            else{
                n=n>>1;
            }
        }
        return true;
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
