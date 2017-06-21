package Y2017M6D21.PalindromeNumber;

/**
 * Created by Allan Wong on 2017/6/21.
 */
public class Solution {
    //Runtime:197ms Better than or equals to 88%
    //Comment: Requirement no extra space not met.
    public boolean isPalindrome(int x) {
        if(x%10==0&&x!=0)
            return false;
        int scale=(int) Math.log10(x);
        while (x != 0 && x > 0) {
            x = (x - (x % 10) * (1 + (int)Math.pow(10,scale))) / 10;
            scale-=2;
        }
        return x == 0;
    }
    //Runtime:162ms
    /*Comment:Still used O(1) space. Perhaps "no extra space" means no big Omega(N) space?
    public boolean isPalindrome(int x) {
        // 因为算法已经cover了10,20,30,...有尾巴一串0的corner case，所以这里不用判断
        if (x < 0) {
            return false;
        }
        int tempX = x;
        int reverse = 0;
        // 当tempX剩下一位数的时候停下来
        while (tempX >= 10) {
            reverse = reverse * 10 + tempX % 10;
            tempX /= 10;
        }
        //对比整个x的头尾两位，以及中间所有位reverse以后是否与不reverser时一致
        return tempX == x % 10 && reverse == x / 10;
    }
    */

    public static void main(String[] args) {
        Solution s = new Solution();
        int x = 121;
        boolean res=s.isPalindrome(x);
        System.out.println(res);
        System.out.println("Done.");
    }


}
