package Y2017.M6.Y2017M6D14.InvertBinaryTree;

/**
 * Created by Allan Wong on 2017/6/15.
 */
public class Solution {


    //Runtime:0ms Fastest
    public TreeNode invertTree(TreeNode root) {
        if(root!=null){
            if(root.left!=null||root.right!=null){
                TreeNode temp=invertTree(root.right);
                root.right=invertTree(root.left);
                root.left=temp;
            }
        }
        return root;
    }


    //Runtime:
    /*



     */


    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println();
        System.out.println("Done.");
    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
