package Y2017.M6.Y2017M6D25.GroupAnagrams;

import java.util.*;

/**
 * Created by Allan Wong on 2017/6/24.
 */
public class Solution {
    //Correct. But TLEed for input of large number of strings.
    /*public List<List<String>> groupAnagrams(String[] strs) {
        int[][] total=new int[strs.length][26];
        boolean[] checked=new boolean[strs.length];
        for (int i=0;i<strs.length;i++){
            for(char c:strs[i].toCharArray()){
                total[i][c-'a']++;
            }
        }
        List<List<String>> res=new LinkedList<>();
        List<String> temp;
        for(int i=0;i<strs.length;i++){
            if(!checked[i]){
                temp=new LinkedList<>();
                temp.add(strs[i]);
                checked[i]=true;
                for(int j=i+1;j<strs.length;j++){
                    if(Arrays.equals(total[i],total[j])){
                        temp.add(strs[j]);
                        checked[j]=true;
                    }
                }
                res.add(temp);
            }
        }
        return res;
    }*/
    //Runtime:29ms=>26ms Better than or equals to 76%=>94%
    public List<List<String>> groupAnagrams(String[] strs) {
        List<String> temp;
        HashMap<String, List<String>> map=new HashMap<>();
        for(String s:strs){
            char[] chars=s.toCharArray();
            Arrays.sort(chars);
            String string=String.valueOf(chars);
            if(map.containsKey(string)){
                map.get(string).add(s);
            }else{
                temp=new LinkedList<>();
                temp.add(s);
                map.put(string,temp);
            }
        }
        return new LinkedList<List<String>>(map.values());
    }
    //Runtime:19ms
    //Comment: Clever! Used primes to generate a unique number as the key for a certain specific combination of letters.
    /*
    public List<List<String>> groupAnagrams(String[] strs) {
        int[] prime = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103};

        List<List<String>> res = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (String s : strs) {
            int key = 1;
            for (char c : s.toCharArray()) {
                key *= prime[c - 'a'];
            }
            List<String> t;
            if (map.containsKey(key)) {
                t = res.get(map.get(key));
            } else {
                t = new ArrayList<>();
                res.add(t);
                map.put(key, res.size() - 1);
            }
            t.add(s);
        }
        return res;
    }
    */



    public static void main(String[] args) {
        Solution s=new Solution();
        String[] strings=new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> res=s.groupAnagrams(strings);
        System.out.println();
        System.out.println("Done.");
    }


}
