package Y2017M6D12.MajorityElement;

import java.util.HashMap;

/**
 * Created by Allan Wong on 2017/6/12.
 */
public class Solution {
    //Runtime:29ms Beats 26%
    HashMap<Integer, Integer> count;
    public int majorityElement(int[] nums) {
        if(nums.length==1)
            return nums[0];
        count=new HashMap<>();
        int temp=0;
        for(int i:nums){
            if(!count.containsKey(i)){
                count.put(i,1);
            }else{
                temp=count.get(i);
                temp++;
                if(temp>nums.length/2)
                    return i;
                count.put(i,temp);
            }
        }
        return -1;
    }

    //Runtime:3ms   Boyer-Moore Majority Vote Algorithm
    /* public int majorityElement(int[] num) {

        int major=num[0], count = 1;
        for(int i=1; i<num.length;i++){
            if(count==0){
                count++;
                major=num[i];
            }else if(major==num[i]){
                count++;
            }else count--;

        }
        return major;
    }



     */




    public static void main(String[] args) {
        int[] n=new int[]{2,2};
        Solution s=new Solution();
        System.out.println();
        System.out.println("Done.");
    }



}
