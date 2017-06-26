package Y2017.M6.Y2017M6D14.AddDigits;

/**
 * Created by Allan Wong on 2017/6/15.
 */
public class Solution {
    //Runtime:3ms Beats 8%
    /*public int addDigits(int num) {
        char[] chars=String.valueOf(num).toCharArray();
        int res=0;
        while(chars.length>1){
            for(char c:chars){
                res+=c-'0';
            }
            chars=String.valueOf(res).toCharArray();
            num=res;
            res=0;
        }
        return num;
    }*/



    //Runtime:2ms
     public int addDigits(int num) {
         return num==0?0:(num%9==0?9:num%9);
     }







    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(s.addDigits(38));
        System.out.println("Done.");
    }


}
