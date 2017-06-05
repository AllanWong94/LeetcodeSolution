package NumberComplement;

/**
 * Created by Allan Wong on 2017/6/3.
 */
public class Solution {



    //Runtime:11ms Beats 62%
    public int findComplement(int num) {
        int n=1;
        while(n-1 < num){
            n*=2;
        }
        return num^(n-1);
    }
    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(s.findComplement(5));
    }


}
