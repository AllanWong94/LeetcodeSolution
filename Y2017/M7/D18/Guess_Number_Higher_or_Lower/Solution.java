package Y2017.M7.D18.Guess_Number_Higher_or_Lower;

/**
 * Created by Allan Wong on 7/17/2017.
 */
public class Solution {
    //Runtime:1ms Better than or equals to 100%
    public int guessNumber(int n) {
        int g=n/2+1,res=guess(g),lo=1,hi=n;
        while(res!=0){
            if(res>0){
                if(n-g==1)
                    return n;
                lo=g;
            }else{
                if(g==2)
                    return 1;
                hi=g;
            }
            g=lo+(hi-lo)/2;
            res=guess(g);
        }
        return g;
    }
    //Runtime:
    /*
    */

    public int guess(int num){
        int prize=1702766719;
        if(num==prize)
            return 0;
        if(num<prize)
            return 1;
        return -1;
    }



    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(s.guessNumber(2126753390));
        System.out.println("Done.");
    }


}
