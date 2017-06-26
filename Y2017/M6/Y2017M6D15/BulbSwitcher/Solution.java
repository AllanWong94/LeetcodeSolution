package Y2017.M6.Y2017M6D15.BulbSwitcher;

/**
 * Created by Allan Wong on 2017/6/15.
 */
public class Solution {
    //TLEed for n=99999999
    /*public int bulbSwitch(int n) {
        int res=0;
        for(int i=1;i<=n;i++){//Find the number of the numbers j that satisfies i%j=0
            int root=(int)Math.sqrt(i);
            if(root*root==i)
                res++;
        }
        return  res;
    }*/
    //Runtime:0ms Reference:https://discuss.leetcode.com/topic/39558/share-my-o-1-solution-with-explanation/2
    public int bulbSwitch(int n) {
        return (int) Math.sqrt(n);
    }


    //Runtime:
    /*



     */




    public static void main(String[] args) {
        Solution s=new Solution();
        int res=s.bulbSwitch(4);
        System.out.println();
        System.out.println("Done.");
    }


}
