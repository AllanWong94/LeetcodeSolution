package Y2017.M6.D27.ValidAnagram;

import java.util.Arrays;

/**
 * Created by Allan Wong on 2017/6/26.
 */
public class Solution {
    //Runtime:7ms Better than or equals to 72%
    /*
    public boolean isAnagram(String s, String t) {
        char[] c1=s.toCharArray(),c2=t.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        if(c1.length!=c2.length)
            return false;
        else{
            for (int i=0;i<c1.length;i++){
                if (c1[i]!=c2[i])
                    return false;
            }
            return true;
        }
    }

    */

    //Runtime:4ms Better than or equals to 95%
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        else{
            int[] num1=new int[26],num2=new int[26];
            for (char c:s.toCharArray())
                num1[c-'a']++;
            for (char c:t.toCharArray())
                num2[c-'a']++;
            return Arrays.equals(num1,num2);
        }
    }
    //Runtime:




    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println();
        System.out.println("Done.");
    }


}
