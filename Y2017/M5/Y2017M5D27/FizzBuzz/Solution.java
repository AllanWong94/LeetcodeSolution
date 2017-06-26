package FizzBuzz;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Allan Wong on 2017/5/27.
 */
public class Solution {
    //Runtime:4ms
    public List<String> fizzBuzz(int n) {
        List<String> res=new ArrayList<>(n);
        String s;
        boolean three,five;
        int count=1;
        while(count<=n){
            s="";
            three=count%3==0;
            five=count%5==0;
            if(three){
                s="Fizz";
            }
            if(five)
                s+="Buzz";
            if(!three&!five)
                s=String.valueOf(count);
            res.add(s);
            count++;
        }
        return res;
    }

    /*Runtime:3ms
    *public List<String> fizzBuzz(int n) {
        String[] ans = new String[n];
        for(int i = 0; i < n; i++) {
            if((i+1) % 15 == 0) {
                ans[i] = "FizzBuzz";
            } else if((i+1) % 5 == 0) {
                ans[i] = "Buzz";
            } else if((i+1) % 3 == 0) {
                ans[i] = "Fizz";
            } else {
                ans[i] = Integer.toString(i+1);
            }
        }
        return new ArrayList(Arrays.asList(ans));
    }
    *
    *
    *
    * */
}
