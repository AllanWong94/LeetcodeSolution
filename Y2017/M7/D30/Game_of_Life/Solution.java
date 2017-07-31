package Y2017.M7.D30.Game_of_Life;

/**
 * Created by Allan Wong on 7/30/2017.
 */
public class Solution {
    //Runtime:1ms Better than or equals to 85%
    //Reference: https://discuss.leetcode.com/topic/29054/easiest-java-solution-with-explanation

    //[2nd bit, 1st bit] = [next state, current state]
    //
    //- 00  dead (next) <- dead (current)
    //- 01  dead (next) <- live (current)
    //- 10  live (next) <- dead (current)
    //- 11  live (next) <- live (current)
    int w, h;

    public void gameOfLife(int[][] board) {
        h = board.length;
        w = board[0].length;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                board[i][j] = determine(i, j, board);
            }
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                board[i][j] >>= 1;
            }
        }
    }

    public int determine(int i, int j, int[][] board) {
        int count = 0;
        for(int x=Math.max(i-1,0);x<=Math.min(h-1,i+1);x++){
            for(int y=Math.max(j-1,0);y<=Math.min(w-1,j+1);y++){
                if((board[x][y]&1)==1)
                    count++;
            }
        }
        count-=board[i][j]&1;
        if((board[i][j]&1)==1){
            if(count<2||count>3) return 1;
            else return 3;
        }else{
            if(count==3) return 2;
            else return 0;
        }
    }
    //Runtime:
    /*
    */


    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println();
        System.out.println("Done.");
    }


}
