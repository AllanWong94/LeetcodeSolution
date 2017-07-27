package Y2017.M7.D27.Circular_Array_Loop;

/**
 * Created by Allan Wong on 7/27/2017.
 */
public class Solution {
    //Runtime:1ms Better than or equals to 100%
    //Reference: https://discuss.leetcode.com/topic/66894/java-slow-fast-pointer-solution
    int[] n;
    int l;
    public boolean circularArrayLoop(int[] nums) {
        if(nums.length==0||nums==null)
            return false;
        n=nums;
        l=nums.length;
        for(int i=0;i<l;i++){
            if(nums[i]==0)
                continue;
            int walker=i,runner=i;
            while(nums[runner]*nums[i]>0 && nums[getIndex(runner)]*nums[i]>0){
                walker=getIndex(walker);
                runner=getIndex(getIndex(runner));
                if(walker==runner){
                    if (walker==getIndex(walker))
                            break;
                    return true;
                }
            }
            walker=i;
            runner=getIndex(i);
            while(nums[runner]!=0){
                nums[walker]=0;
                walker=runner;
                runner=getIndex(runner);
            }
        }
        return false;
    }
    //Runtime:
    /*
    */


    public int getIndex(int k){
        k+=n[k];
        return k>=0?k%l:k+l;
    }

    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(s.circularArrayLoop(new int[]{-1,-2,-3,-4,-5}));
        System.out.println("Done.");
    }


}
