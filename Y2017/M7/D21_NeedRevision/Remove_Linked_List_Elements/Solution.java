package Y2017.M7.D21_NeedRevision.Remove_Linked_List_Elements;

import Y2017.ListNode;

/**
 * Created by Allan Wong on 7/21/2017.
 */
public class Solution {
    //Runtime:1ms Better than or equals to 100%
    public ListNode removeElements(ListNode head, int val) {
        if (head == null)
            return null;
        while (head != null && head.val == val)
            head = head.next;
        ListNode cur = head;
        while (cur != null && cur.next != null) {
            if (cur.next.val == val) {
                cur.next = cur.next.next;
            } else
                cur = cur.next;
        }
        return head;
    }
    //Runtime:
    /*
    */


    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = new int[]{1, 2, 2, 1};
        ListNode head = new ListNode(nums[0]), cur = head;
        for (int i = 1; i < nums.length; i++) {
            cur.next = new ListNode(nums[i]);
            cur = cur.next;
        }
        head = s.removeElements(head, 2);
        System.out.println();
        System.out.println("Done.");
    }


}
