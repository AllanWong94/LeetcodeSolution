package LongestPalindromicSubstring;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Allan Wong on 2017/5/29.
 */
public class Solution {
    //Naive method. Time limit exceeded.
    /*
    public String longestPalindrome(String s) {
        if(s.length()<2)
            return s;
        String ans=s.substring(0,1);
        char[] chars=s.toCharArray();
        int dist=0;
        for(int i=0;i<s.length();i++){
            dist=Math.min(i,s.length()-i-2);
            if(i<s.length()-1&&chars[i]==chars[i+1]){
                for(int j=0;j<=dist;j++){
                    if(chars[i-j]!=chars[i+1+j])
                        break;
                    if((2*j+2)>ans.length()){
                        ans=s.substring(i-j,i+j+2);
                    }
                }
            }
            if(i<s.length()-2&&chars[i]==chars[i+2]){
                dist=Math.min(i,s.length()-i-3);
                for(int j=0;j<=dist;j++){
                    if(chars[i-j]!=chars[i+j+2])
                        break;
                    if((2*j+3)>ans.length()){
                        ans=s.substring(i-j,i+j+3);
                    }
                }
            }
        }
        return ans;
    }*/


    //Version 2. Again, TLEed.
    /*
    public String longestPalindrome(String s) {
        char[] c=s.toCharArray();
        String ans=s.substring(0,1);
        int left=0,right=0;
        char ch;
        ArrayList arrayList;
        HashMap<Character, ArrayList<Integer>> hm=new HashMap<>();
        for(int i=0;i<c.length;i++){                        //Runtime cost:N
            ch=c[i];
            arrayList=hm.get(ch);
            if(arrayList==null)
                arrayList=new ArrayList<>();
            arrayList.add(i);
            hm.put(ch,arrayList);
        }
        for(ArrayList<Integer> al:hm.values()){
            if(al==null)
                continue;
            for(int i=0;i<al.size();i++){
                for(int j=al.size()-1;j>i;j--){
                    left=al.get(i);
                    right=al.get(j);
                    while(left<right&&c[left]==c[right]){
                        left++;right--;
                    }
                    if(left>=right&&al.get(j)-al.get(i)+1>ans.length()){
                        ans=s.substring(al.get(i),al.get(j)+1);
                    }
                }
            }
        }
        return ans;
    }*/

    //Rewrite. Reference:https://discuss.leetcode.com/topic/12187/simple-c-solution-8ms-13-lines
    //Runtime:15ms Beats 97% Yay!
    //Works best for strings of duplicate letters. But runtime still O(N^2) for Strings like ababab...
    public String longestPalindrome(String s) {
        int k,j,length=s.length(),start=0,end=0;
        if(length<2)
            return s;
        char[] c=s.toCharArray();
        String ans=s.substring(0,1);
        for(int i=0;i<length;){
            k=i;
            j=i;
            if(length-1-i<ans.length()/2)
                break;
            while(k<length-1&&c[k]==c[k+1]) k++;
            i=k+1;
            while(k<length-1&&j>0&&c[k+1]==c[j-1]){
                k++;
                j--;
            }
            if(k-j+1>ans.length())
                ans=s.substring(j,k+1);
        }
        return ans;
    }



        public static void main(String[] args) {
        String string="babad";
        Solution s=new Solution();
        //System.out.println('A'-'a');
        System.out.println(s.longestPalindrome(string));
        //System.out.println(string.substring(0,3));
    }
}
