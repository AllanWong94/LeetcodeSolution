package Y2017.M7.D14.UniqueBinarySearchTrees;

/**
 * Created by Allan Wong on 7/14/2017.
 */
public class Solution {
    //Runtime:0ms Better than or equals to 100%
    //Reference: https://discuss.leetcode.com/topic/8398/dp-solution-in-6-lines-with-explanation-f-i-n-g-i-1-g-n-i
    int[] G;
    public int numTrees(int n) {
        G=new int[n+1];
        G[0]=1;
        G[1]=1;
        for (int i=2;i<=n;i++){
            int res=0;
            for(int j=1;j<=i;j++){
                res+=F(j,i);
            }
            G[i]=res;
        }
        return G[n];
    }

    public int F(int i,int n){
        return G[i-1]*G[n-i];
    }

    //Runtime:
    /*
    */




    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(s.numTrees(4));
        System.out.println("Done.");
    }


}
