package Y2017.M7.D26.Search_Insert_Position;

/**
 * Created by Allan Wong on 7/26/2017.
 */
public class Solution {
    //Runtime:5ms Better than or equals to 99%
    public int searchInsert(int[] nums, int target) {
        int lo=0,hi=nums.length-1,mid=(lo+hi)/2;
        if(target<=nums[0]) return 0;
        if(target>nums[hi]) return hi+1;
        while(nums[mid]!=target){
            if(nums[mid]>target){
                hi=mid;
            }else{
                lo=mid+1;
            }
            mid=(lo+hi)/2;
            if(mid>0&&nums[mid-1]<target&&nums[mid]>target)
                return mid;
        }
        return mid;
    }
    //Runtime:
    /*
    */




    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(s.searchInsert(new int[]{1,3,5}, 1));
        System.out.println("Done.");
    }


}
