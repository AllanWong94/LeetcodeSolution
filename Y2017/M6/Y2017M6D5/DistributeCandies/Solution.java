package FifthJune2017.DistributeCandies;

import java.util.HashMap;

/**
 * Created by Allan Wong on 2017/6/5.
 */
public class Solution {

    //Runtime:37ms Beats 99%
    public int distributeCandies(int[] candies) {
        int count = 0;
        boolean[] types = new boolean[200001];
        for (int i : candies) {
            if (types[i + 100000] == false) {
                count++;
                types[i + 100000] = true;
            }
        }
        return Math.min(candies.length / 2, count);
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println();
        System.out.println("Done.");
    }


}
