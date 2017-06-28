package Y2017.M6.D28.RemoveDuplicate;

/**
 * Created by Allan Wong on 2017/6/27.
 */
public class Solution {
    //Runtime:14ms Better than or equals to 81%  One-time AC
    public int removeDuplicates(int[] nums) {
        if (nums.length<2)
            return nums.length;
        int res=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[res]=nums[i];
                res++;
            }
        }
        return res;
    }
    //Runtime:11ms
    /*
    public int removeDuplicates(int[] nums) {

        if (nums == null || nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            return 1;
        }

        int insertIndex = 1;

        for (int i=1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                nums[insertIndex] = nums[i];
                insertIndex += 1;
            }
        }

        return insertIndex;
    }
    */



    public static void main(String[] args) {
        Solution s=new Solution();
        int res=s.removeDuplicates(new int[]{1,1,2});
        System.out.println();
        System.out.println("Done.");
    }


}
