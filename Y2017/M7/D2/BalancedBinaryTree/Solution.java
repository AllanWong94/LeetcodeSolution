package Y2017.M7.D2.BalancedBinaryTree;

/**
 * Created by Allan Wong on 2017/7/2.
 */
public class Solution {
    //Runtime:5ms Better than or equals to 5%
    public boolean isBalanced(TreeNode root) {
        String haystack,needle;

        if(root==null)
            return true;
        if(Math.abs(maxDepth(root.left,0)-maxDepth(root.right,0))>1)
            return false;
        return isBalanced(root.left)&&isBalanced(root.right);
    }


    public int maxDepth(TreeNode root, int depth){
        if(root==null){
            return depth;
        }else{
            return Math.max(maxDepth(root.left,depth+1),maxDepth(root.right,depth+1));
        }
    }


//Runtime:1ms
    /*Comment: Bottom-up judgement process that saves the iteration.
    public boolean isBalanced(TreeNode root) {
        return height(root) != -1;
    }

    public int height(TreeNode root) {
        if (root == null) return 0;
        int leftheight = height(root.left);
        if (leftheight == -1) return -1;
        int rightheight = height(root.right);
        if (rightheight == -1) return -1;
        if (Math.abs(leftheight - rightheight) > 1) return -1;
        return 1 + Math.max(leftheight, rightheight);
    }
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
        TreeNode tn1=new TreeNode(1);
        TreeNode tn2=new TreeNode(2);
        TreeNode tn3=new TreeNode(3);
        tn1.right=tn2;
        tn2.right=tn3;
        boolean res=s.isBalanced(tn1);
        System.out.println();
        System.out.println("Done.");
    }


}
