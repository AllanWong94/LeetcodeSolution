package Y2017.M7.D24.Path_Sum;

import Y2017.TreeNode;

/**
 * Created by Allan Wong on 7/24/2017.
 */
public class Solution {
    //Runtime:1ms Better than or equals to 99%
    public boolean hasPathSum(TreeNode root, int sum) {
        return helper(root, sum, 0);
    }


    public boolean helper(TreeNode root, int sum, int temp) {
        if (root == null)
            return false;
        if (temp + root.val == sum && root.left == null && root.right == null)
            return true;
        return helper(root.left, sum, temp + root.val) | helper(root.right, sum, temp + root.val);
    }
    //Runtime:
    /*
    */


    public static void main(String[] args) {
        Solution s = new Solution();
        TreeNode t1=new TreeNode(-2);
        TreeNode t2=new TreeNode(-3);
        t1.right=t2;
        System.out.println(s.hasPathSum(t1,-5));
        System.out.println("Done.");
    }


}
