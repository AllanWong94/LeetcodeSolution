package ArrayPartitionI;

import java.util.Arrays;

/**
 * Created by Allan Wong on 2017/6/3.
 */
public class Solution {
    //Runtime:40ms Beats 32%
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for (int i=0;i<nums.length;i+=2){
            sum+=nums[i];
        }
        return sum;
    }


/*
    //Runtime:16ms
    public int arrayPairSum(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int sum = 0, carry = 0;
        int[] map = new int[20001];
        for(int i : nums) map[i + 10000]++;
        for(int i = 0; i < map.length; i++) {
            if(map[i] == 0) continue;
            sum += (map[i] - carry + 1) / 2 * (i - 10000);
            carry = (map[i] - carry) % 2;
        }
        return sum;
    }*/
}
