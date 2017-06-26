package Y2017.M6.Y2017M6D24.PowerofThree;

/**
 * Created by Allan Wong on 2017/6/24.
 */
public class Solution {
    //Runtime:17ms Better than or equals to 91%
    //Requirement not met: no loops/recursion
    public boolean isPowerOfThree(int n) {
        if(n==0)
            return false;
        if(n==1)
            return true;
        return n%3==0?isPowerOfThree(n/3):false;
    }
    //Runtime:
    /*
    public boolean isPowerOfThree(int n) {
        // 1162261467 is 3^19,  3^20 is bigger than int
        return ( n>0 &&  1162261467%n==0);
    }
    */




    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println();
        System.out.println("Done.");
    }


}
