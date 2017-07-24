package Y2017.M7.D24.Length_of_Last_Word;

/**
 * Created by Allan Wong on 7/24/2017.
 */
public class Solution {

    //Runtime:6ms=>5ms Better than or equals to 65%=>98%
    //s.charAt(index) is slower than s.toCharArray()!
    public int lengthOfLastWord(String s) {
        int last = s.length() - 1;
        char[] chars=s.toCharArray();
        while (last > 0 && chars[last] == ' ') last--;
        for (int i = last; i >= 0; i--) {
            if (chars[i] == ' ')
                return last - i;
        }
        return last + 1;
    }
    //Runtime:
    /*
    */


    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println();
        System.out.println("Done.");
    }


}
