package Y2017.M7.D16.Merge_Two_Binary_Trees;

/**
 * Created by Allan Wong on 7/16/2017.
 */
public class Solution {
    //Runtime:17ms Better than or equals to 56%
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1==null)
            return t2;
        if(t2==null)
            return t1;
        TreeNode root=new TreeNode(t1.val+t2.val);
        merge(root,t1,t2);
        return root;
    }
    //Runtime:12ms
    /*
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {

        TreeNode merge = null;

        if (t1 == null && t2 == null) return null;
        if (t1 != null && t2 == null) merge = t1;
        if (t1 == null && t2 != null) merge = t2;
        if (t1 != null && t2 != null) {
            merge = new TreeNode(t1.val + t2.val);
            merge.left = mergeTrees(t1.left, t2.left);
            merge.right = mergeTrees(t1.right, t2.right);
        }
        return merge;
    }
    */

    public void merge(TreeNode merged,TreeNode t1, TreeNode t2){
        if(t1==null) {
            merged.left = t2.left;
            merged.right = t2.right;
            return;
        }
        if(t2==null) {
            merged.left = t1.left;
            merged.right = t1.right;
            return;
        }
        if(t1.left!=null || t2.left!=null){
            merged.left=new TreeNode((t1.left==null?0:t1.left.val)+(t2.left==null?0:t2.left.val));
            merge(merged.left,t1.left,t2.left);
        }
        if(t1.right!=null || t2.right!=null){
            merged.right=new TreeNode((t1.right==null?0:t1.right.val)+(t2.right==null?0:t2.right.val));
            merge(merged.right,t1.right,t2.right);
        }
    }



    public static void main(String[] args) {
        TreeNode t1=new TreeNode(1);
        TreeNode t2=new TreeNode(3);
        TreeNode t3=new TreeNode(2);
        TreeNode t4=new TreeNode(5);
        t1.left=t2;
        t1.right=t3;
        t2.left=t4;

        TreeNode t5=new TreeNode(2);
        TreeNode t6=new TreeNode(1);
        TreeNode t7=new TreeNode(3);
        TreeNode t8=new TreeNode(4);
        TreeNode t9=new TreeNode(7);
        t5.left=t6;
        t5.right=t7;
        t6.right=t8;
        t7.right=t9;




        Solution s = new Solution();
        System.out.println();
        TreeNode res=s.mergeTrees(t1,t5);
        System.out.println("Done.");
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

}
