package Y2017.M6.D26.MergeSortedArray;

import java.util.Arrays;

/**
 * Created by Allan Wong on 2017/6/26.
 */
public class Solution {
    //Runtime:0ms Better than or equals to 100%
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] copynums1 = Arrays.copyOfRange(nums1, 0, m);
        int cur1 = 0, cur2 = 0, count = 0;
        while (cur1 < m && cur2 < n) {
            if (copynums1[cur1] <= nums2[cur2]) {
                nums1[count] = copynums1[cur1];
                cur1++;
            } else {
                nums1[count] = nums2[cur2];
                cur2++;
            }
            count++;
        }
        while (cur1 < m) {
            nums1[count] = copynums1[cur1];
            cur1++;
            count++;
        }
        while (cur2 < n) {
            nums1[count] = nums2[cur2];
            cur2++;
            count++;
        }
    }
    //Runtime:
    /*
    */


    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println();
        System.out.println("Done.");
    }


}
