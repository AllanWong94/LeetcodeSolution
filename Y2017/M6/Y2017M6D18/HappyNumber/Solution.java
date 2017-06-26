package Y2017.M6.Y2017M6D18.HappyNumber;


/**
 * Created by Allan Wong on 2017/6/18.
 */
public class Solution {
    //Runtime:2ms Better than or equals to 83%
    public boolean isHappy(int n) {
        boolean[] checked=new boolean[1000];
        int res=n;
        while(res!=1&&res!=7){
            res=0;
            while(n>0){
                res+=(n%10)*(n%10);
                n/=10;
            }
            if(checked[res]==true)
                return false;
            checked[res]=true;
            n=res;
        }
        return true;
    }

    //Runtime:1ms
    /*
    public boolean isHappy(int n)
    {
        int add=0;
        while(n>0)
        {
            int n1=n%10;
            add+=n1*n1;
            n=n/10;
        }
        if(add/10!=0) return isHappy(add);
        else if(add==1|| add==7) return true;

        return false;

    }
    */



    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(s.isHappy(3));
        System.out.println("Done.");
    }


}
