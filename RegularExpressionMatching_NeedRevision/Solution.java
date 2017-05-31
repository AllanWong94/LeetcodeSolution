package RegularExpressionMatching_NeedRevision;

/**
 * Created by Allan Wong on 2017/5/31.
 */
public class Solution {

    /*Didn't work. Had to look for sample codes.
    public boolean isMatch(String s, String p) {
        boolean exist1=p.indexOf('.')!=-1,exist2=p.indexOf('*')!=-1;
        int Slength=s.length(),Plength=p.length();
        int sPointer=0,pPointer=0;
        if(p.equals(".*"))
            return true;
        if(!exist2 && Slength!=Plength)
            return false;
        if(!exist2){
            for(int i=0;i<Slength;i++){
                if(!equalsTo(s.charAt(i),p.charAt(i)))
                    return false;
            }
            return true;
        }else{
            while(sPointer<Slength){
                if(equalsTo(s.charAt(sPointer),p.charAt(pPointer))){
                    if(pPointer==Plength-1 || p.charAt(pPointer+1)!='*'){
                        pPointer++;
                    }
                    sPointer++;
                }else{
                    if(p.charAt(pPointer+1)!='*')
                        return false;
                    else
                        pPointer+=2;
                }
            }
            return pPointer>=Plength;
        }
    }

    public boolean equalsTo(char a, char b){
        if(a==b)
            return true;
        else if(b=='.')
            return true;
        return false;
    }

    public int countStars(String p){
        int count=0;
        for(char c:p.toCharArray()){
            if(c=='*')
                count++;
        }
        return count;
    }*/

    //Use 2D DP. Reference:https://discuss.leetcode.com/topic/40371/easy-dp-java-solution-with-detailed-explanation/2?page=1
    /*
    *
    *   1, If p.charAt(j) == s.charAt(i) :  dp[i][j] = dp[i-1][j-1];
        2, If p.charAt(j) == '.' : dp[i][j] = dp[i-1][j-1];
        3, If p.charAt(j) == '*':
        here are two sub conditions:
               1   if p.charAt(j-1) != s.charAt(i) : dp[i][j] = dp[i][j-2]  //in this case, a* only counts as empty
               2   if p.charAt(i-1) == s.charAt(i) or p.charAt(i-1) == '.':
                              dp[i][j] = dp[i-1][j]    //in this case, a* counts as multiple a
                           or dp[i][j] = dp[i][j-1]   // in this case, a* counts as single a
                           or dp[i][j] = dp[i][j-2]   // in this case, a* counts as empty
    *
    *
    *
    *   Runtime:29ms Beats 86%
    * */
    public boolean isMatch(String s, String p) {

        if(s==null||p==null)
            return false;


        int m=s.length()+1,n=p.length()+1;
        char[] sc=s.toCharArray();
        char[] pc=p.toCharArray();
        boolean[][] r=new boolean[m][n];
        r[0][0]=true;
        for(int i=1;i<n-1;i++){     //Why do this?
            if(pc[i]=='*')
                r[0][i+1]=r[0][i-1];
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(pc[j-1]==sc[i-1]||pc[j-1]=='.')
                    r[i][j]=r[i-1][j-1];
                else if(pc[j-1]=='*'){
                    if(pc[j-2]==sc[i-1]||pc[j-2]=='.'){
                        r[i][j]=r[i][j-2]|r[i-1][j];//r[i][j-2]=>count this x* as empty   r[i-1][j]=>count this x* as multiple characters
                    }else                           //single letter cases have been taken into account when j points to that character.
                        r[i][j]=r[i][j-2];//since the character doesn't match, it can only be counted as empty.
                }else
                    r[i][j]=false;
            }
        }

        return r[m-1][n-1];


    }

    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(s.isMatch("aa", "a"));
        //System.out.println("aavdcsgweaa".indexOf('v',2));
    }

}
