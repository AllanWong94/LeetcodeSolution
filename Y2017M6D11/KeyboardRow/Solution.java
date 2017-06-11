package Y2017M6D11.KeyboardRow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * Created by Allan Wong on 2017/6/11.
 */
public class Solution {

    //Runtime:5ms Beats 43%
    HashMap<Character, Integer> keyboard;

    public String[] findWords(String[] words) {
        LinkedList<String> list = new LinkedList<>();
        keyboard = new HashMap<>();
        char[][] rows = {{'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'}, {'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l'}, {'z', 'x', 'c', 'v', 'b', 'n', 'm'}};
        for (int i = 0; i < 3; i++) {
            for (char c : rows[i]) {
                keyboard.put(c, i + 1);
                keyboard.put((char) (c - 32), i + 1);
            }
        }
        for (String word : words) {
            if (helper(word))
                list.add(word);
        }
        String[] res = list.toArray(new String[list.size()]);
        return res;
    }

    public boolean helper(String word) {
        int index = keyboard.get(word.charAt(0));
        for (char c : word.toCharArray()) {
            if (index != keyboard.get(c))
                return false;
        }
        return true;
    }

    //Runtime:3ms
    /*

    public  String[] findWords(String[] words) {
     int a =   words.length;
     Vector outwords = new Vector() ;

     for (int i =0; i <a; i++){
     String b = words[i];
     if (rightWord(b) == true)
     {outwords.add(b);
     }
    }
     String [] routwords = new String [outwords.size()];

         for (int j =0;  j < outwords.size(); j ++)
     {routwords [j] = (String) outwords.get(j);
     }
      return routwords;
    }

    public static boolean rightWord (String word) {
        int a = word.length();
        String qline = "qwertyuiopQWERTYUIOP";
        String aline = "asdfghjklASDFGHJKL";
        String zline = "zxcvbnmZXCVBNM";

        if (qline.indexOf(word.charAt(0)) != -1)
        for (int i = 1; i< a; i ++)
        {
         if (qline.indexOf(word.charAt(i))==-1)
         return false;
        }

        if (aline.indexOf(word.charAt(0)) != -1)
        for (int i = 1; i< a; i ++)
        {
         if (aline.indexOf(word.charAt(i))==-1)
         return false;
        }

        if (zline.indexOf(word.charAt(0)) != -1)
        for (int i = 1; i< a; i ++)
        {
         if (zline.indexOf(word.charAt(i))==-1)
         return false;
        }

        return true;
    }


     */



    public static void main(String[] args) {
        String[] strings = {"Hello", "Alaska", "Dad", "Peace"};
        Solution s = new Solution();
        System.out.println(s.findWords(strings));
        System.out.println("Done.");
    }
}
