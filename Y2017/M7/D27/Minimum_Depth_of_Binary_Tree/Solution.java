package Y2017.M7.D27.Minimum_Depth_of_Binary_Tree;

import Y2017.TreeNode;

/**
 * Created by Allan Wong on 7/27/2017.
 */
public class Solution {
    //Runtime:1ms Better than or equals to 99%
    public int minDepth(TreeNode root) {
        if(root==null)
            return 0;
        return helper(root, 1);
    }

    public int helper(TreeNode root, int length) {
        if (root == null)
            return Integer.MAX_VALUE;
        if (root.left == null && root.right == null)
            return length;
        return Math.min(helper(root.left, length + 1), helper(root.right, length + 1));
    }
    //Runtime:
    /*
    */


    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println();
        System.out.println("Done.");
    }


}
