package Y2017.M7.D28.Power_of_Four;

/**
 * Created by Allan Wong on 7/28/2017.
 */
public class Solution {
    //Runtime:ms Better than or equals to %
    //Reference: https://discuss.leetcode.com/topic/42855/o-1-one-line-solution-without-loops
    public boolean isPowerOfFour(int num) {
        return (num > 0) && ((num & (num - 1)) == 0) && ((num & 0x55555555) == num);
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
