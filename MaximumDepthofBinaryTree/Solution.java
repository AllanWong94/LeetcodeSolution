package MaximumDepthofBinaryTree;

/**
 * Created by Allan Wong on 2017/5/31.
 */
public class Solution {

    //Runtime:1ms Beats 18%
    public int maxDepth(TreeNode root) {
        if (root==null){
            return 0;
        }
        if(root.left==null){
            if(root.right==null){
                return 1;
            }else{
                return maxDepth(root.right)+1;
            }
        }else{
            if(root.right==null){
                return maxDepth(root.left)+1;
            }else{
                return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
            }
        }
    }

    //Runtime:0ms
   /* public int maxDepth(TreeNode root) {
        if(root==null)
            return 0;
        else
            return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
*/
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
