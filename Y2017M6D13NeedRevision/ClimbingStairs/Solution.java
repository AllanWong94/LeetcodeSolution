package Y2017M6D13NeedRevision.ClimbingStairs;

/**
 * Created by Allan Wong on 2017/6/13.
 */
public class Solution {
    //Runtime:0ms
    public int climbStairs(int n) {
        if(n==1)
            return 1;
        int[] dp=new int[n];
        dp[0]=1;
        dp[1]=2;
        for(int i=2;i<n;i++)
            dp[i]=dp[i-1]+dp[i-2];
        return dp[n-1];
    }


    //Runtime:
    /*



     */




    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(s.climbStairs(5));
        System.out.println("Done.");
    }


}
