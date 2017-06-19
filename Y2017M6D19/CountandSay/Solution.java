package Y2017M6D19.CountandSay;

import java.util.LinkedList;

/**
 * Created by Allan Wong on 2017/6/19.
 */
public class Solution {
    //Runtime:4ms Better than or equals to 85%
    public String countAndSay(int n) {
        LinkedList<String> say=new LinkedList<>();
        say.addLast("1");
        for(int i=0;i<n-1;i++){
            String s=say.getLast();
            say.addLast(generateNext(s));
        }
        return say.getLast();
    }

    public String generateNext(String s){
        char[] chars=s.toCharArray();
        StringBuilder sb=new StringBuilder();
        int times=0;
        char temp='\0';
        for(char c:chars){
            if(c!=temp){
                if(times>0){
                    sb.append((char)('0'+times));
                    sb.append(temp);
                }
                times=1;
                temp=c;
            }else{
                times++;
            }
        }
        sb.append((char)('0'+times));
        sb.append(temp);
        return sb.toString();
    }

    //Runtime:
    /*
    */




    public static void main(String[] args) {
        Solution s=new Solution();
        String res=s.countAndSay(2);
        for(int i=0;i<5;i++)
        System.out.println(s.countAndSay(i+1));
        System.out.println("Done.");
    }




}
