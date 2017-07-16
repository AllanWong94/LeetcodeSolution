package Y2017.M7.D16.Summary_Ranges;

import java.util.List;
import java.util.Stack;

/**
 * Created by Allan Wong on 7/16/2017.
 */
public class Solution {

    //Runtime:1ms Better than or equals to 53%
    public List<String> summaryRanges(int[] nums) {
        Stack<String> res=new Stack<>();
        int last=-1,begin=-1;
        boolean began=false;
        for(int i:nums){
            if(!began){
                begin=i;
                last=i;
                began=true;
            }else{
                if(i-last!=1){
                    if(last==begin){
                        res.push(String.valueOf(begin));
                    }else{
                        res.push(begin+"->"+last);
                    }
                    begin=i;
                    last=i;
                }else
                    last=i;
            }
        }
        if(nums.length>0){
            if(last==begin){
                res.push(String.valueOf(begin));
            }else{
                res.push(begin+"->"+last);
            }
        }
        return res;
    }
    //Runtime:0ms
    /*
    public List<String> summaryRanges(int[] nums) {
        List<String> rst = new ArrayList<>();
        if(nums == null || nums.length == 0) return rst;
        int left = 0, ptr = 0;
        while(ptr < nums.length){
            left = ptr;
            while(ptr < nums.length - 1 && nums[ptr] + 1 == nums[ptr + 1]){
                ptr++;
            }
            if(left == ptr) rst.add(nums[ptr] + "");
            else rst.add(nums[left] + "->" + nums[ptr]);
            ptr++;
        }
        return rst;
    }
    */




    public static void main(String[] args) {
        Solution s=new Solution();
        List res=s.summaryRanges(new int[]{1,3});
        System.out.println();
        System.out.println("Done.");
    }


}
