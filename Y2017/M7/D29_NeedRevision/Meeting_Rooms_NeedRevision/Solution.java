package Y2017.M7.D29_NeedRevision.Meeting_Rooms_NeedRevision;

import Y2017.Interval;

/**
 * Created by Allan Wong on 7/30/2017.
 */
public class Solution {
    //Runtime:14ms Better than or equals to 32%
//    public boolean canAttendMeetings(Interval[] intervals) {
//        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
//        for(Interval i:intervals){
//            if(min>i.start)
//                min=i.start;
//            if(max<i.end)
//                max=i.end;
//        }
//        boolean[] check=new boolean[2*(max-min+1)];
//        for(Interval in:intervals){
//            for(int i=2*(in.start-min);i<2*(in.end-min);i++){
//                if(check[i])
//                    return false;
//                check[i]=true;
//            }
//        }
//        return true;
//    }


    //Runtime:565ms Better than or equals to 32%
    public boolean canAttendMeetings(Interval[] intervals) {
        int[] ends=new int[intervals.length],starts=new int[intervals.length];
        for(int i=0;i<intervals.length;i++){
            starts[i]=intervals[i].start;
            ends[i]=intervals[i].end;
        }
        for(int i=0;i<intervals.length;i++){
            for(int j=0;j<intervals.length;j++){
                if(i==j)
                    continue;
                if((starts[i]<ends[j]&&starts[i]>=starts[j])||(ends[i]>starts[j]&&ends[i]<=ends[j]))
                    return false;
            }
        }
        return true;
    }

    //Runtime:4ms
    /*
    public boolean canAttendMeetings(Interval[] intervals) {
        int len = intervals.length;
        int[] a = new int[len];
        int[] b = new int[len];

        for (int i = 0; i < len; i++) {
            a[i] = intervals[i].start;
            b[i] = intervals[i].end;
        }

        Arrays.sort(a); Arrays.sort(b);

        for (int i = 0; i < len - 1; i++) {
            if (b[i] > a[i+1]) return false;
        }
        return true;
    }
    */




    public static void main(String[] args) {
        Solution s=new Solution();
        int[][] nums=new int[][]{{13,15},{1,13}};
        Interval[] intervals=new Interval[nums.length];
        for(int i=0;i<nums.length;i++){
            intervals[i]=new Interval(nums[i][0],nums[i][1]);
        }
        System.out.println(s.canAttendMeetings(intervals));
        System.out.println("Done.");
    }



}
