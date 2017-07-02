package Y2017.M7.D2.RansomNote;

/**
 * Created by Allan Wong on 2017/7/2.
 */
public class Solution {
    //Runtime:18ms Better than or equals to 80% One-time AC!
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] mag=new int[26];
        for (char c:magazine.toCharArray())
            mag[c-'a']++;
        for (char c:ransomNote.toCharArray()){
            if(mag[c-'a']==0)
                return false;
            mag[c-'a']--;
        }
        return true;
    }
    //Runtime:14ms
    /*public boolean canConstruct(String ransomNote, String magazine) {
		int[] magazineChars=new int[26];
		char[] chars1=ransomNote.toCharArray();
		char[] chars2=magazine.toCharArray();
		for(int i=0;i<chars2.length;i++){
			int index=chars2[i]-'a';
			magazineChars[index]++;
		}
		for(int i=0;i<chars1.length;i++){
			int index=chars1[i]-'a';
			magazineChars[index]--;
			if(magazineChars[index]<0){
				return false;
			}
		}
		return true;
	}
    */




    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println();
        System.out.println("Done.");
    }


}
