package Y2017.M6.Y2017M6D11.FindLeavesofBinaryTree;

/**
 * Created by Allan Wong on 2017/6/11.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 */
public class Solution {
    //Runtime:1ms Fastest
    public List<List<Integer>> findLeaves(TreeNode root) {
        if(root==null)
            return new ArrayList<>();
        if(root.left==null && root.right==null){
            ArrayList<List<Integer>> al=new ArrayList<List<Integer>>();
            ArrayList<Integer> al2=new ArrayList<>();
            al2.add(root.val);
            al.add(al2);
            return al;
        }
        ArrayList<Integer> leaves=new ArrayList<>();
        ArrayList<List<Integer>> ans=new ArrayList<>();
        boolean flag=true;
        while(flag!=false){
            flag=getLeaves(root, leaves);
            ans.add(leaves);
            leaves=new ArrayList<>();
        }
        return ans;
    }

    public boolean getLeaves(TreeNode node, List<Integer> leaves){
        if(node.left==null && node.right==null){
            leaves.add(node.val);
            return false;
        }
        if(node.left!=null && node.left.left==null && node.left.right==null){
            leaves.add(node.left.val);
            node.left=null;
        }
        if(node.left!=null){
            getLeaves(node.left, leaves);
        }
        if(node.right!=null && node.right.left==null && node.right.right==null){
            leaves.add(node.right.val);
            node.right=null;
        }
        if(node.right!=null){
            getLeaves(node.right, leaves);
        }
        return true;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        Solution s=new Solution();
        System.out.println(s.findLeaves(root));
        System.out.println("Done.");
    }
}