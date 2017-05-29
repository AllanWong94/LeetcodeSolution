package LongestSubstringWithoutRepeatingCharacters;

/**
 * Created by Allan Wong on 2017/5/27.
 */
public class Solution {

    //Runtime:50ms Beats 86% NICE!!!! But waste space.
    public int lengthOfLongestSubstring(String s) {
        int max=0,temp=0,index=0;
        boolean[] charCounts=new boolean[26];
        for(int i=0;i<s.length()-max;i++){
            index=i;
            temp=0;
            charCounts=new boolean[256];
            while(charCounts[(int)s.charAt(index)]!=true){
                charCounts[(int)s.charAt(index)]=true;
                temp++;
                index++;
                if(index>=s.length())
                    break;
            }
            if(temp>max)
                max=temp;
        }
        return max;
    }

/* Runtime:36ms
    public int lengthOfLongestSubstring(String s) {
        int[] hash = new int[128];
        for(int i = 0; i < 128; i++)
            hash[i] = -1;
        int start = 0;
        int crrmax = 0;
        char[] chars = s.toCharArray();
        for(int i = 0; i < chars.length; i++){
            if(hash[ chars[i] ] == -1 || hash[ chars[i] ] < start ){
                hash[ chars[i] ] = i;
            }else{
                crrmax = Math.max(crrmax, i - start);
                start = hash[ chars[i] ] + 1;
                hash[ chars[i] ] = i;
            }
        }
        crrmax = Math.max(crrmax, chars.length - start);
        return crrmax;
    }
    */
}
