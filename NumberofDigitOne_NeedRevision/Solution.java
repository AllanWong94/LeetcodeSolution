package NumberofDigitOne_NeedRevision;

/**
 * Created by Allan Wong on 2017/6/1.
 */
public class Solution {


    //Naive method. TLEed.
    public int countDigitOneb(int n) {
        int count=0;
        for(int i=1;i<=n;i++){
            char[] chars=String.valueOf(i).toCharArray();
            for(char c:chars){
                if(c=='1')
                    count++;
            }
        }
        return count;
    }
    //Runtime:0ms fastest.
    public int countDigitOne(int n) {
        if(n<=0)
            return 0;
        int count=0;
        int log=(int)Math.log10(n);
        int m=0;
        int[] nums=new int[log+1];//nums[i]=># of 1s in a 10^(i) i.e. i=1=>0~9 (10^i~2*10^i excluded)
        nums[0]=0;
        for(int i=1;i<log+1;i++){
            nums[i]=nums[i-1]*10+(int)Math.pow(10,i-1);
        }
        for(int i=log;i>=0;i--){
            m=n/(int)Math.pow(10,i)%10;
            if(m>1){
                count+=nums[i]*m+Math.pow(10,i);
            }else if(m==1)
                count+=nums[i]+(n%(int)Math.pow(10,i+1)-(Math.pow(10,i)-1));
        }
        return count;
    }

    /*
    public int countDigitOne(int n) {
        int count = 0;

        for (long k = 1; k <= n; k *= 10) {
            long r = n / k, m = n % k;
            // sum up the count of ones on every place k
            count += (r + 8) / 10 * k + (r % 10 == 1 ? m + 1 : 0);
        }

        return count;
    }*/

    public static void main(String[] args) {
        Solution s=new Solution();
        int n=1410065408;//65408;
        //System.out.println(s.countDigitOneb(n));
        System.out.println(s.countDigitOne(n));
    }




}
