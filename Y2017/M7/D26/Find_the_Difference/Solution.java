package Y2017.M7.D26.Find_the_Difference;

/**
 * Created by Allan Wong on 7/26/2017.
 */
public class Solution {
    //Runtime:7ms Better than or equals to 87%
    public char findTheDifference(String s, String t) {
        char[] charS=s.toCharArray(),charT=t.toCharArray();
        int[] alphabet=new int[26];
        for(char c:charS){
            alphabet[c-'a']++;
        }
        for(char c:charT) {
            if(alphabet[c-'a']==0)
                return c;
            alphabet[c - 'a']--;
        }
        return 'a';
    }
    //Runtime:5ms
    /*
    public char findTheDifference(String s, String t) {
        int length = t.length();
        char[] sch = s.toCharArray();
        char[] tch = t.toCharArray();
        char    ch = tch[length-1];
        for (int i = 0; i < length-1; i++)
        {
            ch ^= sch[i];
            ch ^= tch[i];
        }
        return ch;
    }
    */




    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println();
        System.out.println("Done.");
    }


}
