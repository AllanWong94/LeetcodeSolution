package Y2017.M7.D13.ReverseVowelsofaString;


import java.util.LinkedList;

/**
 * Created by Allan Wong on 7/13/2017.
 */
public class Solution {
    //Runtime:13ms Better than or equals to 50%
//    public String reverseVowels(String s) {
//        String vowels="aeiouAEIOU";
//        char[] chars=s.toCharArray();
//        LinkedList indices=new LinkedList(), characters=new LinkedList();
//        for(int i=0;i<s.length();i++){
//            if(vowels.indexOf(chars[i])!=-1){
//                indices.add(i);
//                characters.add(chars[i]);
//            }
//        }
//        for(Object c:characters){
//            chars[(int)indices.removeLast()]=(char)c;
//        }
//        return String.valueOf(chars);
//    }

//    Improved.
    //Runtime:10ms Better than or equals to 94%
    public String reverseVowels(String s) {
        char[] chars=s.toCharArray();
        int left=0,right=s.length()-1;
        String vowels="aeiouAEIOU";
        while(left<right){
            while(left<s.length() && vowels.indexOf(chars[left])==-1) left++;
            while(right>=0 && vowels.indexOf(chars[right])==-1) right--;
            if(left>=right)
                break;
            char temp=chars[left];
            chars[left]=chars[right];
            chars[right]=temp;
            left++;
            right--;
        }
        return String.valueOf(chars);
    }



    //Runtime:
    /*
    */




    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(s.reverseVowels("hello"));
        System.out.println("Done.");
    }


}
