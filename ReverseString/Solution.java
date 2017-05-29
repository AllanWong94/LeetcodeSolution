package ReverseString;

/**
 * Created by Allan Wong on 2017/5/29.
 */
public class Solution {
    //Runtime:5ms Beats 19%
    public String reverseString(String s) {
        int length=s.length();
        StringBuilder sb=new StringBuilder(length);
        for(int i=length-1;i>=0;i--){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }


/*  //Runtime:2ms
    public String reverseString(String s) {
        char[] word = s.toCharArray();
        int low = 0, high = s.length() - 1;
        while (low < high) {
            // Sawp chars at low and high.

            // char tmp = word[low];
            // word[low] = word[high];
            // word[high] = tmp;
            word[low] = (char) (word[low] ^ word[high]);
            word[high] = (char) (word[low] ^ word[high]);
            word[low] = (char) (word[low] ^ word[high]);

            low++;
            high--;
        }
        return new String(word);
    }
*/
}
