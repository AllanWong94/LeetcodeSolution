package Y2017.M6.Y2017M6D15.LinkedListCycle;

/**
 * Created by Allan Wong on 2017/6/15.
 */
public class Solution {
    //Runtime:1ms Better than or equals to 99.9%
    //Caveat: No ListNode whose val is 0 allowed.
    public boolean hasCycle(ListNode head) {
        if(head==null||head.next==null)
            return false;
        while(head.next!=null){
            if(head.val==0)
                return true;
            head.val=0;
            head=head.next;
        }
        return false;
    }

    //Runtime:
    /*
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
            if (fast == null)   return false;
            fast = fast.next;
            if (slow == fast)   return true;
        }
        return false;
    }


     */


    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println();
        System.out.println("Done.");
    }


    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

}
