package MoveZeroes;

/**
 * Created by Allan Wong on 2017/6/2.
 */
public class Solution {

    //Runtime:1ms Beats 17%
    public void moveZeroes(int[] nums) {
        if(nums.length<2){
            return;
        }
        int l=0,r=1;
        while(r< nums.length){
            if(nums[l]==0 && nums[r]!=0){
                exch(nums,l++,r++);
            }else if (nums[l]==0 && nums[r]==0){
                r++;
            }else if(nums[l]!=0){
                l++;
                r++;
            }
        }
    }

    public void exch(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }


    /*
    //Value assigning ops less than exch()
    public void moveZeroes(int[] nums) {
        int numZeros = 0, index = 0;
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] == 0) numZeros++;
            else {
                nums[index] = nums[i];
                index++;
            }
        }
        if (numZeros > 0)
        {
            for (int j = 0; j < numZeros; j++)
            {
                nums[index] = 0;
                index++;
            }
        }
    }
     */


    public static void main(String[] args) {
        Solution s=new Solution();
        int[] i=new int[]{1,0};
        s.moveZeroes(i);
        System.out.println(i);
    }


}
