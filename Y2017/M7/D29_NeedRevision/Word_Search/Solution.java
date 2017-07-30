package Y2017.M7.D29_NeedRevision.Word_Search;

import java.util.HashSet;

/**
 * Created by Allan Wong on 7/30/2017.
 */
public class Solution {
    //Runtime:8ms Better than or equals to 99%
    //Reference: https://discuss.leetcode.com/topic/7907/accepted-very-short-java-solution-no-additional-space
    //Caution: Modification to the board must be restored for next comparison!
    int w, h;

    public boolean exist(char[][] board, String word) {
        h = board.length;
        w = board[0].length;
        char[] chars = word.toCharArray();
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (helper(board, i, j, chars, 0))
                    return true;
            }
        }
        return false;
    }

    public boolean helper(char[][] board, int i, int j, char[] chars, int k) {
        if (k == chars.length) return true;
        if (i < 0 || j < 0 || i == h || j == w) return false;
        if (chars[k] != board[i][j])
            return false;
        board[i][j] ^= 256;
        boolean exist = helper(board, i + 1, j, chars, k + 1) || helper(board, i - 1, j, chars, k + 1) || helper(board, i, j + 1, chars, k + 1) || helper(board, i, j - 1, chars, k + 1);
        board[i][j] ^= 256;
        return exist;
    }
    //Runtime:
    /*
    */


    public static void main(String[] args) {
        Solution s = new Solution();
        char[][] board = new char[][]{"CAA".toCharArray(), "AAA".toCharArray(), "BCD".toCharArray()};
        System.out.println(s.exist(board, "AAB"));
        System.out.println("Done.");
    }


}
