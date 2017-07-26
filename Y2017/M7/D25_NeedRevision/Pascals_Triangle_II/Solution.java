package Y2017.M7.D25_NeedRevision.Pascals_Triangle_II;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Allan Wong on 7/26/2017.
 */
public class Solution {
    //Runtime:1ms Better than or equals to 99%
    public List<Integer> getRow(int rowIndex) {
        LinkedList<Integer> res=new LinkedList<>();
        if(rowIndex==0){
            res.add(1);
            return res;
        }
        int[][] triangle=new int[rowIndex][];
        triangle[0]=new int[]{1,1};
        for(int i=1;i<rowIndex;i++){
            int[] temp=new int[i+2];
            temp[0]=1;
            temp[i+1]=1;
            for(int j=1;j<i+1;j++){
                temp[j]=triangle[i-1][j-1]+triangle[i-1][j];
            }
            triangle[i]=temp;
        }
        for(int i=0;i<rowIndex+2;i++){
            res.add(triangle[rowIndex-1][i]);
        }
        return res;
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
