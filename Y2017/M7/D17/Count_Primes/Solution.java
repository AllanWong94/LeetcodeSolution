package Y2017.M7.D17.Count_Primes;

/**
 * Created by Allan Wong on 7/17/2017.
 */
public class Solution {
    //Runtime:24ms Better than or equals to 91%
    public int countPrimes(int n) {
        if(n<2)
            return 0;
        boolean[] primes = new boolean[n];
        primes[0] = true;
        primes[1] = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (!primes[i]) {
                for (int k = 2*i; k < n; k += i) {
                    primes[k] = true;
                }
            }
        }
        int res=0;
        for(boolean b:primes){
            if(!b)
                res++;
        }
        return res;
    }
    //Runtime:
    /*
    public int countPrimes(int n) {
    if (n < 3)
        return 0;

    boolean[] f = new boolean[n];
    //Arrays.fill(f, true); boolean[] are initialed as false by default
    int count = n / 2;
    for (int i = 3; i * i < n; i += 2) {
        if (f[i])
            continue;

        for (int j = i * i; j < n; j += 2 * i) {
            if (!f[j]) {
                --count;
                f[j] = true;
            }
        }
    }
    return count;
}
    */


    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.countPrimes(2));
        System.out.println("Done.");
    }


}
