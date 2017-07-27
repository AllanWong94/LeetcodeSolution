package Y2017.M7.D27.Minimum_Moves_to_Equal_Array_Elements;

/**
 * Created by Allan Wong on 7/27/2017.
 */
public class Solution {
    //Runtime:12ms Better than or equals to 100%
    public int minMoves(int[] nums) {
        int min=Integer.MAX_VALUE,sum=0;
        for(int i:nums){
            if(min>i)
                min=i;
            sum+=i;
        }
        return sum-nums.length*min;
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
