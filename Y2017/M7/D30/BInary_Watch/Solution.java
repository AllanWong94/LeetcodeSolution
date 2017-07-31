package Y2017.M7.D30.BInary_Watch;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Allan Wong on 7/30/2017.
 */
public class Solution {
    //Runtime:3ms Better than or equals to 90%
    //Reference: https://discuss.leetcode.com/topic/59494/3ms-java-solution-using-backtracking-and-idea-of-permutation-and-combination
    public List<String> readBinaryWatch(int num) {
        int[] nums1=new int[]{8,4,2,1},nums2=new int[]{32,16,8,4,2,1};
        LinkedList<Integer> hour,minute;
        LinkedList<String> res=new LinkedList<>();
        for(int i=0;i<=num;i++){
            hour=generate(nums1,i);
            minute=generate(nums2,num-i);
            for(int h:hour){
                if(h>=12)
                    continue;
                for(int m:minute){
                    if(m>=60)
                        continue;
                    res.add(h+":"+(m<10?"0"+m:m));
                }
            }
        }
        return res;
    }

    public LinkedList<Integer> generate(int[] nums, int count){
        LinkedList<Integer> res=new LinkedList<>();
        generateHelper(nums,count,0,0,res);
        return res;
    }

    public void generateHelper(int[] nums,int count, int pos, int sum, LinkedList<Integer> list){
        if(count==0) {
            list.add(sum);
            return;
        }
        for(int i=pos;i<nums.length;i++){
            generateHelper(nums,count-1,i+1,sum+nums[i],list);
        }
    }

}
