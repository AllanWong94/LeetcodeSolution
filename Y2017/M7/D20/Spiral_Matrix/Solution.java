package Y2017.M7.D20.Spiral_Matrix;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Allan Wong on 7/20/2017.
 */
public class Solution {
    //Runtime:2ms Better than or equals to 100%
    public List<Integer> spiralOrder(int[][] matrix) {
        LinkedList<Integer> res=new LinkedList<>();
        if(matrix==null||matrix.length==0)
            return res;
        int count=1,total=matrix.length*matrix[0].length;
        int x=0,y=0,left=0,right=matrix[0].length-1,bot=matrix.length-1,top=1;
        res.add(matrix[0][0]);
        while(true){
            while(y<right){
                y++;
                res.add(matrix[x][y]);
                count++;
            }
            if(count==total)
                break;
            right--;
            while(x<bot){
                x++;
                res.add(matrix[x][y]);
                count++;
            }
            if(count==total)
                break;
            bot--;
            while(y>left){
                y--;
                res.add(matrix[x][y]);
                count++;
            }
            if(count==total)
                break;
            left++;
            while(x>top){
                x--;
                res.add(matrix[x][y]);
                count++;
            }
            if(count==total)
                break;
            top++;
        }
        return res;
    }

    //Runtime:
    /*
    */




    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(s.spiralOrder(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));
        System.out.println("Done.");
    }


}
