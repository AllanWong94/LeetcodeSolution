package Y2017M6D11.NextGreaterElementI;

/**
 * Created by Allan Wong on 2017/6/11.
 */
public class Solution {



    //Runtime:28ms Beats 7%
    public int[] nextGreaterElement(int[] findNums, int[] nums) {
        if(findNums.length==0){
            return new int[0];
        }
        int index=0;
        int[] res=new int[findNums.length];
        for(int i=0;i<findNums.length;i++){
            res[i]=-1;
            for(int j=0;j<nums.length;j++){
                if(nums[j]==findNums[i]){
                    index=j;
                    break;
                }
            }
            for(int j=index+1;j<nums.length;j++){
                if(nums[j]>findNums[i]){
                    res[i]=nums[j];
                    break;
                }
            }
        }
        return res;
    }

    //Runtime:3ms
    /*Store the indices of each number in nums so that won't need to loop through the
      array multiple times.

    public int[] nextGreaterElement(int[] findNums, int[] nums) {


        if (nums == null || nums.length == 0) {
            return new int[]{};
        }

        int Length = nums.length;
        int findLength = findNums.length;
        int[] Final = new int[findLength];

        int max = nums[0];
        for (int i = 1; i < Length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        int[] Indexer = new int[max + 1];
        for (int i = 0; i < Length; i++) {
            Indexer[nums[i]] = i;
        }


        boolean Found = false;
        int cur, curindex;

        for (int i = 0; i < findLength; i++) {
            Found = false;
            cur = findNums[i];
            curindex = Indexer[cur] + 1;
            Final[i] = -1;

            if (cur != max) {
                while (curindex < Length && Found != true) {
                    if (nums[curindex] > cur) {
                        Found = true;
                        Final[i] = nums[curindex];
                    }
                    curindex++;
                }
            }
        }
        return Final;


    }


     */




    public static void main(String[] args) {
        Solution s=new Solution();
        int[] a=s.nextGreaterElement(new int[]{2,4},new int[]{1,2,3,4});
        System.out.println();
        System.out.println("Done.");
    }

}
