package Y2017.M7.D25_NeedRevision.Repeated_DNA_Sequences_NeedRevision;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Allan Wong on 7/26/2017.
 */
public class Solution {
    //Runtime:52ms Better than or equals to 63%
    public List<String> findRepeatedDnaSequences(String s) {
        LinkedList<String> res=new LinkedList<>();
        int length=s.length();
        if(s==null||length<11)
            return res;
        HashSet<String> set=new HashSet<>(),added=new HashSet<>();
        for(int i=0;i<length-9;i++){
            String temp=s.substring(i,i+10);
            if(!set.add(temp)&&!added.contains(temp)){
                res.add(temp);
                added.add(temp);
            }
        }
        return res;
    }
    //Runtime:20ms
    /*
    public List<String> findRepeatedDnaSequences(String s) {
        int len = s.length(), hashKey = 0;
        List<String> result = new LinkedList<String>();
        if (len < 10) return result;

        char[] keyMap = new char[1 << 20];
        for (int i = 0; i < 9; i++) {
            hashKey = (hashKey << 2) | (s.charAt(i) - 'A' + 1) % 5;
        }
        for (int i = 9; i < len; i++) {
            hashKey = ((hashKey << 2) | (s.charAt(i) - 'A' + 1) % 5) & 0xfffff;
            if (keyMap[hashKey]++ == 1) {
                result.add(s.substring(i - 9, i + 1));
            }
        }
        return result;
    }
    */




    public static void main(String[] args) {
        Solution s=new Solution();
//        List res=s.findRepeatedDnaSequences("AAAAAAAAAAA");
        System.out.println('T'-'A');
        System.out.println("Done.");
    }


}
