package Y2017.M7.D20.First_Bad_Version;

/**
 * Created by Allan Wong on 7/20/2017.
 */
public class Solution {
    //Runtime:34ms Better than or equals to 3%
    public int firstBadVersion(int n) {
        if(isBadVersion(1))
            return 1;
        int lo = 1, hi = n, mid = lo+(hi-lo)/2;
        boolean next = isBadVersion(mid + 1), cur = isBadVersion(mid);
        while (cur || !next) {
            if (next) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
            mid = lo+(hi-lo)/2;
            next = isBadVersion(mid + 1);
            cur = isBadVersion(mid);
        }
        return mid+1;
    }


    //Runtime:16ms
    /*Only 1 call to isBadVersion()! per loop!
    public int firstBadVersion(int n) {
        int start = 1, end = n;
    while (start < end) {
        int mid = start + (end-start) / 2;
        if (!isBadVersion(mid)) start = mid + 1;
        else end = mid;
    }
    return start;
    }
    */

    boolean isBadVersion(int version) {
        int f=1702766719;
        return version>=f;
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.firstBadVersion(2126753390));
        System.out.println("Done.");
    }


}
