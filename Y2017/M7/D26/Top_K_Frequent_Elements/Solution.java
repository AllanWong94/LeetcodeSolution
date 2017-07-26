package Y2017.M7.D26.Top_K_Frequent_Elements;

import java.util.*;

/**
 * Created by Allan Wong on 7/26/2017.
 */
public class Solution {
    //Runtime:27ms Better than or equals to 79%
    public List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map=new HashMap<>();
        LinkedList<Integer> res=new LinkedList();
        for(int num:nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else{
                map.put(num,1);
            }
        }
        LinkedList<Integer>[] buckets=new LinkedList[nums.length+1];
        for(int key:map.keySet()){
            int freq=map.get(key);
            if(buckets[freq]==null)
                buckets[freq]=new LinkedList<>();
            buckets[freq].add(key);
        }
        for(int i=nums.length;i>=0;i--){
            if(res.size()<k&&buckets[i]!=null){
                res.addAll(buckets[i]);
            }
        }
        return res;
    }
    //Runtime:5ms
    /*
    public List<Integer> topKFrequent(int[] nums, int k) {
        int[] extrema = findExtrema(nums);
        int min = extrema[0], max = extrema[1];
        int[] freq = new int[max - min];
        for (int num : nums) freq[num - min]++;
        int[] extrema_freq = findExtrema(freq);
        int min_freq = extrema_freq[0], max_freq = extrema_freq[1];
        ArrayList<Integer>[] list = new ArrayList[max_freq - min_freq];
        for (int i = 0; i < freq.length; i++) {
            if (list[freq[i] - min_freq] == null) list[freq[i] - min_freq] = new ArrayList<>();
            list[freq[i] - min_freq].add(i + min);
        }
        List<Integer> res = new ArrayList<>();
        int index = list.length - 1;
        while (k > 0) {
            if (list[index] != null) {
                //k--;
                for (int num : list[index]) {
                    k--;
                    if (k < 0) break;
                    res.add(num);
                }
            }
            index--;
        }
        return res;
    }
    private int[] findExtrema(int[] nums) {
        int max = nums[0], min = max;
        for (int i = 1; i < nums.length; i++) {
            if (max < nums[i]) max = nums[i];
            if (min > nums[i]) min = nums[i];
        }
        return new int[]{min, max + 1};
    }
    */




    public static void main(String[] args) {
        Solution s=new Solution();
        List list=s.topKFrequent(new int[]{3,2,3,1,2,4,5,5,6,7,7,8,2,3,1,1,1,10,11,5,6,2,4,7,8,5,6},10);
        System.out.println();
        System.out.println("Done.");
    }


}
