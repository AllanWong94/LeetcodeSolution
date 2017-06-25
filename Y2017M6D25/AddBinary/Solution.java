package Y2017M6D25.AddBinary;

/**
 * Created by Allan Wong on 2017/6/24.
 */
public class Solution {
    //Runtime:4ms Better than or equals to 85%
    /*Reference: https://discuss.leetcode.com/topic/50315/a-summary-how-to-use-bit-manipulation-to-solve-problems-easily-and-efficiently
    int getSum(int a, int b) {
        return b==0? a:getSum(a^b, (a&b)<<1); //be careful about the terminating condition;
    }
     */
    public String addBinary(String a, String b) {
        String res=String.valueOf(getSum(a.toCharArray(), b.toCharArray()));
        int index=res.indexOf('1');
        return index==-1?"0":res.substring(index);
    }

    public char[] getSum(char[] a, char[] b) {
        boolean b_zero=true;
        for(char c:b){
            if (c=='1'){
                b_zero=false;
                break;
            }
        }
        return b_zero ? a : getSum(Xor(a, b), and_move1(a, b));
    }

    public char[] and_move1(char[] a, char[] b) {
        int la = a.length, lb = b.length, length = Math.min(la, lb);
        char[] res = new char[length + 1];
        for (int i = 0; i < length; i++) {
            res[i] = a[la - length + i] == '1' && b[lb - length + i] == '1' ? '1' : '0';
        }
        res[length] = '0';
        return res;
    }

    public char[] Xor(char[] a, char[] b) {
        int la = a.length, lb = b.length, length = Math.max(la, lb);
        char[] res = new char[length];
        for (int i = 0; i < length; i++) {
            char temp1 = (la - length + i) < 0 ? '0' : a[la - length + i], temp2 = (lb - length + i) < 0 ? '0' : b[lb - length + i];
            res[i] = temp1 != temp2 ? '1' : '0';
        }
        return res;
    }
    //Runtime:
    /*
    */




    public static void main(String[] args) {
        Solution s=new Solution();
        char[] a=new char[]{'1','0','1','0'}, b=new char[]{'1','0'};
        String A="1010",B="10";
       // char[] res=s.Xor(a,b);
        String res=s.addBinary(A,B);
        System.out.println(res);
        System.out.println("Done.");
    }


}
