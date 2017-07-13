package Y2017.M7.D13.MergeIntervals;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Allan Wong on 7/13/2017.
 */
public class Solution {
    //Runtime:22ms Better than or equals to 92.54%
    public List<Interval> merge(List<Interval> intervals) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (Interval interval : intervals) {
            min = Math.min(interval.start, min);
            max = Math.max(interval.end, max);
        }
        boolean[] storage = new boolean[(max - min + 1)*2];
        for (Interval interval : intervals) {
            int start = interval.start, end = interval.end;
            for (int i = start; i < end; i++) {
                storage[(i - min)*2] = true;
                storage[(i - min)*2+1] = true;
            }
            storage[(end-min)*2]=true;
        }
        LinkedList<Interval> res=new LinkedList<>();
        int start=-1;
        for(int i=0;i<storage.length;i++){
            if(storage[i]){
                if(start==-1){
                    start=i/2;
                }
            }else{
                if(start!=-1){
                    res.add(new Interval(start+min,(i-1)/2+min));
                    start=-1;
                }
            }
        }
        if(start!=-1)
            res.add(new Interval(start+min,max));
        return res;
    }
    //Runtime:
    /*
    */

    public static class Interval {
        int start;
        int end;

        Interval() {
            start = 0;
            end = 0;
        }

        Interval(int s, int e) {
            start = s;
            end = e;
        }
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] a=new int[][]{{1,3},{2,6},{8,10},{15,18}};
        LinkedList<Interval> input=new LinkedList<>();
        for(int[] k:a){
            input.add(new Interval(k[0],k[1]));
        }
        List list=s.merge(input);
        System.out.println();
        System.out.println("Done.");
    }


}
