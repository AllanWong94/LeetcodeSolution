package Y2017.M7.D18.Valid_Palindrome;

/**
 * Created by Allan Wong on 7/17/2017.
 */
public class Solution {
    //Runtime:6ms Better than or equals to 94%
    public boolean isPalindrome(String s) {
        char[] chars = s.toCharArray();
        StringBuilder sb=new StringBuilder();
        for(char c:chars){
            if((c>='a' &&c<='z') || (c>='0' && c<='9'))
                sb.append(c);
            if(c>='A' && c<='Z')
                sb.append((char)(c+32));
        }
        chars=sb.toString().toCharArray();
        int lo = 0, hi = chars.length - 1;
        while (lo < hi) {
            if(chars[lo]!=chars[hi])
                return false;
            lo++;
            hi--;
        }
        return true;
    }
    //Runtime:
    /*
    */


    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println("Done.");
    }


}
