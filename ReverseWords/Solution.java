package ReverseWords;

import java.util.ArrayList;

/**
 * Created by Allan Wong on 2017/5/27.
 */
public class Solution {

    //Runtime:27ms Beats 24%
    /*public String reverseWords(String s) {
      //  ArrayList<Integer> wordLength=new ArrayList<>();
        ArrayList<String> words=new ArrayList<>();
        int index=0;
        //int length=0;
        String word="";
        while(index<s.length()){
            if(s.charAt(index)==' '){
                if(!word.equals("")){
       //             wordLength.add(length);
                    words.add(word);
                }
                word="";
                //       length=0;
            }else{
                //        length++;
                word+=s.charAt(index);
            }
            index++;
        }
        //  wordLength.add(length);
        if(!word.equals(""))
            words.add(word);
        StringBuilder sb=new StringBuilder();
        for(int i=words.size()-1;i>=0;i--){
            sb.append(words.get(i));
            if(i>0)
                sb.append(' ');
        }




        return sb.toString();
    }

  Runtime 2ms*/
    public String reverseWords(String s) {

        if(s == null || s.length() == 0) {
            return "";
        }

        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = arr.length - 1; i >= 0; i--) {

            if(!arr[i].equals("")) {
                sb.append(arr[i]);
                sb.append(" ");
            }
        }

        return sb.length() == 0 ? "" : sb.substring(0, sb.length() - 1);
    }


}
