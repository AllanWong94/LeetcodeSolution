package Y2017M6D21.IntersectionofTwoLinkedLists;

/**
 * Created by Allan Wong on 2017/6/20.
 */
public class Solution {

    //Runtime:2ms Better than or equals to 98%
    //Reference: https://discuss.leetcode.com/topic/28067/java-solution-without-knowing-the-difference-in-len/2
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA, b = headB;
        if (headA == null || headB == null)
            return null;
        while (a != b) {
            a = a == null ? headB : a.next;
            b = b == null ? headA : b.next;
        }
        return a;
    }

    //Runtime:
    /*
    */


    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println();
        System.out.println("Done.");
    }


}
