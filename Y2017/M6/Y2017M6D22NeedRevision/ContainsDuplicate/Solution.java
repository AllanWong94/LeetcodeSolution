package Y2017.M6.Y2017M6D22NeedRevision.ContainsDuplicate;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Allan Wong on 2017/6/22.
 */
public class Solution {
    //Runtime:22ms Better than or equals to 30%
    public boolean containsDuplicate(int[] nums) {
        if(nums==null||nums.length==1)
            return false;
        Set<Integer> storage=new HashSet<Integer>();
        for (int n:nums){
            if(storage.contains(n))
                return true;
            storage.add(n);
        }
        return false;
    }

    //Runtime:3ms
    /*
    public boolean containsDuplicate(int[] nums) {
        if(nums.length == 0 || nums.length == 1)
            return false;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int num:nums){
            if(num < min)
                min = num;
            if(num > max)
                max = num;
        }
        boolean[] index = new boolean[max - min + 1];
        for(int num : nums){
            if(index[num-min])
                return true;
            else
                index[num-min] = true;
        }
        return false;
    }
    */



    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println();
        System.out.println("Done.");
    }


}
