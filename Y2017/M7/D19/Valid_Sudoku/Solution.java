package Y2017.M7.D19.Valid_Sudoku;

/**
 * Created by Allan Wong on 7/19/2017.
 */
public class Solution {
    //Runtime:32ms Better than or equals to 76%
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            boolean[] horizontal = new boolean[9], vertical = new boolean[9];
            for (int j = 0; j < 9; j++) {
                if(board[i][j]!='.'){
                    if(horizontal[board[i][j]-'1'])
                        return false;
                    else
                        horizontal[board[i][j]-'1']=true;
                }
                if(board[j][i]!='.'){
                    if(vertical[board[j][i]-'1'])
                        return false;
                    else
                        vertical[board[j][i]-'1']=true;
                }
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                boolean[] grid=new boolean[9];
                for(int x=i*3;x<i*3+3;x++){
                    for(int y=j*3;y<j*3+3;y++){
                        if(board[x][y]!='.'){
                            if(grid[board[x][y]-'1'])
                                return false;
                            else
                                grid[board[x][y]-'1']=true;
                        }
                    }
                }
            }
        }
        return true;
    }
    //Runtime:24ms
    /*Used bit-manipulation rather than value assignments.
    public boolean isValidSudoku(char[][] board) {
        int[] rows = new int[9];
        int[] cols = new int[9];
        int[] boxs = new int[9];

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    int num = board[i][j]-'0';
                    if(num<=0 || num>9) return false;
                    num = 1<<num;
                    if((num&rows[i])==num) return false;
                    if((num&cols[j])==num) return false;
                    int ind = (i/3)*3;
                    ind+=(j/3);
                    if((num&boxs[ind])==num) return false;
                    rows[i] |= num;
                    cols[j] |= num;
                    boxs[ind] |= num;
                }
            }
        }
        return true;
    }
    */


    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println();
        System.out.println("Done.");
    }


}
