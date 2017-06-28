package Y2017.M6.D28.PalindromeLinkedList;

/**
 * Created by Allan Wong on 2017/6/27.
 */
public class Solution {
    //Runtime:2ms Better than or equals to 94%
    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null)
            return true;
        ListNode mid=head,tail=head;
        while(tail.next!=null && tail.next.next!=null){
            mid=mid.next;
            tail=tail.next.next;
        }
        if(mid==tail){
            return mid.val==mid.next.val;
        }
        ListNode temp=new ListNode(0);
        if(tail.next==null){
            while(head!=mid){
                ListNode next=head.next;
                head.next=temp.next;
                temp.next=head;
                head=next;
            }
            temp=temp.next;
            mid=mid.next;
            while(temp!=null){
                if(temp.val!=mid.val)
                    return false;
                temp=temp.next;
                mid=mid.next;
            }
            return true;
        }else{
            mid=mid.next;
            while(head!=mid){
                ListNode next=head.next;
                head.next=temp.next;
                temp.next=head;
                head=next;
            }
            temp=temp.next;
            while(temp!=null){
                if(temp.val!=mid.val)
                    return false;
                temp=temp.next;
                mid=mid.next;
            }
            return true;
        }
    }
    //Runtime:
    /*
    */

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums=new int[]{1,2,2,1};
        ListNode head=null,tail=null;
        for(int i:nums){
            if(head==null){
                head=new ListNode(i);
                tail=head;
            }else{
                tail.next=new ListNode(i);
                tail=tail.next;
            }
        }
        boolean res=s.isPalindrome(head);
        System.out.println();
        System.out.println("Done.");
    }


}
