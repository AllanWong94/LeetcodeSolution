package Y2017M6D23.ExcelSheetColumnNumber;

/**
 * Created by Allan Wong on 2017/6/23.
 */
public class Solution {
    //Runtime:2ms Better than or equals to 100%
    //Reference to ExcelSheetColumnTitle.convertToTitle()
    public int titleToNumber(String s) {
        return s.length()==0?0:titleToNumber(s.substring(0,s.length()-1))*26+(s.charAt(s.length()-1)-'A'+1);
    }





    public static void main(String[] args) {
        Solution s=new Solution();
        String s1="123456";
        System.out.println(s.titleToNumber("ABC"));
        System.out.println("Done.");
    }


}
