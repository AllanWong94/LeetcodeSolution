package NimGame;

/**
 * Created by Allan Wong on 2017/5/27.
 */
public class Solution {
    //Runtime:0ms Beats 6.8%
    public boolean canWinNim(int n) {
        return !(n%4==0);
    }
}
