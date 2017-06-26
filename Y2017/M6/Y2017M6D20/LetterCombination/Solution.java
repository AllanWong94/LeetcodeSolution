package Y2017.M6.Y2017M6D20.LetterCombination;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Allan Wong on 2017/6/20.
 */
public class Solution {
    //Runtime:4ms Better than or equals to 88%
    char[][] keyboard = {{'a', 'b', 'c'}, {'d', 'e', 'f'},
            {'g', 'h', 'i'}, {'j', 'k', 'l'}, {'m', 'n', 'o'},
            {'p', 'q', 'r', 's'}, {'t', 'u', 'v'}, {'w', 'x', 'y', 'z'}};
    public List<String> letterCombinations(String digits) {
        LinkedList<String> ans=new LinkedList<>();
        int l=digits.length();
        if (l==0)
            return ans;
        int[] digit=new int[l];
        for(int i=0;i<l;i++){
            digit[i]=digits.charAt(i)-'2';
        }
        for(int i=0;i<keyboard[digit[0]].length;i++){
            ans.add(String.valueOf(keyboard[digit[0]][i]));
        }
        if(l==1)
            return ans;
        for(int i=1;i<l;i++){
            ans=produce(ans,digit[i]);
        }
        return ans;
    }

    public LinkedList<String> produce(LinkedList<String> list,int num){
        LinkedList<String> ans=new LinkedList<>();
        while(!list.isEmpty()){
            String s=list.remove(0);
            for(int i=0;i<keyboard[num].length;i++){
                ans.add(s+keyboard[num][i]);
            }
        }
        return ans;
    }
    //Runtime:
    /*
    */


    public static void main(String[] args) {
        Solution s = new Solution();
        List ans=s.letterCombinations("235");
        System.out.println();
        System.out.println("Done.");
    }


}
