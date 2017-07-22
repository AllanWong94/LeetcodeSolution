package Y2017.M7.D22_NeedRevision.Intersection_of_Two_Arrays_II;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * Created by Allan Wong on 7/22/2017.
 */
public class Solution {
    //Runtime:15ms Better than or equals to 43%
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1==null||nums2==null||nums1.length==0||nums2.length==0)
            return new int[0];
        HashMap<Integer, Integer> map=new HashMap<>();
        LinkedList<Integer> resList=new LinkedList<>();
        for(int i:nums1){
            if(map.containsKey(i))
                map.put(i,map.get(i)+1);
            else
                map.put(i,1);
        }
        for(int j:nums2){
            if(map.containsKey(j)&&map.get(j)>0){
                resList.add(j);
                map.put(j,map.get(j)-1);
            }
        }


        int[] res=new int[resList.size()];
        for(int i=0;i<resList.size();i++){
            res[i]=resList.get(i);
        }
        return res;



    }
    //Runtime:3ms
    /*
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> res=new ArrayList<>();
        int i= 0;
        int j = 0 ;
        while(i< nums1.length && j< nums2.length){
            if(  nums1[i] == nums2[j] ){
                res.add(nums1[i]);
                i++;
                j++;
            }else if( nums1[i] <  nums2[j]   ){
                i++;
            }else {
                j++;
            }
        }


        int[] ans=new int[res.size()];
        for(int k=0;k< res.size();k++   ){
            ans[k]= res.get(k);
        }
        return ans;


    }
    */




    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println();
        System.out.println("Done.");
    }


}
