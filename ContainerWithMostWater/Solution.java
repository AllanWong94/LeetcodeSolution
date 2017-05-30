package ContainerWithMostWater;

/**
 * Created by Allan Wong on 2017/5/30.
 */
public class Solution {
    //Original Version
    //Runtime:12ms Beats 11%
/*
    public int maxArea(int[] height) {
        int max=0,area=0;
        int left=0,right=height.length-1;
        area=Math.min(height[left],height[right])*(right-left);
        max=Math.max(area,max);
        while(left<right){
            area=Math.min(height[left],height[right])*(right-left);
            max=Math.max(area,max);
            if(height[left]<=height[right]){
                left++;
            }else{
                right--;
            }
        }

        return max;
    }*/




    //Improved: skipped calculations for area when the moved pointer edge is
    //lower than or equal to the original edge, which means the area after movement
    //must be smaller than before, therefore no need to cal.
    //Runtime:7ms Beats 97%
    public int maxArea(int[] height) {
        int max=0;
        int left=0,right=height.length-1;
        while(left<right){
            max=Math.max(Math.min(height[left],height[right])*(right-left),max);
            int l=height[left],r=height[right];
            if(height[left]<=height[right]){
                while(l>=height[left] && left++<right);
            }else{
                while(r>=height[right] && left<right--);
            }
        }

        return max;
    }

/*  Runtime 9ms
    public int maxArea(int[] height) {
        int front = 0;
        int end = height.length-1;
        int a = 0;
        while(end > front){
            int left = height[front];
            int right = height[end];
            a = Math.max(a, Math.min(left,right)*(end - front));
            if(left < right){
                while(height[front] <= left && front++ < height.length - 1);
            }
            else{
                while(height[end] <= right && end-- > 0);
            }

        }

        return a;
    }*/


    public static void main(String[] args) {
        int[] h=new int[]{2,3,10,5,7,8,9};
        Solution s=new Solution();
        System.out.println(s.maxArea(h));
    }
}
