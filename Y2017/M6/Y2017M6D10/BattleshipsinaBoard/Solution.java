package Y2017.M6.Y2017M6D10.BattleshipsinaBoard;

/**
 * Created by Allan Wong on 2017/6/10.
 */
public class Solution {






    //Runtime:5ms Beats 14%
    public int countBattleships(char[][] board) {
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (j < board[0].length - 1 && i < board.length - 1 && board[i][j] == 'X' && board[i + 1][j] == 'X' && board[i][j + 1] == 'X')
                    return 0;
                if (board[i][j] == 'X') {
                    if (j < board[0].length - 1 && board[i][j + 1] == 'X') {
                        int temp = j;
                        while (board[i][temp] == 'X') {
                            board[i][temp] = '.';
                            temp++;
                            if (temp >= board[0].length)
                                break;
                        }
                    } else if (i < board.length - 1 && board[i + 1][j] == 'X') {
                        int temp = i;
                        while (board[temp][j] == 'X') {
                            board[temp][j] = '.';
                            temp++;
                            if (temp >= board.length)
                                break;
                        }
                    }
                    count++;
                }
            }
        }
        return count;
    }




/*
    //Sample code: Runtime:4ms
    public int countBattleships(char[][] board) {
        int m = board.length;
        if(m == 0){
            return 0;
        }
        int n = board[0].length;

        int count = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(board[i][j] == 'X' && (i == 0 || board[i-1][j] != 'X') && (j == 0 || board[i][j - 1] != 'X')){
                    count++;
                }
            }
        }
        return count;
    }


     */


    public static void main(String[] args) {
        Solution s = new Solution();
        char[][] a = new char[][]{"X..X".toCharArray(), "...X".toCharArray(), "...X".toCharArray()};
        System.out.println(s.countBattleships(a));
        System.out.println("Done.");
    }


}
