package Y2017.M7.D13.IntersectionofTwoArrays;

import java.util.HashSet;
import java.util.LinkedList;

/**
 * Created by Allan Wong on 7/13/2017.
 */
public class Solution {
    //Runtime:10ms Better than or equals to 11.49%
    /*public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> map = new HashSet<>();
        LinkedList<Integer> res = new LinkedList<>();
        for (int i : nums1) {
            map.add(i);
        }
        for (int i : nums2) {
            if (map.contains(i) && !res.contains(i))
                res.add(i);
        }
        int[] a = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            a[i] = res.get(i);
        }
        return a;
    }*/

    //Improved.
    //Runtime:4ms Better than or equals to 95.40%
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1.length == 0 || nums2.length == 0)
            return new int[0];
        if (nums1.length > nums2.length) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }
        int max = nums1[0], min = nums1[0];
        for (int i : nums1) {
            max = Math.max(i, max);
            min = Math.min(i, min);
        }
        boolean[] compare = new boolean[max - min + 1];
        HashSet<Integer> res = new HashSet<>();
        for (int i : nums1) {
            compare[i - min] = true;
        }
        for (int i : nums2) {
            if (i >= min && i <= max) {
                if (compare[i - min] == true)
                    res.add(i);
            }
        }
        int[] res1 = new int[res.size()];
        int count = 0;
        for (Integer i : res) {
            res1[count++] = (int) i;
        }
        return res1;
    }
    //Runtime:
    /*
    */


    public static void main(String[] args) {
        Solution s = new Solution();
        int[] res = s.intersection(new int[]{1,2}, new int[]{2, 1});
        System.out.println();
        System.out.println("Done.");
    }


}
