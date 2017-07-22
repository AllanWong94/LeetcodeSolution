package Y2017.M7.D22_NeedRevision.Find_the_Duplicate_Number_NeedRevision;

import java.util.Arrays;

/**
 * Created by Allan Wong on 7/22/2017.
 */
public class Solution {
    //Runtime:5ms Better than or equals to 49%
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==nums[i+1])
                return nums[i];
        }
        return -1;
    }
    //Runtime:0ms
    /*
    public int findDuplicate(int[] nums) {

        int n = nums.length;
        int slow = n;
        int fast = n;
        do {
            slow = nums[slow - 1];
            fast = nums[nums[fast - 1] - 1];
        } while (slow != fast);
        slow = n;
        while (slow != fast) {
            slow = nums[slow - 1];
            fast = nums[fast - 1];
        }
        return slow;
    }
    */



    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(s.findDuplicate(new int[]{2,5,1,1,4,3}));
        System.out.println("Done.");
    }


}
