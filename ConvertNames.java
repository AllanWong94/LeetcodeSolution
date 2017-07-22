/**
 * Created by Allan Wong on 7/16/2017.
 */
public class ConvertNames {

    public static String convert(String s){
        char[] chars=s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(chars[i]==' ')
                chars[i]='_';
        }
        return String.valueOf(chars);
    }


    public static void main(String[] args) {
        String s="Remove Duplicates from Sorted List";
        System.out.println(convert(s));
    }
}
