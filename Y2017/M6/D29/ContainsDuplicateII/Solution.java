package Y2017.M6.D29.ContainsDuplicateII;

import java.util.HashMap;

/**
 * Created by Allan Wong on 2017/6/29.
 */
public class Solution {
    //Naive method.TLEed for input of large size.
    /*
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums.length<2||k<0)
            return false;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<Math.min(i+k+1,nums.length);j++){
                if(nums[i]==nums[j])
                    return true;
            }
        }
        return false;
    }
    */
    //Runtime:21ms Better than or equals to 38%
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums.length<2||k<0)
            return false;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])&&i-map.get(nums[i])<=k)
                return true;
            else
                map.put(nums[i],i);
            /*
            if(!map.containsKey(nums[i]))
                map.put(nums[i],i);
            else{
                if(i-map.get(nums[i])<=k)
                    return true;
                else
                    map.put(nums[i],i);
            }*/
        }
        return false;
    }
    //Runtime:13ms
    /*
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (i>k){
                set.remove(nums[i-k-1]);
            }
	    if (!set.add(nums[i]))
	        return true;
		}
		return false;
    }
     */




    public static void main(String[] args) {
        Solution s=new Solution();
        boolean res=s.containsNearbyDuplicate(new int[]{-1,-1},1);
        System.out.println();
        System.out.println("Done.");
    }


}
