package Y2017.M7.D15.Sqrt;

/**
 * Created by Allan Wong on 7/15/2017.
 */
public class Solution {
    //Runtime:3ms Better than or equals to 71%
    //Reference： https://discuss.leetcode.com/topic/8680/a-binary-search-solution
    public int sqrt(int x) {
        if (x == 0)
            return 0;
        int left = 1, right = x;
        while (true) {
            int mid = (left+right)/2;
            if (mid > x/mid) {
                right = mid - 1;
            } else {
                if (mid + 1 > x/(mid + 1))
                    return mid;
                left = mid + 1;
            }
        }
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
