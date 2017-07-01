package Y2017.M7.D1.MissingNumber;

import java.util.Arrays;

/**
 * Created by Allan Wong on 2017/7/1.
 */
public class Solution {
    //Runtime:12ms Better than or equals to 14%
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i)
                return i;
        }
        return nums.length;
    }
    //Runtime:1ms
    /*
    public int missingNumber(int[] nums) {
        int sum = 0;
        int n = nums.length ;
        int i = 0;
        while(i < nums.length)
        {
            sum += nums[i];
            i++;
        }
        return (1+n)*n/2 - sum;
    }
    */




    public static void main(String[] args) {
        Solution s=new Solution();
        int res=s.missingNumber(new int[]{45,35,38,13,12,23,48,15,44,21,43,26,6,37,1,19,22,3,11,32,4,16,28,49,29,36,33,8,9,39,46,17,41,7,2,5,27,20,40,34,30,25,47,0,31,42,24,10,14});
        System.out.println(res);
        System.out.println("Done.");
    }



}
