package Y2017.M6.Y2017M6D24.Pow_x_nNo50;

/**
 * Created by Allan Wong on 2017/6/24.
 */
public class Solution {
    //Runtime:20ms=>19ms Better than or equals to 88%=>97%
    public double myPow(double x, int n) {
        if(x==-1)
            return n%2==0?1:-1;
        if(x==1)
            return 1;
        double cur=x,res=1;
        while(n>0){
            if((n&1)==1){
                res*=cur;
            }
            cur*=cur;
            n=n>>1;
        }
        if(n<0)
            return 1/myPow(x,-n);//Improvements
        return res;
    }

    //Runtime:
    /*
    */




    public static void main(String[] args) {
        Solution s=new Solution();
        //System.out.println(s.myPow(2,22));
        System.out.println(Math.pow(2,-1100));
        System.out.println("Done.");
    }


}
