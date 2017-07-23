package Y2017.M7.D23.Word_Pattern;

import java.util.HashMap;

/**
 * Created by Allan Wong on 7/23/2017.
 */
public class Solution {
    //Runtime:2ms Better than or equals to 95%
    public boolean wordPattern(String pattern, String str) {
        String[] strs=str.split(" ");
        if (strs.length!=pattern.length())
            return false;
        HashMap<Character,String> map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char c=pattern.charAt(i);
            String string=strs[i];
            if(map.containsValue(string)){
                if(map.get(c)==null||!map.get(c).equals(string))
                    return false;
            }else{
                if(map.containsKey(c)) return false;
                map.put(c,string);
            }


//            if(map.containsKey(strs[i])){
//                if(!map.get(strs[i]).equals(pattern.charAt(i)))  return false;
//            }else{
//                map.put(strs[i],pattern.charAt(i));
//            }
//            if(dict[pattern.charAt(i)-'a']==null){
//                dict[pattern.charAt(i)-'a']=strs[i];
//            }else{
//                if(!dict[pattern.charAt(i)-'a'].equals(strs[i]))
//                    return false;
//            }
        }
        return true;
    }
    //Runtime:
    /*
    */




    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(s.wordPattern("abba","dog cat cat fish"));
        System.out.println("Done.");
    }


}
