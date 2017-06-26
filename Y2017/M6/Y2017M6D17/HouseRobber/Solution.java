package Y2017.M6.Y2017M6D17.HouseRobber;

/**
 * Created by Allan Wong on 2017/6/17.
 */
public class Solution {
    //Runtime:0ms Better than or equals to 100%
    /*public int rob(int[] nums) {
        if (nums.length == 0)
        return 0;
        int l = nums.length;
        int[] robbed = new int[l+1], unrobbed = new int[l+1];
        for (int i = 1; i <= l; i++) {
            robbed[i] = unrobbed[i - 1] + nums[i-1];
            unrobbed[i] = Math.max(robbed[i - 1],unrobbed[i-1]);
        }
        return Math.max(robbed[l], unrobbed[l]);
    }*/

    //Improved. Optimized space complexity. (From O(n) to O(1))
    public int rob(int[] nums) {
        int robbed=0,unrobbed=0,temp;
        for(int n:nums){
            temp=unrobbed;
            unrobbed=Math.max(unrobbed,robbed);
            robbed=temp+n;
        }
        return Math.max(robbed,unrobbed);
    }
    //Runtime:
    /*
    */


    public static void main(String[] args) {
        int[] a = new int[]{0};
        Solution s = new Solution();
        System.out.println(s.rob(a));
        System.out.println("Done.");
    }


}
