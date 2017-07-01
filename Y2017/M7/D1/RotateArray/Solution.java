package Y2017.M7.D1.RotateArray;

import java.util.Arrays;

/**
 * Created by Allan Wong on 2017/7/1.
 */
public class Solution {
    /*Correct. But TLEed.
    public void rotate(int[] nums, int k) {
        if (nums.length<2)
            return;
        int l=nums.length;
        for(int i=0;i<k;i++)
            rotate1(nums,l);
    }

    public void rotate1(int[] nums,int l){
        int temp=nums[0];
        nums[0]=nums[l-1];
        for(int i=l-1;i>1;i--){
            nums[i]=nums[i-1];
        }
        nums[1]=temp;
    }*/

    //Runtime:0ms Better than or equals to 100%
    //Comment: O(1) space requirement not satisfied.
    public void rotate(int[] nums, int k) {
        if (nums.length<2)
            return;
        int l=nums.length;
        k%=l;
        int[] temp=new int[k];
        System.arraycopy(nums,l-k,temp,0,k);
        for(int i=l-k-1;i>=0;i--){
            nums[i+k]=nums[i];
        }
        System.arraycopy(temp,0,nums,0,k);
    }
    //Runtime:1ms
    //Comment: O(1) space!
    /*
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    */




    public static void main(String[] args) {
        Solution s=new Solution();
        int[] nums=new int[]{1,2};
        s.rotate(nums,3);
        System.out.println();
        System.out.println("Done.");
    }


}
