package ConstructtheRectangle;

/**
 * Created by Allan Wong on 2017/6/2.
 */
public class Solution {
    //Runtime:5ms Beats 58%
    public int[] constructRectangle(int area) {
        int root=(int)Math.sqrt(area);
        int mod=area%root;
        while(mod!=0){
            root--;
            mod=area%root;
        }
        return new int[]{area/root,root};
    }

    public static void main(String[] args) {
        int a = 24;
        Solution s=new Solution();
        int[] i=s.constructRectangle(a);
        System.out.println("Done.");
    }


}
