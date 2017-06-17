package Y2017M6D16.ReverseInteger;

/**
 * Created by Allan Wong on 2017/6/17.
 */
public class Solution {
    //Runtime:41ms Better than or equals to 67%
    public int reverse(int x) {
        if(x>-10&&x<10)
            return x;
        char[] chars=String.valueOf(x).toCharArray();
        int l=chars.length;
        char[] res=new char[l];
        if(x<0) {
            res[0]='-';
            for(int i=l-1;i>=1;i--){
                res[l-i]=chars[i];
            }
        }else{
            for(int i=l-1;i>=0;i--){
                res[l-i-1]=chars[i];
            }
        }
        int ans=0;
        try{ans=Integer.parseInt(String.valueOf(res));}
        catch (NumberFormatException e){
        }
        return ans;
    }


    //Runtime:33ms
    /*
    public int reverse(int x)
    {
        int result = 0;

        while (x != 0)
        {
            int tail = x % 10;
            int newResult = result * 10 + tail;
            if ((newResult - tail) / 10 != result)
            { return 0; }
            result = newResult;
            x = x / 10;
        }

        return result;
    }*/



    public static void main(String[] args) {
        Solution s=new Solution();

        System.out.println(-24%10);
        System.out.println("Done.");
    }


}
