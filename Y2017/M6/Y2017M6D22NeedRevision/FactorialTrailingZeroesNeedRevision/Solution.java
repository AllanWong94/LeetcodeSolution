package Y2017.M6.Y2017M6D22NeedRevision.FactorialTrailingZeroesNeedRevision;

/**
 * Created by Allan Wong on 2017/6/22.
 */
public class Solution {
    //Runtime:ms Better than or equals to %
    //Correct. But TLEed for input 1808548329.
    public int trailingZeroes(int n) {
        int twos=0,fives=0,tens=0;
        for(int i=1;i<=n;i++){
            int temp=i;
            while(temp%10==0){
                temp/=10;
                tens++;
            }
            while(temp%2==0){
                temp/=2;
                twos++;
            }
            while(temp%5==0){
                temp/=5;
                fives++;
            }
        }
        return tens+Math.min(fives,twos);
    }




    //Runtime:
    /*
    public int trailingZeroes(int n) {
        return n == 0 ? 0 : n / 5 + trailingZeroes(n / 5);
    }
    */



    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(s.trailingZeroes(1000000));
        System.out.println("Done.");
    }


}
