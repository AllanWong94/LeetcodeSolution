package Y2017.M7.D23.Two_Sum_II_Input_array_is_sorted;

/**
 * Created by Allan Wong on 7/23/2017.
 */
public class Solution {
    //Runtime:1ms Better than or equals to 99%
    public int[] twoSum(int[] numbers, int target) {
        int lo=0,hi=numbers.length-1,sum=numbers[lo]+numbers[hi];
        while(sum!=target){
            if(sum<target){
                lo++;
            }else{
                hi--;
            }
            sum=numbers[lo]+numbers[hi];
        }
        return new int[]{lo+1,hi+1};
    }
    //Runtime:
    /*
    */




    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println();
        System.out.println("Done.");
    }


}
