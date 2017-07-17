package Y2017.M7.D17._4Sum;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Allan Wong on 7/17/2017.
 */
public class Solution {
    //Runtime:79=>43ms=>27ms Better than or equals to 43%=>74%=>93%
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        LinkedList res = new LinkedList();
        int l = nums.length;
        if (l < 4) //Improvement 1
            return res;
        for (int a = 0; a < l - 3; a++) {
            if (nums[a] + nums[a + 1] + nums[a + 2] + nums[a + 3] > target) break;
            if (nums[a] + nums[l - 1] + nums[l - 2] + nums[l - 3] < target) continue;
            if (a > 0 && nums[a] == nums[a - 1]) continue;
            for (int b = a + 1; b < l - 2; b++) {
                if (nums[a] + nums[b] + nums[b + 1] + nums[b + 2] > target) break;
                if (nums[a] + nums[b] + nums[l - 2] + nums[l - 1] < target) continue;
                if (b > a + 1 && nums[b] == nums[b - 1]) continue;
                int c = b + 1, d = l - 1;
                while (c < d) {
                    if(c>b+1 && nums[c]==nums[c-1]) {
                        c++;
                        continue;
                    }
                    if (nums[a] + nums[b] + nums[c] + nums[d] == target) {
                        String s = "" + nums[a] + nums[b] + nums[c] + nums[d];
                        res.add(new int[]{nums[a], nums[b], nums[c], nums[d]});
                        c++;
                    } else if (nums[a] + nums[b] + nums[c] + nums[d] < target) {
                        c++;
                    } else {
                        d--;
                    }
                }
            }
        }
        return res;
    }
    //Runtime:
    /*
    */


    public static void main(String[] args) {
        Solution s = new Solution();
        List res = s.fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0);
        System.out.println();
        System.out.println("Done.");
    }


}
