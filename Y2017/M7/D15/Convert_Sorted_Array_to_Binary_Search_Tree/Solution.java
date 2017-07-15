package Y2017.M7.D15.Convert_Sorted_Array_to_Binary_Search_Tree;

/**
 * Created by Allan Wong on 7/15/2017.
 */
public class Solution {

    //Runtime:1ms Better than or equals to 99%
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0)
            return null;
        return makeTree(nums,0,nums.length-1);
    }
    //Runtime:
    /*
    */

    public TreeNode makeTree(int[] nums,int begin,int end){
        if(begin>end)
            return null;
        int mid=(begin+end)/2;
        TreeNode root=new TreeNode(nums[mid]);
        root.left=makeTree(nums,begin,mid-1);
        root.right=makeTree(nums,mid+1,end);
        return root;
    }


    public static void main(String[] args) {
        Solution s=new Solution();
        TreeNode res=s.sortedArrayToBST(new int[]{0});
        System.out.println();
        System.out.println("Done.");
    }





    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
