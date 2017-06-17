package Y2017M6D16.PoorPigs;

/**
 * Created by Allan Wong on 2017/6/17.
 */
public class Solution {

    //Runtime:1ms Better than or equals to 98%
    //Reference: https://discuss.leetcode.com/topic/67666/another-explanation-and-solution/2
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int capacity=minutesToTest/minutesToDie+1;
        return (int)Math.ceil(Math.log(buckets)/Math.log(capacity));
    }
    //Runtime:
    /*



     */




    public static void main(String[] args) {
        Solution s=new Solution();
        int res=s.poorPigs(1000,15,60);
        System.out.println();
        System.out.println("Done.");
    }


}
