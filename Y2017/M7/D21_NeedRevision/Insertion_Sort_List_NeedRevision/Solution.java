package Y2017.M7.D21_NeedRevision.Insertion_Sort_List_NeedRevision;

import Y2017.ListNode;

/**
 * Created by Allan Wong on 7/21/2017.
 */
public class Solution {
    //Runtime:42ms Better than or equals to 49%
    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode sentinel = new ListNode(Integer.MIN_VALUE);
        ListNode pre = sentinel, cur = head, next;
        while (cur != null) {
            next = cur.next;
            cur.next=null;
            if (cur.val >= pre.val) {
                while (pre.next != null && cur.val >= pre.next.val) {
                    pre = pre.next;
                }
            }
            cur.next = pre.next;
            pre.next = cur;
            cur = next;
            pre=sentinel;
        }
        return sentinel.next;
    }
    //Runtime:5ms
    /*public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = head;
        ListNode curt = head.next;

        while (curt != null) {
            if (curt.val < prev.val) {
                prev.next = curt.next;
                insert(dummy, curt);
                curt = prev.next;
            } else {
                prev = curt;
                curt = curt.next;
            }
        }

        return dummy.next;
    }

    private void insert(ListNode head, ListNode curt) {
        while (head.next.val < curt.val) {
            head = head.next;
        }
        curt.next = head.next;
        head.next = curt;
    }
    */


    public static void main(String[] args) {Solution s = new Solution();
        int[] nums = new int[]{-84,142,41,-17,-71,170,186,183,-21,-76,76,10,29,81,112,-39,-6,-43,58,41,111,33,69,97,-38,82,-44,-7,99,135,42,150,149,-21,-30,164,153,92,180,-61,99,-81,147,109,34,98,14,178,105,5,43,46,40,-37,23,16,123,-53,34,192,-73,94,39,96,115,88,-31,-96,106,131,64,189,-91,-34,-56,-22,105,104,22,-31,-43,90,96,65,-85,184,85,90,118,152,-31,161,22,104,-85,160,120,-31,144,115};
        ListNode head = new ListNode(nums[0]), cur = head;
        for (int i = 1; i < nums.length; i++) {
            cur.next = new ListNode(nums[i]);
            cur = cur.next;
        }
        head = s.insertionSortList(head);
        System.out.println();
        System.out.println("Done.");
    }


}
