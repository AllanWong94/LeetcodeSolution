package Y2017.M7.D1.StringtoInteger;

/**
 * Created by Allan Wong on 2017/7/1.
 */
public class Solution {
    //Runtime:44ms Better than or equals to 62%
    public int myAtoi(String str) {
        str = str.trim();
        if (str.length() == 0)
            return 0;
        long res = 0;
        int maxlength=10;
        boolean first = true, negative = false;
        for (int i = 0; i < str.length(); i++) {
            if(i>maxlength)
                return negative?-2147483648:2147483647;
            char c = str.charAt(i);
            if (c == '-' && str.length() > 1 && i == 0) {
                negative = true;
                maxlength++;
            }
            else {
                if (c >= '0' && c <= '9') {
                    if (first) {
                        if (c > '0') {
                            res = (c - '0');
                            first = false;
                        }else
                            maxlength++;
                    } else {
                        res = res * 10 + (c - '0');
                    }
                } else if (c == '+' && i == 0) {
                    maxlength++;
                    continue;
                }
                else
                    break;
            }
        }
        res=negative ? res * -1 : res;
        res=res>2147483647L?2147483647:res;
        res=res<-2147483648L?-2147483648:res;
        return (int)res;
    }
    //Runtime:35ms
    /*public int myAtoi(String str) {
        int index = 0;
        int total = 0;
        int sign = 1;
         if(str.length() == 0) return 0;

        while(index < str.length() && str.charAt(index) == ' ' )
            index ++;
        if(str.charAt(index)=='+'||str.charAt(index)=='-'){
            sign = (str.charAt(index) == '+')? 1:-1;
            index++;
        }


        while(index < str.length()){
            if(str.charAt(index) < '0' || str.charAt(index) > '9'){
                break;
            }
            else{
                if(Integer.MAX_VALUE/10 < total || Integer.MAX_VALUE/10 == total && Integer.MAX_VALUE %10 < (str.charAt(index)-'0'))
                     return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                total = total * 10 + str.charAt(index) - '0';
                index++;
            }
        }
        return total * sign;
        }
    */


    public static void main(String[] args) {
        Solution s = new Solution();
        int res = s.myAtoi("-2147483649");
        System.out.println(res);
        System.out.println("Done.");
    }


}
