package Y2017M6D13.PlusOne;

import java.util.Arrays;

/**
 * Created by Allan Wong on 2017/6/13.
 */
public class Solution {

    //Runtime:1ms Beats 45%
    public int[] plusOne(int[] digits) {
        int n=digits.length-1;
        boolean carry=true;
        while(n>=0&&carry){
            digits[n]++;
            if(digits[n]>=10){
                carry=true;
                digits[n]=0;
                n--;
            }else{
                carry=false;
            }
        }
        if(n==-1&&carry){
            int[] newdigits=new int[digits.length+1];
            newdigits[0]=1;
            System.arraycopy(digits, 0 , newdigits, 1, digits.length);
            newdigits[1]=0;
            digits=newdigits;
        }
        return digits;
    }

    //Runtime:0ms
    /* public int[] plusOne(int[] digits) {
        for(int i=digits.length-1; i>=0; i--){
            if(digits[i]!=9) { digits[i]++; return digits;}
            else digits[i] = 0;
        }
        int[] result = new int[digits.length+1];
        result[0] = 1;
        return result;
    }



     */




    public static void main(String[] args) {
        Solution s=new Solution();
        int[] res=s.plusOne(new int[]{9});
        System.out.println();
        System.out.println("Done.");
    }


}
