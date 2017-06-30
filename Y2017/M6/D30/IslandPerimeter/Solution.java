package Y2017.M6.D30.IslandPerimeter;

/**
 * Created by Allan Wong on 2017/6/30.
 */
public class Solution {
    //Runtime:193ms Better than or equals to 15%
    //Naive method.
  /*  public int islandPerimeter(int[][] grid) {
        int left=100,right=0,up=100,down=0,res=0,m=grid.length,n=grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1) {
                    if(i==0) res++;
                    if(j==0) res++;
                    if(i==m-1) res++;
                    if(j==n-1) res++;

                    if (i > 0 && grid[i - 1][j] == 0)
                        res++;
                    if (j > 0 && grid[i][j - 1] == 0)
                        res++;
                    if (i < m - 1 && grid[i + 1][j] == 0)
                        res++;
                    if (j < n - 1 && grid[i][j + 1] == 0)
                        res++;
                }
            }
        }
        return res;
    }
*/
  //Improved. Runtime:149ms Better than or equals to 65%
    public int islandPerimeter(int[][] grid) {
        int m=grid.length,n=grid[0].length;
        for(int i=0;i<m;i++) {
            for (int j = 0; j < n; j++) {
                if(grid[i][j]==1)
                    return helper(grid,i,j,m,n);
            }
        }
        return -1;
    }

    /*Runtime:121ms
    //Add 4 in the beginning and minus 2 for every internal edge. Only right edge and down edge checked.
    public int islandPerimeter(int[][] grid) {
        int result = 0;

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j] == 1){
                    result += 4;
                    if(i < grid.length-1 && grid[i+1][j] == 1) result -= 2;
                    if(j < grid[i].length-1 && grid[i][j+1] == 1) result -= 2;

            }
        }
        return result;
    }
     */


    public int helper(int[][] grid,int i,int j,int m,int n){
        if(grid[i][j]!=1)
            return 0;
        int res=0;
        if(i==0||grid[i-1][j]==0) res++;
        if(i==m-1||grid[i+1][j]==0) res++;
        if(j==0||grid[i][j-1]==0) res++;
        if(j==n-1||grid[i][j+1]==0) res++;
        grid[i][j]=2;
        if(i>0) res+=helper(grid,i-1,j,m,n);
        if(i<m-1) res+=helper(grid,i+1,j,m,n);
        if(j>0) res+=helper(grid,i,j-1,m,n);
        if(j<n-1) res+=helper(grid,i,j+1,m,n);
        return res;
    }

    //Runtime:
    /*
    */




    public static void main(String[] args) {
        int[][] a = new int[][]{{1,1},{1,1}};
        Solution s=new Solution();
        int res=s.islandPerimeter(a);
        System.out.println(res);
        System.out.println("Done.");
    }


}
