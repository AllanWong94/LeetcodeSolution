package Y2017.M7.D28.Contains_Duplicate_III;

import java.util.HashMap;

/**
 * Created by Allan Wong on 7/29/2017.
 */
public class Solution {
    //Runtime:ms Better than or equals to %
    //TLEed.
//    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
//        if(nums.length<2)
//            return false;
//        for (int i=0;i<nums.length-1;i++){
//            for(int j=i+1;j<=Math.min(i+k,nums.length-1);j++){
//                if(Math.abs((long)nums[i]-(long)nums[j])<=t)
//                    return true;
//            }
//        }
//        return false;
//    }


    //Reference: https://leetcode.com/problems/contains-duplicate-iii/tabs/solution
    public long getID(long val,long w){
        return val<0?(val+1)/w-1:val/w;
    }

    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if(t<0)
            return false;
        HashMap<Long,Long> map=new HashMap<>();
        long w=(long)t+1;
        for(int i=0;i<nums.length;i++){
            long m=getID(nums[i],w);
            if(map.containsKey(m))
                return true;
            if(map.containsKey(m+1)&&Math.abs(nums[i]-map.get(m+1))<w)
                return true;
            if(map.containsKey(m-1)&&Math.abs(nums[i]-map.get(m-1))<w)
                return true;
            map.put(m,(long)nums[i]);
            if(i>=k) map.remove(getID(nums[i-k],w));
        }
        return false;
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
