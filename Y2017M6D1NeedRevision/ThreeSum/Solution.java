package ThreeSum;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Allan Wong on 2017/6/1.
 */
public class Solution {

    //Runtime:73ms Beats 96%
    //Made some improvements based on sample codes from: https://discuss.leetcode.com/topic/8125/concise-o-n-2-java-solution
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        int length=nums.length;
        int sum=0;
        sort(nums,0,length-1);
        for(int i=0;i<length-2;i++){
            if(i==0||(i>0 && nums[i]!=nums[i-1])){//Improvements:skip the same result set
                int j=i+1,k=length-1;
                while(j<k){
                    sum=nums[i]+nums[j]+nums[k];
                    if(sum==0){
                        while(j<k && nums[j]==nums[j+1]) j++;//Improvements:skip the same result set
                        while(j<k && nums[k]==nums[k-1]) k--;
                        List<Integer> temp=new ArrayList<>();
                        temp.clear();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        ans.add(temp);
                        k--;
                        j++;
                        continue;
                    }else if(sum>0){
                        k--;continue;
                    }else{
                        j++;continue;
                    }
                }
            }

        }
        return ans;
    }



    public void sort(int[] nums, int lo, int hi){
        if(hi<=lo)
            return;
        int pivot=nums[lo];
        int p=lo;
        int lt=lo,gt=hi;
        while(p<=gt){
            if(nums[p]<pivot){
                exch(nums,p++,lt++);
            }else if(nums[p]>pivot){
                exch(nums,p,gt--);
            }else{
                p++;
            }
        }
        sort(nums,lo, lt-1);
        sort(nums,gt+1, hi);
    }

    public void exch(int[] num,int i, int j){
        int temp=num[i];
        num[i]=num[j];
        num[j]=temp;
    }



    public static void main(String[] args) {
        Solution s=new Solution();

        System.out.println(s.threeSum(new int[]{-1,0,1,2,-1,-4}));
    }
}
