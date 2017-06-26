package TwoSum;

/**
 * Created by Allan Wong on 2017/5/27.
 */
public class Solution {
    //Runtime:11ms Beats 45%
    //Improvement: Use merge sort or quick sort to limit the runtime to O(nlogn)
    public int[] twoSum(int[] nums, int target) {
        int[] sorted=insertSort(nums);
        int[] ans=new int[]{0,nums.length-1};
        int temp=0;
        while(sorted[ans[0]]+sorted[ans[1]]!=target){
            temp=sorted[ans[0]]+sorted[ans[1]];
            if(temp<target){
                ans[0]++;
            }else{
                ans[1]--;
            }
        }
        ans[0]=find(sorted[ans[0]],nums,-1);
        ans[1]=find(sorted[ans[1]],nums,ans[0]);
        if (ans[0]>ans[1])
        {temp=ans[0];
        ans[0]=ans[1];
        ans[1]=temp;}
        return ans;
    }

    public int find(int i,int[] nums,int index){
        for(int k=0;k<nums.length;k++){
            if(nums[k]==i&&k!=index)
                return k;
        }
        return -1;
    }

    public int[] insertSort(int[] arr) {
        int[] array=new int[arr.length];
        if (arr == null || arr.length < 2) {
            return arr;
        }
        System.arraycopy(arr,0,array,0,arr.length);
        for (int i = 1; i < arr.length; i++) {
            int currentValue = array[i];
            int position = i;
            for (int j = i - 1; j >= 0; j--) {
                if (array[j] > currentValue) {
                    array[j + 1] = array[j];
                    position -= 1;
                } else {
                    break;
                }
            }

            array[position] = currentValue;
        }
        return array;
    }

/*Runtime 1ms
  Caveat:runtime O(n^2)=>painful for large-scale integer array
    public int[] twoSum(int[] nums, int target) {
        int[] sum = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(target - nums[i] == nums[j]) {
                    sum[0] = i;
                    sum[1] = j;
                }
            }
        }
        return sum;
    }
*/




}
