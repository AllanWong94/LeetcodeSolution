package Y2017.M6.Y2017M6D17.BinarySearchTreeIterator;

import java.util.Stack;

/**
 * Created by Allan Wong on 2017/6/18.
 */
public class BSTIterator {
    private Stack<TreeNode> stack;

    //Runtime:6ms Better than or equals to 48%
    //Reference: https://discuss.leetcode.com/topic/6575/my-solutions-in-3-languages-with-stack
    public BSTIterator(TreeNode root) {
        stack = new Stack<>();
        pushAll(root);
    }

    /**
     * @return whether we have a next smallest number
     */
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    /**
     * @return the next smallest number
     */
    public int next() {
        TreeNode node = stack.pop();
        pushAll(node.right);
        return node.val;
    }

    public void pushAll(TreeNode root) {
        while (root != null) {
            stack.push(root);
            root = root.left;
        }
    }
    //Runtime:4ms
    //Comments:Does not meet the requirement of O(h) space complexity, where h is the
    //height of the tree.
    /*
    List<TreeNode> list = null;
    int curr = 0;
    public BSTIterator(TreeNode root) {
        list = new ArrayList<>();
        helper(root);
    }

    public void helper(TreeNode node) {
        if (node == null) return;
        helper(node.left);
        list.add(node);
        helper(node.right);
    }

     @return whether we have a next smallest number
    public boolean hasNext() {
        return curr < list.size();
    }

     @return the next smallest number
    public int next() {
        return list.get(curr++).val;
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
        TreeNode root = new TreeNode(2);
        TreeNode t1 = new TreeNode(3);
        TreeNode t2 = new TreeNode(4);
        TreeNode t3 = new TreeNode(5);
        root.left = t1;
        root.right = t2;
        t2.left = t3;
        BSTIterator b = new BSTIterator(root);
        System.out.println();
        System.out.println("Done.");
    }


}
