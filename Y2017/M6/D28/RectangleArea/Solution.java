package Y2017.M6.D28.RectangleArea;

/**
 * Created by Allan Wong on 2017/6/27.
 */
public class Solution {
    //Runtime:4ms Better than or equals to 99%
    public int computeArea(int LeftX1, int LowerY1, int RightX1, int UpperY1, int LeftX2, int LowerY2, int RightX2, int UpperY2) {
        int total=(UpperY1-LowerY1)*(RightX1-LeftX1)+(UpperY2-LowerY2)*(RightX2-LeftX2);
        if(LowerY2>=UpperY1||LowerY1>=UpperY2||RightX1<=LeftX2||RightX2<=LeftX1)  return total;
        else
            return total-(Math.min(UpperY1,UpperY2)-Math.max(LowerY1,LowerY2))*(Math.min(RightX1,RightX2)-Math.max(LeftX1,LeftX2));
    }
    //Runtime:
    /*
    */




    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println();
        System.out.println("Done.");
    }


}
