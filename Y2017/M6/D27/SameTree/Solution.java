package Y2017.M6.D27.SameTree;

/**
 * Created by Allan Wong on 2017/6/26.
 */
public class Solution {
    //Runtime:0ms Better than or equals to 100%
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if((p==null && q!=null)||(p!=null&&q==null))
            return false;
        if(p==null&&q==null)
            return true;
        if(p.val==q.val){
            return isSameTree(p.left,q.left) && isSameTree(p.right, q.right);
        }
        return false;
    }
    //Runtime:
    /*
    */


    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println();
        System.out.println("Done.");
    }


}
