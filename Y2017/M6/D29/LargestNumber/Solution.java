package Y2017.M6.D29.LargestNumber;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Allan Wong on 6/29/2017.
 */
public class Solution {
    //Runtime:149ms Better than or equals to 23%
    //Reference: https://discuss.leetcode.com/topic/8018/my-java-solution-to-share
    public String largestNumber(int[] nums) {
        String[] strings=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            strings[i]=String.valueOf(nums[i]);
        }

        Comparator<String> comp=new MyComparator();
        Arrays.sort(strings,comp);

        if(strings[0].charAt(0)=='0'){
            return "0";
        }

        StringBuilder sb=new StringBuilder();
        for (String s:strings){
            sb.append(s);
        }
        return sb.toString();
    }
    public class MyComparator implements Comparator<String>{

        @Override
        public int compare(String o1, String o2) {
            String s1 = o1 + o2;
            String s2 = o2 + o1;
            return s2.compareTo(s1);
        }
    }

    /*Aborted. Too complicated.
    public class MyComparator<Integer> implements Comparator<Integer>{

        @Override
        public int compare(Integer o1, Integer o2) {
            String s1=String.valueOf(o1),s2=String.valueOf(o2);
            int i=0;
            int length=s1.length()>s2.length()?s2.length():s1.length();
            while(i<=length && s1.charAt(i)==s2.charAt(i)){
                i++;
            }
            if(i==length){
                if (s1.charAt(i-1)==s2.charAt(i-1))
                    return s1.length()>s2.length()?1:-1;
                else
                    return s1.charAt(length-1)>s2.charAt(length-1)?-1:1;
            }else{
                i--;
                return s1.charAt(i)>s2.charAt(i)?-1:1;
            }
        }

        @Override
        public boolean equals(Object obj) {
            return false;
        }
    }*/

    //Runtime:101ms
    /*
    public String largestNumber(int[] nums) {
        if(nums==null || nums.length==0) return "";
        String[] strs = new String[nums.length];
        for(int i=0;i<nums.length;i++){
            strs[i] = String.valueOf(nums[i]);
        }
        Comparator<String> comp = new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                String str1 = s1+s2;
                String str2 = s2+s1;
                return str2.compareTo(str1);
            }
        };
        Arrays.sort(strs, comp);
        if(strs[0].charAt(0) == '0') return "0";
        StringBuilder sb = new StringBuilder();
        for(String s: strs){
            sb.append(s);
        }
        return sb.toString();
    }
    */




    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println();
        System.out.println("Done.");
    }


}
