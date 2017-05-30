package IntegertoRoman;

/**
 * Created by Allan Wong on 2017/5/30.
 */
public class Solution {
    //Runtime:108ms Beats 33%
    public String[] ones=new String[]{"","I","II","III","IV","V","VI","VII","VIII","IX"};
    public String[] tens=new String[]{"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
    public String[] hundreds=new String[]{"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
    public String[] thousands=new String[]{"","M","MM","MMM"};
    public String intToRoman(int num) {
        StringBuilder sb=new StringBuilder();
        int[] n=new int[4];
        n[3]=num%10;
        n[2]=(num-n[3])%100/10;
        n[0]=num/1000;
        n[1]=(num-n[0]*1000)/100;
        for(int i=0;i<4;i++){
            sb.append(Symbol(i,n[i]));
        }
        return sb.toString();
    }


    public String Symbol(int mag, int num){
        switch (mag){
            case 3:return ones[num];
            case 2:return tens[num];
            case 1:return hundreds[num];
            case 0:return thousands[num];
        }
        return null;
    }

/*  Runtime:100ms Beats 58%
    //This is the fastest submission actually!
    public String intToRoman(int num) {
        // values和strs数组的index上是对应的。相当于一个mapping的对照。
        int[] values = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] strs = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder sb = new StringBuilder();
        // 从最大的roman字母(或字母pair)开始使用，然后次大，然后次次大，直到能完全表示当前int为止。
        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                // 每用一次字母strs[i]，num的值都有一份values[i]得到了转化
                num -= values[i];
                sb.append(strs[i]);
            }
        }
        return sb.toString();
    }
 */

    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(s.intToRoman(3976));
    }

}
