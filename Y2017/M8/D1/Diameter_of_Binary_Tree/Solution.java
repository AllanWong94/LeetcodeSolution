package Y2017.M8.D1.Diameter_of_Binary_Tree;

import Y2017.TreeNode;

/**
 * Created by Allan Wong on 7/31/2017.
 */
public class Solution {
    //Runtime:9ms Better than or equals to 92%
    int max;
    public int diameterOfBinaryTree(TreeNode root) {
        max=0;
        helper(root);
        return max;
    }
    //Runtime:
    /*
    */

    //Return param: {longest single path}
    public int helper(TreeNode root){
        if(root==null)
            return 0;
        int left=helper(root.left),right=helper(root.right);
        max=Math.max(max,left+right);
        return Math.max(left+1,right+1);
    }


    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println();
        System.out.println("Done.");
    }


}
