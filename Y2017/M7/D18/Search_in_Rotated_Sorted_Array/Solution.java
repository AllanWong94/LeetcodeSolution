package Y2017.M7.D18.Search_in_Rotated_Sorted_Array;

import java.util.Arrays;

/**
 * Created by Allan Wong on 7/17/2017.
 */
public class Solution {
    //Too many corner cases. Won't work.
//    public int search(int[] nums, int target) {
//        int l = nums.length, lo, hi, mid,max=l/2;
//        boolean transformed=false;
//        if (l == 0)
//            return -1;
//        if (l == 1)
//            return nums[0] == target ? 0 : -1;
//        if (nums[0] > nums[l - 1]) {
//            transformed=true;
//            lo = 0;
//            hi = l - 1;
//            while (nums[max] < nums[0] || nums[max + 1] > nums[l - 1]) {
//                if (nums[max] > nums[0]) {
//                    lo = max + 1;
//                } else {
//                    hi = max - 1;
//                }
//                max = (lo + hi) / 2;
//            }
//            if (target < nums[max + 1] || target > nums[max])
//                return -1;
//            int[] newnums = new int[l];
//            System.arraycopy(nums, max + 1, newnums, 0, l - max - 1);
//            System.arraycopy(nums, 0, newnums, l - max - 1, max + 1);
//            nums = newnums;
//        }
//        if (target < nums[0] || target > nums[l - 1])
//            return -1;
//        lo = 0;
//        hi = l - 1;
//        mid = (lo + hi) / 2;
//        while (nums[mid] != target) {
//            if (nums[mid] < target) {
//                lo = mid + 1;
//            } else {
//                hi = mid - 1;
//            }
//            mid = (lo + hi) / 2;
//            if ((nums[mid] < target && nums[mid + 1] > target) || (nums[mid] > target && nums[mid - 1] < target))
//                return -1;
//        }
//        if(transformed){
//            if(mid<l-max-1){
//                mid+=max+1;
//            }else{
//                mid-=l-max-1;
//            }
//        }
//        return mid;
//    }
    //Runtime:
    /*
    */

    //Runtime:13ms Better than or equals to 91%
    //Reference: https://discuss.leetcode.com/topic/3538/concise-o-log-n-binary-search-solution
    public int search(int[] nums, int target) {
        int l=nums.length,lo=0,hi=l-1,mid;
        while(lo<hi){
            mid=(lo+hi)/2;
            if(nums[mid]>nums[hi]) lo=mid+1;
            else
                hi=mid;
        }
        int rot=hi;
        lo=0;
        hi=l-1;
        while (lo<=hi){
            mid=(hi+lo)/2;
            int realmid=(mid+rot)%l;
            if(nums[realmid]== target) return realmid;
            if(nums[realmid]<target) lo=mid+1;
            else hi=mid-1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution s=new Solution();
        int res=s.search(new int[]{3,1},3);
        System.out.println();
        System.out.println("Done.");
    }


}
