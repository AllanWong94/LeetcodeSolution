package Y2017M6D25.RemoveElement;

/**
 * Created by Allan Wong on 2017/6/24.
 */
public class Solution {


    //Runtime:9ms Better than or equals to 96%
    public int removeElement(int[] nums, int val) {
        int left = 0, right = nums.length - 1;
        if(left==right){
            return nums[0]==val?0:1;
        }
        while (left <= right) {
            while (right >= 0 && nums[right] == val) right--;
            if (right < 0) return 0;
            if (nums[left] == val) {
                nums[left] = nums[right];
                right--;
            }
            left++;
            while (right >= 0 && nums[right] == val) right--;
            if (left==right && nums[left]==val)
                break;
        }
        return left;
    }
    //Runtime:
    /*
    */


    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.removeElement(new int[]{2,4,4,4,0}, 4));
        System.out.println("Done.");
    }


}
