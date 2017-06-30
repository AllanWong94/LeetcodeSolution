package Y2017.M6.D30.MaximumProductSubarray;

import java.util.LinkedList;
import java.util.Map;

/**
 * Created by Allan Wong on 2017/6/30.
 */
public class Solution {
    //Runtime:ms Better than or equals to %
    //Correct. But TLEed for long inputs.

    //Runtime:
    /*
    public int maxProduct(int[] nums) {
        if(nums.length==1)
            return nums[0];
        int max=nums[0];
        for(int i=0;i<nums.length-1;i++){
            int res=nums[i];
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]==1)
                    continue;
                if(res>1&&)
                max=Math.max(max,nums[j]);
                res*=nums[j];
                max=Math.max(max,res);
            }
        }
        return max;
    }
    */
    //Runtime:3ms
    //Reference: https://discuss.leetcode.com/topic/4417/possibly-simplest-solution-with-o-n-time-complexity
    public int maxProduct(int[] nums) {
        int imax=1,imin=1,res=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                int temp=imin;
                imin=imax;
                imax=temp;
            }
            imax=Math.max(imax*nums[i],nums[i]);
            imin=Math.min(imin*nums[i],nums[i]);
            res=Math.max(res,imax);
        }
        return res;
    }


    public static void main(String[] args) {
        Solution s=new Solution();
        int res=s.maxProduct(new int[]{-4,-3,-2});
        System.out.println();
        System.out.println("Done.");
    }


}
