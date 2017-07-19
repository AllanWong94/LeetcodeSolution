package Y2017.M7.D19.Symmetric_Tree;

import java.util.Queue;
import java.util.Stack;

/**
 * Created by Allan Wong on 7/19/2017.
 */
public class Solution {
    //Runtime:1ms Better than or equals to 96%
    //Recursive method.
//    public boolean isSymmetric(TreeNode root) {
//        if(root==null)
//            return true;
//        if ((root.left == null && root.right != null) || (root.left != null && root.right == null)) {
//            return false;
//        }
//        return helper(root.left, root.right);
//    }
//
//    public boolean helper(TreeNode tn1, TreeNode tn2) {
//        if (tn1 == null && tn2 == null)
//            return true;
//        if ((tn1 == null && tn2 != null) || (tn1 != null && tn2 == null)) {
//            return false;
//        }
//        if (tn1.val != tn2.val)
//            return false;
//        return helper(tn1.left, tn2.right) && helper(tn1.right, tn2.left);
//    }

    //Runtime:3ms Better than or equals to 12%
    //Iterative method.
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        Stack<TreeNode> q = new Stack<>();
        q.push(root.left);
        q.push(root.right);
        while (!q.isEmpty()) {
            TreeNode tn1 = q.pop();
            TreeNode tn2 = q.pop();
            if (tn1 == null && tn2 == null)
                continue;
            if (tn1 == null || tn2 == null)
                return false;
            if (tn1.val != tn2.val)
                return false;
            q.push(tn1.left);
            q.push(tn2.right);
            q.push(tn1.right);
            q.push(tn2.left);
        }
        return true;
    }

    //Runtime:
    /*
    */

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        TreeNode tn1 = new TreeNode(1);
        TreeNode tn2 = new TreeNode(2);
        TreeNode tn3 = new TreeNode(2);
        tn1.left = tn2;
        tn1.right = tn3;
        tn2.left = new TreeNode(3);
        tn3.right = new TreeNode(3);
        tn2.right = new TreeNode(4);
        tn3.left = new TreeNode(4);

        System.out.println(s.isSymmetric(tn1));
        System.out.println("Done.");
    }
}
