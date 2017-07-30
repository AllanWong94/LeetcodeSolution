package Y2017.M7.D29_NeedRevision.Binary_Tree_Level_Order_Traversal_II;

import Y2017.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Allan Wong on 7/30/2017.
 */
public class Solution {
    //Runtime:1ms Better than or equals to 100%   One-time AC! Wow
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<LinkedList<Integer>> list=new LinkedList<>();
        helper(root, list, 1);
        return (List)list;
    }


    public void helper(TreeNode root,LinkedList<LinkedList<Integer>> list,int depth){
        if(root==null)
            return;
        if(list.size()<depth)
            list.addFirst(new LinkedList<>());
        LinkedList temp=list.get(list.size()-depth);
        temp.add(root.val);
        helper(root.left,list,depth+1);
        helper(root.right,list,depth+1);
    }
    //Runtime:
    /*
    */




    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println();
        System.out.println("Done.");
    }


}
