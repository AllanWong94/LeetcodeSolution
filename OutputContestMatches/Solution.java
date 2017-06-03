package OutputContestMatches;

/**
 * Created by Allan Wong on 2017/6/4.
 */
public class Solution {

    //Runtime:8ms Beats 83%
    public String findContestMatch(int n) {
        String[] s=new String[n+1];
        for (int i=0;i<n+1;i++)
            s[i]=String.valueOf(i);
        while(n>1){
            for (int k=1;k<n/2+1;k++){
                s[k]=stringCat(s[k],s[n+1-k]);
            }
            n/=2;
        }
        return s[1];
    }

    public String stringCat(String s1, String s2){
        return "("+s1+","+s2+")";
    }
/*Runtime:3ms
    public String findContestMatch(int n) {
        StringBuilder sb = new StringBuilder();
        helper(sb, 3, n, 1);
        return sb.toString();
    }

    void helper(StringBuilder sb, int sum, int n, int val) {
        if (sum > n + 1) {
            sb.append(val);
            return;
        }
        sb.append('(');
        helper(sb, (sum << 1) - 1, n, val);
        sb.append(',');
        helper(sb, (sum << 1) - 1, n, sum - val);
        sb.append(')');
    }*/





    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(s.findContestMatch(8));
        System.out.println("Done.");
    }



}
