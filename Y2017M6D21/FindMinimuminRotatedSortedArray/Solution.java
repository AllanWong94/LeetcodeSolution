package Y2017M6D21.FindMinimuminRotatedSortedArray;

/**
 * Created by Allan Wong on 2017/6/21.
 */
public class Solution {
    //Runtime:1ms Better than or equals to 65%
    public int findMin(int[] nums) {
        if (nums == null)
            return 0;
        return recursiveFind(nums, 0, nums.length - 1);
    }

    public int recursiveFind(int[] nums, int begin, int end) {
        if (end == begin || nums[begin] < nums[end])
            return nums[begin];
        int l = (begin + end) / 2;
        if (nums[l] > nums[end]) {
            return recursiveFind(nums, l + 1, end);
        } else {
            return recursiveFind(nums, begin, l);
        }
    }

    //Runtime:0ms
    /*Comment: Avoided recursion.
    public int findMin(int[] nums) {
        // binary search:
        if(nums == null || nums.length == 0)    return 0;
        int i = 0, j = nums.length-1;
        while(i < j) {
            int mid = (i+j)/2;
            if(nums[mid] > nums[j]) {   // means nums[i,...,mid] is sorted
                i = mid+1;
            } else if(nums[mid] < nums[j]) {  // num[mid,...,j] is sorted
                j = mid;
            }
        }
        return nums[i];
    }
    */



    public static void main(String[] args) {
        Solution s=new Solution();
        int[] a=new int[]{4,5,6,7,0,1,2};
        int res=s.findMin(a);
        System.out.println();
        System.out.println("Done.");
    }


}
