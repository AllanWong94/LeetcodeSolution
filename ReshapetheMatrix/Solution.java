package ReshapetheMatrix;

/**
 * Created by Allan Wong on 2017/6/4.
 */
public class Solution {




    //Runtime:8ms Beats 62%
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if (nums == null)
            return nums;
        for (int[] i : nums) {
            if (i == null)
                return nums;
        }
        int rows = nums.length;
        int cols = nums[0].length;
        if (r * c > rows * cols)
            return nums;
        int[][] ans = new int[r][c];
        int count = 0;
        for (int[] i : nums) {
            for (int j : i) {
                int col = count % c ;
                int row = (count - col) / c;
                ans[row][col] = j;
                count++;
            }
        }
        return ans;
    }

    /*  Less calculations and value assignments. Try a more direct way than calculating.
    Runtime:3ms
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int[][] res=new int[r][c];
        if(nums.length==0 || r*c!=nums.length*nums[0].length)
            return nums;
        int rows=0,cols=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums[0].length;j++)
            {
               res[rows][cols]=nums[i][j];
               cols++;
               if(cols==c){
                rows++;
                cols=0;
                }
            }
        }
        return res;
    }



     */




    public static void main(String[] args) {
        Solution s=new Solution();
        int[][] a=new int[][]{{1,2},{3,4}};
        a=s.matrixReshape(a,1,4);
        System.out.println("Done.");
    }


}