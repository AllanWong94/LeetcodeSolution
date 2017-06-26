package Y2017.M6.Y2017M6D17.LargestPalindromeProduct;

/**
 * Created by Allan Wong on 2017/6/17.
 */
public class Solution {
    //Runtime:512ms Better than or equals to 62%
    //Reference: https://discuss.leetcode.com/topic/74143/java-solution-with-explanation
    //After improvement: Runtime:84ms Better than or equals to 90%
    public int largestPalindrome(int n) {
        if (n == 1)
            return 9;
        long max = (long)Math.pow(10, n) - 1;
        long min = (long)Math.pow(10, n - 1);
        long res;
        for(Long k=max;k>=min;k--){
            res=makePalindrome(k,n);
            if(factorizable(res,max,min))
                return (int)(res%1337);
        }
        return -1;
        /*while (!factorizable(res, max, min)) {
            res = nextPalindrome(res, n);
        }
        res%=1337;
        return res.intValue();*/
    }

    public long makePalindrome(long x, int n){
        long scale=(long)Math.pow(10, n);
        long temp=x*scale;
        while(x>0){
            scale/=10;
            temp+=x%10*scale;
            x/=10;
        }
        return temp;
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

    /*Original factorizable.
    public boolean factorizable(long x, long max, long min) {
        if (x == 9)
            return true;
        long temp = max;
        while (temp >= (long) Math.sqrt(x)) {
            if (x % temp == 0 && x / temp >= min && x / temp <= max)
                return true;
            temp--;
        }
        return false;
    }*/

    //Improved factorizable
    public boolean factorizable(long x,long max,long min){
        long root=(long)Math.sqrt(x);
        if(root>max||root<min)
            return false;
        long hi=root,lo=root,temp=lo*hi;
        while(temp!=x){
            if(temp<x){
                hi++;
                if(hi>max)
                    return false;
            }else{
                lo--;
                if(lo<min)
                    return false;
            }
            temp=hi*lo;
        }
        return true;
    }
    //Runtime:115ms Reference:https://discuss.leetcode.com/topic/74533/java-solution-115ms
    /*
    protected long getParlindrome(int high, int n) {
        long result = high * (long)(Math.pow(10, n));

        int tmp = 0;
        while(high > 0) {
            tmp = tmp * 10 + high % 10;
            high = high/10;
        }

        return result + tmp;
    }

    protected long getOddParlindrome(int high, int mid, int n) {
        if(n == 0) {
            return mid;
        }

        long result = high * (long)(Math.pow(10, n+1))  + mid;

        int tmp = 0;
        while(high > 0) {
            tmp = tmp * 10 + high % 10;
            high = high /10;
        }

        return result + tmp;
    }

    protected boolean isValid(long val, int high, int low) {
        long root = (long)Math.sqrt(val);
        if(root > high || root < low) {
            return false;
        }

        long myh = root;
        long myl = root;
        long tmp = myh * myl;

        while(tmp != val) {
            if(tmp < val) {
                myh += 1;
                if(myh > high) {
                    return false;
                }
            } else {
                myl -= 1;
                if(myl < low) {
                    return false;
                }
            }

            tmp = myh * myl;
        }

        return true;
    }

    public int largestPalindrome(int n) {

        long product = 0;
        int high = (int)Math.pow(10, n) - 1;
        int low = (int)Math.pow(10, n-1);

        //product = 2*n digits
        for(int i = high; i >= low; i --) {
            product = getParlindrome(i, n);
            if(isValid(product, high, low)) {
                return (int)(product % 1337);
            }
        }

        //product = 2*n-1 digits
        for(int i = low-1; i >= (int)(Math.pow(10, n-2)); i --) {
            for(int k = 9; k >= 0; k --) {
                product = getOddParlindrome(i, k, n-1);
                if(isValid(product, high, low)) {
                    return (int)(product % 1337);
                }
            }
        }

        return -1;
    }*/

    public static void main(String[] args) {
        Solution s = new Solution();

         System.out.println(s.makePalindrome(97L,2));

        // System.out.println("Done.");
    }


}
