package HammingDistance;

/**
 * Created by Allan Wong on 2017/5/27.
 */
public class Solution {
    //Runtime:10ms
    public int hammingDistance(int x, int y) {
        int count=0;
        int i=x^y;
        while(i!=0){
            count++;
            i=(i-1)&i;
        }
        return count;
    }

    /*sample 9ms
    *
    public int hammingDistance(int x, int y) {
        int count = 0;
        while(!(x == 0 && y == 0)){
            if(x%2 != y%2){
                count++;
            }
            x /= 2;
            y /= 2;
        }
        return count;
    }
    *
    * */
}
