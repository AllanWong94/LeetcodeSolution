package Y2017.M6.Y2017M6D12.WordBreak;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Allan Wong on 2017/6/13.
 */
public class Solution {
    //TLEed for duplicate-letter strings.
    /*public boolean wordBreak(String s, List<String> wordDict) {
        if(s==null)
            return false;
        return recursive(s,wordDict,0);
    }

    public boolean recursive(String s,List<String> wordDict, int index){
        LinkedList<Integer> lengths=new LinkedList<>();
        if(lookUp(s,wordDict,index,lengths)){
            for(int length:lengths){
                int temp=index+length;
                if(temp>=s.length()||recursive(s,wordDict,temp)==true)
                    return true;
            }
        }
        return false;
    }

    public boolean lookUp(String s, List<String> wordDict, int index, LinkedList lengths){
        boolean found=false;
        for(String word:wordDict){
            if(s.indexOf(word,index)==index){
                lengths.add(word.length());
                found=true;
            }
        }
        return found;
    }*/




    //DP. Reference:https://discuss.leetcode.com/topic/8531/accepted-java-solution
    //Runtime:15ms  Beats 60%
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] breakable=new boolean[s.length()+1];
        breakable[0]=true;
        for(int i=1;i<=s.length();i++){
            for(int j=0;j<i;j++){
                if(breakable[j]&&wordDict.contains(s.substring(j,i)))
                    breakable[i]=true;
            }
        }
        return breakable[s.length()];
    }

    //Runtime:5ms
    /*public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> set = new HashSet<String>();
        for(String word : wordDict) set.add(word);

        if(s == null || s.length() == 0){
            return true;
        }
        int n = s.length();
        boolean [] dp = new boolean[n+1];
        dp[0] = true ;

        int maxLength = 0;
        for(String t : set){
            maxLength = Math.max(maxLength, t.length());
        }

        for(int i = 1; i <= n; i++){
            dp[i] = false;
            for(int j = i-1; j >= Math.max(0, i - maxLength) && !dp[i]; j--){ // Get rid of the matching with strings length longer than any word in the dict
                if(dp[j]){
                    if(set.contains(s.substring(j, i))){
                        dp[i] = true;
                    }
                }
            }

        }

        return dp[n];
    }



     */




    public static void main(String[] args) {
        Solution s=new Solution();
        String string="leetcode";
        String[] dict={"leet","code"};
        System.out.println(s.wordBreak(string, Arrays.asList(dict)));
        System.out.println("Done.");
    }


}
