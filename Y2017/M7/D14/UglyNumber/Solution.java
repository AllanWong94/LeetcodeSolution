package Y2017.M7.D14.UglyNumber;

/**
 * Created by Allan Wong on 7/14/2017.
 */
public class Solution {
    //Runtime:2ms Better than or equals to 99%
    public boolean isUgly(int num) {
        if(num==0)
            return false;
        if(num==1)
            return true;
        if(num%2==0){
            return isUgly(num/2);
        }
        if(num%3==0){
            return isUgly(num/3);
        }
        if(num%5==0){
            return isUgly(num/5);
        }
        return false;
    }
    //Runtime:
    /*
    */




    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(s.isUgly(14));
        System.out.println("Done.");
    }


}
