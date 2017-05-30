package RomantoInteger;

/**
 * Created by Allan Wong on 2017/5/30.
 */
public class Solution {
    //Runtime:104ms Beats:53%
    //Though verbose, but runtime is OK since most ops are comparisons.
    public int romanToInt(String s) {
        int ans=0;
        int index=0;
        int count=0;
        int l=s.length();
        index=s.indexOf('M');
        if(index!=-1){
            while(index<l&&s.charAt(index)=='M'){
                if(index>0&&s.charAt(index-1)=='C')
                    break;
                ans+=1000;
                index++;
            }
        }
        index=s.indexOf('D');
        if(index!=-1){
            ans+=500;
            if(index>0&&s.charAt(index-1)=='C'){
                ans-=100;
            }
        }
        index=s.indexOf('C');
        if(index!=-1&&index<l-1&&s.charAt(index+1)=='M'){
            ans+=900;
            index=s.indexOf('C',index+1);
        }
        if(index!=-1&&index<l-1&&s.charAt(index+1)=='D'){
            index=s.indexOf('C',index+1);
        }
        if(index!=-1){
            while(index<l&&s.charAt(index)=='C'){
                if(index>0&&s.charAt(index-1)=='X')
                    break;
                ans+=100;
                index++;
            }
        }
        index=s.indexOf('L');
        if(index!=-1){
            ans+=50;
            if(index>0&&s.charAt(index-1)=='X'){
                ans-=10;
            }
        }
        index=s.indexOf('X');
        if(index!=-1&&index<l-1&&s.charAt(index+1)=='C'){
            ans+=90;
            index=s.indexOf('X',index+1);
        }
        if(index!=-1&&index<l-1&&s.charAt(index+1)=='L'){
            index=s.indexOf('X',index+1);
        }
        if(index!=-1){
            while(index<l&&s.charAt(index)=='X'){
                if(index>0&&s.charAt(index-1)=='I')
                    break;
                ans+=10;
                index++;
            }
        }
        index=s.indexOf('V');
        if(index!=-1){
            ans+=5;
            if(index>0&&s.charAt(index-1)=='I'){
                ans-=1;
            }
        }
        index=s.indexOf('I');
        if(index!=-1&&index<l-1&&s.charAt(index+1)=='V'){
            index=s.indexOf('I',index+1);
        }
        if(index!=-1&&index<l-1&&s.charAt(index+1)=='X'){
            ans+=9;
            index=s.indexOf('I',index+1);
        }
        if(index!=-1){
            while(index<l&&s.charAt(index)=='I'){
                ans+=1;
                index++;
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        Solution s=new Solution();
        String string="MMMCDXXIX";
        System.out.println(s.romanToInt(string));
    }


/*  //Runtime:79ms

    public int romanToInt(String s) {
        char[] cs = s.toCharArray();
        int i = 0, val = 0;

        while (i<cs.length) {
            // System.out.print(cs[i]);
            switch (cs[i++]) {
                case 'M': val+=1000; break;
                case 'D': val+=500; break;
                case 'C':
                    if (i<cs.length && cs[i]=='D') { val+=400; i++; }
                    else if (i<cs.length && cs[i]=='M') { val+=900; i++; }
                    else val+=100;
                    break;
                case 'L': val+=50; break;
                case 'X':
                    if (i<cs.length && cs[i]=='L') { val+=40; i++; }
                    else if (i<cs.length && cs[i]=='C') { val+=90; i++; }
                    else val+=10;
                    break;
                case 'V': val+=5; break;
                case 'I':
                    if (i<cs.length && cs[i]=='V') { val+=4; i++; }
                    else if (i<cs.length && cs[i]=='X') { val+=9; i++; }
                    else val+=1;
                    break;
            }
            // System.out.println(" "+val);
        }

        return val;
    }*/
}
