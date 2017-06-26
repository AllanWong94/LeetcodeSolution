package Y2017.M6.Y2017M6D20.LongestCommonPrefix;

/**
 * Created by Allan Wong on 2017/6/20.
 */
public class Solution {
    //Runtime:12ms Better than or equals to 78%
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0)
            return "";
        if(strs.length==1)
            return strs[1];
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<strs[0].length();i++){
            for(String s:strs){
                if(i>=s.length()||s.charAt(i)!=strs[0].charAt(i))
                    return sb.toString();
            }
            sb.append(strs[0].charAt(i));
        }
        return sb.toString();
    }
    //Runtime:10ms
    /*
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";
        String pre = strs[0];
        int i = 1;
        while (i < strs.length) {
            while (strs[i].indexOf(pre) != 0)
                pre = pre.substring(0, pre.length() - 1);
            i++;
        }
        return pre;
    }
    */


    public static void main(String[] args) {
        Solution s = new Solution();
        String res = s.longestCommonPrefix(new String[]{"a", "b"});
        System.out.println();
        System.out.println("Done.");
    }


}
