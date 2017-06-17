package Y2017M6D17.LargestPalindromeProduct;

/**
 * Created by Allan Wong on 2017/6/17.
 */
public class Solution {
    //Runtime:512ms Better than or equals to 62%
    //Reference: https://discuss.leetcode.com/topic/74143/java-solution-with-explanation
    public int largestPalindrome(int n) {
        if (n == 1)
            return 9;
        Long max = Math.round(Math.pow(10, n)) - 1;
        Long min = Math.round(Math.pow(10, n - 1));
        Long res = Math.round(Math.pow(10, 2 * n)) - 1;
        while (!factorizable(res, max, min)) {
            res = nextPalindrome(res, n);
        }
        res%=1337;
        return res.intValue();
    }

    public Long nextPalindrome(Long x, int length) {
        Long scale = Math.round(Math.pow(10, length));
        Long temp = x / scale;
        temp--;
        Long res = scale * temp;
        while (temp != 0) {
            scale /= 10;
            Long temp1 = temp % 10;
            res += temp1 * scale;
            temp /= 10;
        }
        return res;
    }

    public boolean factorizable(Long x, Long max, Long min) {
        if (x == 9)
            return true;
        int root=(int) Math.sqrt(x),lo=root,hi=root;
        while (temp >= ) {
            if (x % temp == 0 && x / temp >= min && x / temp <= max)
                return true;
            temp--;
        }
        return false;
    }
    //Runtime:
    /*
    */


    public static void main(String[] args) {
        Solution s = new Solution();

         System.out.println(s.largestPalindrome(5));

        // System.out.println("Done.");
    }


}
