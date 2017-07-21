package Y2017.M7.D21_NeedRevision.Find_All_Numbers_Disappeared_in_an_Array;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Allan Wong on 7/21/2017.
 */
public class Solution {
    //Runtime:12ms Better than or equals to 99%
    //Bonus:No extra space, O(n) runtime
    //Mine doesn't meet the bonus.
    public List<Integer> findDisappearedNumbers(int[] nums) {
        LinkedList<Integer> res=new LinkedList<>();
        boolean[] check=new boolean[nums.length];
        for(int i:nums){
            check[i-1]=true;
        }
        for(int i=0;i<check.length;i++){
            if(!check[i-1])
                res.add(i);
        }
        return res;
    }
    //Runtime:
    /*
    List<Integer> result = new ArrayList<Integer>();
        for( int i=0;i< nums.length; i++){
            int index = nums[i];
            if(nums[Math.abs(index)-1] > 0){
                nums[Math.abs(index)-1]= -nums[Math.abs(index)-1];
            }
        }

        for(int j =1 ;j <= nums.length ; j++){
            if(nums[j-1] > 0){
                result.add(j);
            }
        }
        return result;
    }

    */




    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println();
        System.out.println("Done.");
    }


}
