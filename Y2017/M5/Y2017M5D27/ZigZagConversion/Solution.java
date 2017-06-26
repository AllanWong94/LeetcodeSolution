package ZigZagConversion;

/**
 * Created by Allan Wong on 2017/5/27.
 */
public class Solution {

    //Runtime:115ms, beats 15.11%
    public String convert(String s, int numRows) {
        int length=s.length();
        int period=numRows*2-2;
        String ans="";
        if(period!=0){
            int cur=0;
            int temp=0;
            for(int i=0;i<numRows;i++){
                cur=i;
                while(cur<length){
                    if(i==0){
                        ans+=s.charAt(cur);
                        cur+=period;
                    }else if(i==numRows-1){
                        ans+=s.charAt(cur);
                        cur+=period;
                    }else{
                        ans+=s.charAt(cur);
                        temp=cur+period-2*cur%period;
                        if (temp<length)
                            ans+=s.charAt(temp);;
                        cur+=period;
                    }
                }
            }
        }else
            ans=s;

        return ans;
    }




    /*Runtime 40ms
    public String convert(String s, int numRows) {
        if(numRows == 1)
            return s;
        StringBuilder sb = new StringBuilder();
        int magic = 2 * numRows - 2;
        int initialDistance = magic;
        for(int i=0;i<numRows;i++){
            fill(sb,i,initialDistance,magic,s);
            initialDistance = initialDistance - 2;
        }
        return sb.toString();
    }
    public void fill(StringBuilder sb, int start, int initialDistance, int magic, String s){
        while(start < s.length()){
            if(initialDistance == 0){
                initialDistance = magic;
            }
            sb.append(s.charAt(start));
            start = start + initialDistance;
            initialDistance = magic - initialDistance;
        }
    }*/
}
