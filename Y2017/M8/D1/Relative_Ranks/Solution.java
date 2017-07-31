package Y2017.M8.D1.Relative_Ranks;

import Y2017.Interval;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by Allan Wong on 7/31/2017.
 */
public class Solution {
    //Runtime:16ms Better than or equals to 94% One-time AC!
    public String[] findRelativeRanks(int[] nums) {
        int l=nums.length;
        String[] res = new String[l];
        int[] nums_copy=new int[l];
        String[] medals=new String[]{"Gold Medal", "Silver Medal", "Bronze Medal"};
        HashMap<Integer,String> map=new HashMap<>();
        for(int i=0;i<l;i++){
            nums_copy[i]=nums[i];
        }
        Arrays.sort(nums_copy);
        for(int i=0;i<l;i++){
            if(i<3)
                map.put(nums_copy[l-1-i],medals[i]);
            else
                map.put(nums_copy[l-1-i],String.valueOf(i+1));
        }
        for(int i=0;i<l;i++){
            res[i]=map.get(nums[i]);
        }
        return res;
    }
    //Runtime:
    /*
    */


    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println();
        System.out.println("Done.");
    }


}
