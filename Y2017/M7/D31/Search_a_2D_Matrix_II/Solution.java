package Y2017.M7.D31.Search_a_2D_Matrix_II;

/**
 * Created by Allan Wong on 8/1/2017.
 */
public class Solution {
    //Runtime:12ms Better than or equals to 100%
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null||matrix.length==0) return false;
        int w=matrix[0].length-1,h=0;
        while(w>=0&&h<matrix.length){
            if(matrix[h][w]>target)
                w--;
            else if(matrix[h][w]<target)
                h++;
            else
                return true;
        }
        return false;
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
