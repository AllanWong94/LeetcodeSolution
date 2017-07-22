package Y2017.M7.D22_NeedRevision.Remove_Duplicates_from_Sorted_List;

import Y2017.ListNode;

/**
 * Created by Allan Wong on 7/22/2017.
 */
public class Solution {
    //Runtime:1ms Better than or equals to 100%
    public ListNode deleteDuplicates(ListNode head) {
        int prev=Integer.MIN_VALUE;
        ListNode sentinel=new ListNode(-1),pointer=sentinel,next;
        while(head!=null){
            next=head.next;
            head.next=null;
            if(head.val>prev){
                pointer.next=head;
                prev=head.val;
                pointer=pointer.next;
            }
            head=next;
        }
        return sentinel.next;
    }
    //Runtime:
    /*
    */




    public static void main(String[] args) {
        Solution s=new Solution();
        int[] nums = new int[]{1,2};
        ListNode head = new ListNode(nums[0]), cur = head;
        for (int i = 1; i < nums.length; i++) {
            cur.next = new ListNode(nums[i]);
            cur = cur.next;
        }
        System.out.println(s.deleteDuplicates(head));
        System.out.println("Done.");
    }


}
