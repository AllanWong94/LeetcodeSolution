package Y2017M6D22NeedRevision.ShuffleanArray;

import java.util.Random;

/**
 * Created by Allan Wong on 2017/6/21.
 */
public class Solution {
    private int[] nums;
    private int l;//Improvement
    private Random rand;//Improvement
    //Runtime:276ms=>244ms Better than or equals to 52%=>84%
    //Improvements:initialize the variables so that the functions will save time initializing them.
    public Solution(int[] nums) {
        this.nums=nums;
        l=nums.length;
        rand=new Random();
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return nums;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int count=0;
        int[] res=new int[l];
        boolean[] copied=new boolean[l];
        while(count<l){
            int s=rand.nextInt(l);
            while(copied[s]){
                s=rand.nextInt(l);
            }
            res[count]=nums[s];
            copied[s]=true;
            count++;
        }
        return res;
    }
    //Runtime:
    /*
    */




    public static void main(String[] args) {
        int[] a=new int[]{1,2,3};
        Solution s=new Solution(a);
        int[] res1=s.shuffle(),res2=s.reset();
        System.out.println("shuffle(): ");
        for(int i:res1)
            System.out.println(i);
        System.out.println("reset(): ");
        for(int i:res2)
            System.out.println(i);
        System.out.println("Done.");
    }


}
