package Y2017.M7.D17.Isomorphic_Strings;

import java.util.HashMap;

/**
 * Created by Allan Wong on 7/17/2017.
 */
public class Solution {
    //Runtime:47ms=>9ms=>6ms Better than or equals to 7%=>86%=>96%
    public boolean isIsomorphic(String s, String t) {
        int[] dict1=new int[257],dict2=new int[257];
        char[] chars1=s.toCharArray(),chars2=t.toCharArray();
        for(int i=0;i<s.length();i++){
            int num1=chars1[i]+1,num2=chars2[i]+1;
            if(dict1[num1]>0 && dict1[num1]!=num2)
                return false;
            dict1[num1]=num2;
            if(dict2[num2]>0 && dict2[num2]!=num1)
                return false;
            dict2[num2]=num1;
        }
        return true;
    }
    //Runtime:
    /*
    */




    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(s.isIsomorphic("ab","aa"));
        System.out.println("Done.");
    }


}
