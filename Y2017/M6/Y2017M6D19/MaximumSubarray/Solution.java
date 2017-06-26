package Y2017.M6.Y2017M6D19.MaximumSubarray;

/**
 * Created by Allan Wong on 2017/6/19.
 */
public class Solution {
    //Runtime:15ms Better than or equals to 80%
    //Reference: https://discuss.leetcode.com/topic/6413/dp-solution-some-thoughts/2
    public int maxSubArray(int[] nums) {
        int[] res=new int[nums.length];
        res[0]=nums[0];
        int max=res[0];
        for(int i=1;i<nums.length;i++){
            res[i]=nums[i]+(res[i-1]>0?res[i-1]:0);
            max=Math.max(max,res[i]);
        }
        return max;
    }
    //Runtime:
    /*
    */


    public static void main(String[] args) {
        Solution s = new Solution();
        int[] a = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int res = s.maxSubArray(a);
        System.out.println();
        System.out.println("Done.");
    }


}
