package MedianofTwoSortedArrays;

/**
 * Created by Allan Wong on 2017/5/27.
 */
public class Solution {
    //Runtime: 64 ms Beats 87.71%
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length=nums1.length+nums2.length;
        if(length%2==1){
            return findKth(length/2+1,nums1,nums2,0,0);
        }else{
            return (findKth(length/2+1,nums1,nums2,0,0)
                    +findKth(length/2,nums1,nums2,0,0))/2;
        }
    }

    public double findKth(int k, int[] nums1,int[] nums2,int start1,int start2){
        if(nums1.length>nums2.length)
            return findKth(k,nums2,nums1,start2,start1);//always make nums1.length<=nums2.length
        if(start1>nums1.length-1){
            return nums2[start2+k-1];
        }
        if(start2>nums2.length-1){
            return nums1[start1+k-1];
        }
        if(k==1){
            return Math.min(nums1[start1],nums2[start2]);
        }
        //Wrong! Because if start1+k/2-1>=nums1.length-1, then nums1 should not be
        //considered to contain the median. Thus the following comparison should lead
        //to operations involving nums2 only!!!
        //To make this right, when the situation occurs, make num1 as large as possible.
        //And vice versa for num2!
        //int index1=Math.min(start1+k/2-1,nums1.length-1);
        //int index2=Math.min(start2+k/2-1,nums2.length-1);
        int index1=start1+k/2-1;
        int index2=start2+k/2-1;


        int num1=index1<nums1.length?nums1[index1]:Integer.MAX_VALUE;
        int num2=index2<nums2.length?nums2[index2]:Integer.MAX_VALUE;
        if(num1<num2){
            return findKth(k-k/2,nums1,nums2,index1+1,start2);
        }else{
            return findKth(k-k/2,nums1,nums2,start1,index2+1);
        }
    }


    /*Runtime 57ms
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int total = nums1.length + nums2.length;
        int k = total / 2;
        if(total % 2 == 0) {
            return (findKth(k + 1, nums1, nums2, 0, 0) + findKth(k, nums1, nums2, 0, 0)) / 2.0;
        } else {
            return findKth(k + 1, nums1, nums2, 0, 0);
        }
    }

    private double findKth(int k, int[] nums1, int[] nums2, int s1, int s2) {
        if(s1 >= nums1.length) return nums2[s2 + k - 1];
        if(s2 >= nums2.length) return nums1[s1 + k - 1];
        if(k == 1) return Math.min(nums1[s1], nums2[s2]);

        int mid1 = Integer.MAX_VALUE;
        int mid2 = Integer.MAX_VALUE;
        int m1 = s1 + k / 2 - 1;
        int m2 = s2 + k / 2 - 1;
        if(m1 < nums1.length) mid1 = nums1[m1];
        if(m2 < nums2.length) mid2 = nums2[m2];
        if(mid1 < mid2) return findKth(k - k/2, nums1, nums2, m1+1, s2);
        else return findKth(k - k/2, nums1, nums2, s1, m2+1);
    }*/



    //Time complexity O(m+n)
    /*public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length=nums1.length+nums2.length;
        int pointer1=0,pointer2=0;
        int median=0;
        int[] merge=new int[length];
        for(int i=0;i<length;i++){
            if(nums1[pointer1]<nums2[pointer2]){
                merge[i]=nums1[pointer1];
                pointer1++;
            }else{
                merge[i]=nums2[pointer2];
                pointer2++;
            }
        }
        if(length%2==0)
            return ((double)(merge[length/2]+merge[length/2-1]))/2;
        return (double)merge[length/2];
        }

    }*/

}
