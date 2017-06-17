package Y2017M6D16.SingleElementinaSortedArray;

/**
 * Created by Allan Wong on 2017/6/17.
 */
public class Solution {
    //Runtime:1ms Better than or equals to 100%
    public int singleNonDuplicate(int[] nums) {
        return findSingle(nums,0,nums.length-1);
    }


    public int findSingle(int[] nums,int begin,int end){
        if(begin==end){
            return nums[begin];
        }
        int mid=(begin+end)/2;
        if(mid>0&&mid<nums.length-1&&nums[mid]!=nums[mid-1]&&nums[mid]!=nums[mid+1])
            return nums[mid];
        if(mid%2==0){
            if(nums[mid]==nums[mid+1])
                return findSingle(nums,mid+2,end);
            else// if(nums[mid]==nums[mid-1])
                return findSingle(nums,begin,mid-2);
        }else{
            if(nums[mid]==nums[mid+1])
                return findSingle(nums,begin,mid-1);
            else// if(nums[mid]==nums[mid-1])
                return findSingle(nums,mid+1,end);
        }
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
