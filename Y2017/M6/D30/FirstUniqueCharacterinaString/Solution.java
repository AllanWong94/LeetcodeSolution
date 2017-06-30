package Y2017.M6.D30.FirstUniqueCharacterinaString;

/**
 * Created by Allan Wong on 2017/6/30.
 */
public class Solution {
    //Runtime:29ms Better than or equals to 70%
    public int firstUniqChar(String s) {
        int[] index=new int[26];
        boolean[] c_s=new boolean[s.length()];
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(index[c-'a']>0)
                c_s[index[c-'a']-1]=false;
            else{
                index[c-'a']=i+1;
                c_s[i]=true;
            }
        }
        for(int i=0;i<s.length();i++){
            if(c_s[i])
                return i;
        }
        return -1;
    }
    //Runtime:10ms
    /*
    public int firstUniqChar(String s) {
        int resInt = Integer.MAX_VALUE;
		int temp;
		for(int i = 97; i < 123; i++){
			temp = s.indexOf(i);
			if(temp != -1 && temp == s.lastIndexOf(i)){
				resInt = Math.min(temp, resInt);
			}
		}
		if(resInt != Integer.MAX_VALUE)
			return resInt;
		return -1;
    }
    */




    public static void main(String[] args) {
        Solution s=new Solution();
        String string="loveleetcode";
        System.out.println(s.firstUniqChar(string));
        System.out.println("Done.");
    }


}
