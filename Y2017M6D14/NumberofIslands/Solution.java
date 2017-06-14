package Y2017M6D14.NumberofIslands;

/**
 * Created by Allan Wong on 2017/6/15.
 */
public class Solution {
    //Runtime:2ms Better than or equals to 100%
    public int numIslands(char[][] grid) {
        if (grid == null||grid.length==0)
            return 0;
        int m = grid.length, n = grid[0].length;
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1'){
                    count++;
                    clear(grid,i,j);
                }


            }
        }
        return count;
    }

/*    public void clear(char[][] grid,int i,int j){
        if(i>0&&grid[i-1][j]=='1'){
            grid[i-1][j]='0';
            clear(grid,i-1,j);
        }
        if(j>0&&grid[i][j-1]=='1'){
            grid[i][j-1]='0';
            clear(grid,i,j-1);
        }
        if(i<grid.length-1&&grid[i+1][j]=='1'){
            grid[i+1][j]='0';
            clear(grid,i+1,j);
        }
        if(j<grid[0].length-1&&grid[i][j+1]=='1'){
            grid[i][j+1]='0';
            clear(grid,i,j+1);
        }
    }*/


    //Improved Clear function
    public void clear(char[][] grid,int i,int j){
        if(i<0||j<0||i>=grid.length||j>=grid[0].length||grid[i][j]=='0') return;
        grid[i][j]='0';
        clear(grid,i-1,j);
        clear(grid,i+1,j);
        clear(grid,i,j-1);
        clear(grid,i,j+1);
    }
    //Runtime:
    /*



     */


    public static void main(String[] args) {
        char[][] grid = new char[][]{"111".toCharArray(), "010".toCharArray(), "111".toCharArray()};
        Solution s = new Solution();
        int res = s.numIslands(grid);
        System.out.println();
        System.out.println("Done.");
    }


}
