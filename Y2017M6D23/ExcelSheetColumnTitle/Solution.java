package Y2017M6D23.ExcelSheetColumnTitle;

/**
 * Created by Allan Wong on 2017/6/23.
 */
public class Solution {
    //Runtime:ms Better than or equals to %
    //Reference:https://discuss.leetcode.com/topic/6214/my-1-lines-code-in-java-c-and-python
    public String convertToTitle(int n) {
        return n == 0 ? "" : convertToTitle(--n / 26) + (char)('A' + (n % 26));
    }
    //Runtime:
    /*
    */

    public String generateString(int n){
        int[] digit=transform(n);
        char[] res=new char[digit.length];
        for(int i=0;i<digit.length;i++){
            res[i]=(char)('A'-1+digit[i]);
        }
        return String.valueOf(res);
    }

    public int findScales(int n){
        int res=0,power=1,compare=0;
        while(n>compare){
            compare+=Math.pow(26,power);
            power++;
            res++;
        }
        return res;
    }

    public int[] transform(int n){
        int l=findScales(n);
        if(l<2)
            return new int[]{n};
        int[] res=new int[l];
        int count=0;
        for(int i=1;i<l;i++){
            count+=(int)Math.pow(26,i);
        }
        res[0]=(n-1)/count;
        n-=res[0]*count;
        for(int i=1;i<l-1;i++){
            res[i]=1+n/(int)Math.pow(26,l-i-1);
            n-=(res[i]-1)*(int)Math.pow(26,l-i-1);
        }
        res[l-1]=n;
        return res;
    }



    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(s.convertToTitle(731));
        System.out.println("Done.");
    }


}
