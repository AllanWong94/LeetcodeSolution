package SingleNumber;

import java.util.HashMap;

/**
 * Created by Allan Wong on 2017/5/29.
 */
public class Solution {
    //Runtime:19ms  Beats 13%
    public int singleNumber(int[] nums) {
        HashMap<Integer,Boolean> hm=new HashMap<>();
        for(int i:nums){
            if(hm.containsKey(i))
                hm.remove(i);
            else
                hm.put(i,true);
        }
        int res=(int)hm.keySet().toArray()[0];
        return res;
    }

/*
    public int singleNumber(int[] a) {
        int n = a.length, temp = 0;
        for(int i = 0; i < n; i++) temp ^= a[i];
        return temp;
    }
*/

    public static void main(String[] args) {

        int[] nums=new int[]{0,0,2,2,3,3,1};

        Solution s=new Solution();
        System.out.println(s.singleNumber(nums));
    }
}
