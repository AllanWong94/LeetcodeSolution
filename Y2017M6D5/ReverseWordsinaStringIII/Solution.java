package FifthJune2017.ReverseWordsinaStringIII;

/**
 * Created by Allan Wong on 2017/6/5.
 */
public class Solution {

    //Runtime:19ms Beats 49%
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder(s.length());
        int start = 0, end = 0;
        end = s.indexOf(' ', end + 1);
        while (end != -1) {
            for (int i = end - 1; i >= start; i--) {
                sb.append(s.charAt(i));
            }
            sb.append(' ');
            start = end + 1;
            end = s.indexOf(' ', end + 1);
        }
        if (start < s.length()) {
            for (int i = s.length() - 1; i >= start; i--) {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

    //Runtime:6ms StringBuilder and String.indexOf too expensive?
    /*
    public String reverseWords(String s) {
        char[] chars = s.toCharArray();
        int i=0;
        while(i<chars.length){
            int wordEnd = getWordEnd(chars, i);
            reverse(chars, i, wordEnd);
            i = wordEnd+1;
        }
        return new String(chars);
    }

    public int getWordEnd(char[] chars, int i){
        while(i < chars.length && chars[i]!=' '){
            i++;
        }
        return i;
    }

    public void reverse(char[] chars, int from, int to){
        //System.out.println("reverse "+Arrays.toString(chars)+" "+ from + " "+to);
        for(int i=from; i<from + (to-from)/2;i++){
            swap(chars, i, to - (i-from) - 1);
        }
    }

    public void swap(char[] arr, int i, int j){
        char tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }


     */


    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.reverseWords("Let's take LeetCode contest"));
        System.out.println("Done.");
    }


}
