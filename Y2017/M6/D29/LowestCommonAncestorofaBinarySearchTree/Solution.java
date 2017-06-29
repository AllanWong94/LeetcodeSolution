package Y2017.M6.D29.LowestCommonAncestorofaBinarySearchTree;

/**
 * Created by Allan Wong on 6/29/2017.
 */
public class Solution {
    //Runtime:13ms=>9ms Better than or equals to 6%=>64%
    //Comment: Didn't make use of the properties of a BST.
    /*public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (ancestor(root.left, p) && ancestor(root.left, q)) {
            return lowestCommonAncestor(root.left, p, q);
        }
        if (ancestor(root.right, p) && ancestor(root.right, q)) {
            return lowestCommonAncestor(root.right, p, q);
        }
        if (ancestor(root, p) && ancestor(root, q)) {
            return root;
        }
    }


    public boolean ancestor(TreeNode root, TreeNode p) {
        if (root == null)
            return false;
        if (root == p)
            return true;
        return ancestor(root.left, p) || ancestor(root.right, p);
    }*/


    //Improved version.
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (p.val > q.val) {
            TreeNode temp = p;
            p = q;
            q = temp;
        }
        if(p.val<=root.val&&q.val>=root.val){
            return root;
        }
        if(p.val<root.val&&q.val<root.val){
            return lowestCommonAncestor(root.left,p,q);
        }
        if(p.val>root.val&&q.val>root.val){
            return lowestCommonAncestor(root.right,p,q);
        }
        return null;
    }

    //Runtime:7ms
    /*
    Comment: Instead of swapping the two TreenNodes to ensure p.val is smaller than q.val, just take into account of both
    cases and return the result.
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root.val>p.val && root.val<q.val)
            return root;
        if(root.val<p.val && root.val<q.val)
            return lowestCommonAncestor(root.right,p,q);
        if(root.val>p.val && root.val>q.val)
            return lowestCommonAncestor(root.left,p,q);
        return root;
    }
    */



    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println();
        System.out.println("Done.");
    }


}
