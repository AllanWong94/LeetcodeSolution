package Y2017.M7.D25_NeedRevision.Binary_Tree_Paths;

import Y2017.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Allan Wong on 7/26/2017.
 */
public class Solution {
    //Runtime:17ms Better than or equals to 80%
    public List<String> binaryTreePaths(TreeNode root) {
        LinkedList<String> res = new LinkedList<>();
        if (root == null) return res;
        helper(root,"",res);
        return res;
    }

    public void helper(TreeNode root, String s, List<String> res) {
        if (root == null) return;
        if(s.length()>0) s+="->";
        s += root.val;
        if (root.left == null && root.right == null)
            res.add(s);
        else {
            helper(root.left, s, res);
            helper(root.right, s, res);
        }
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
