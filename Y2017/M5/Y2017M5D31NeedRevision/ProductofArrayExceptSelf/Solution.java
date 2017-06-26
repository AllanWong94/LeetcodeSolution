package ProductofArrayExceptSelf;

/**
 * Created by Allan Wong on 2017/5/31.
 */
public class Solution {
    //Runtime:2ms Fastest
    public int[] productExceptSelf(int[] nums) {
        int all=1;
        int allnotzero=1;
        int zeroes=0;
        int[] res=new int[nums.length];
        for (int i:nums){
            all*=i;
            if (i==0)
                zeroes++;
            else
                allnotzero*=i;
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                if(zeroes==1){
                    res[i]=allnotzero;
                }else{
                    res[i]=0;
                }
            }else
                res[i]=all/nums[i];
        }
        return res;
    }
}
