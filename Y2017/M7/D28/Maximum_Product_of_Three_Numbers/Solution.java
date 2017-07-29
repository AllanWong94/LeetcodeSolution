package Y2017.M7.D28.Maximum_Product_of_Three_Numbers;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Created by Allan Wong on 7/28/2017.
 */
public class Solution {

//    public int maximumProduct(int[] nums) {
//        LinkedList<Integer> sum=new LinkedList<>();
//        for(int n:nums){
//            sum=insert(sum,n);
//        }
//        int res=1;
//        for(int n:sum){
//            res*=n;
//        }
//        return res;
//    }
//
//    public LinkedList insert(LinkedList<Integer> sum, int num){
//        if(sum.size()==0||num<=sum.get(0))
//            sum.addFirst(num);
//        else if(num>sum.get(sum.size()-1))
//            sum.addLast(num);
//        else{
//            for(int i=0;i<sum.size()-1;i++){
//                if(num>=sum.get(i)&&num<sum.get(i+1))
//                    sum.add(i,num);
//            }
//        }
//        if(sum.size()>3)
//            sum.removeFirst();
//        return sum;
//    }
    //Runtime:32ms Better than or equals to 63%
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int res=1,l=nums.length,res2;
        for(int i=0;i<3;i++){
            res*=nums[l-1-i];
        }
        res2=nums[l-1];
        res2*=nums[0];
        res2*=nums[1];
        return Math.max(res,res2);
    }

    //Runtime:11ms
    /*Used Bubble sort to store values.
    public int maximumProduct(int[] a) {
        int x = -1000;
        int y = -1000;
        int z = -1000;
        int m = 1000;
        int n = 1000;
        int t;
        for (int i = 0; i< a.length; i++) {
            if (a[i] > x) {
                x = a[i];
                if (x > y) {
                    t = x;
                    x = y;
                    y = t;
                    if (y > z) {
                        t = y;
                        y = z;
                        z = t;
                    }
                }
            }
            if (a[i] < m) {
                m = a[i];
                if (m < n) {
                    t = m;
                    m = n;
                    n = t;
                }
            }
        }
        return (m*n*z > x*y*z ? m*n*z : x*y*z);
    }
    */


    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.maximumProduct(new int[]{1,2,3}));
        System.out.println("Done.");
    }


}
