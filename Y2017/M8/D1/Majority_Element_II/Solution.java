package Y2017.M8.D1.Majority_Element_II;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Allan Wong on 7/31/2017.
 */
public class Solution {
    //Runtime:3ms Better than or equals to 99%
    //Reference: https://discuss.leetcode.com/topic/17564/boyer-moore-majority-vote-algorithm-and-my-elaboration/2
    //Requirements: O(1) space. O(n) runtime.
    public List<Integer> majorityElement(int[] nums) {
        LinkedList<Integer> res=new LinkedList<>();
        if(nums.length<2){
            for(int n:nums)
                res.add(n);
            return res;
        }
        if(nums.length==2){
            res.add(nums[0]);
            if(nums[0]!=nums[1])
                res.add(nums[1]);
            return res;
        }
        int candidate1=0,candidate2=1,count1=0,count2=0;
        for(int n:nums){
            if(n==candidate1){
                count1++;
            }else if(n==candidate2){
                count2++;
            }else if(count1==0){
                candidate1=n;
                count1=1;
            }else if(count2==0){
                candidate2=n;
                count2=1;
            }else{
                count1--;
                count2--;
            }
        }
        count1=0;count2=0;
        for(int n:nums){
            if(n==candidate1)
                count1++;
            else if(n==candidate2)
                count2++;
        }
        int num=nums.length/3;
        if(count1>num)
            res.add(candidate1);
        if(count2>num)
            res.add(candidate2);
        return res;
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
