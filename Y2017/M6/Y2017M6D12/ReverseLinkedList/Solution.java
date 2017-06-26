package Y2017.M6.Y2017M6D12.ReverseLinkedList;


/**
 * Created by Allan Wong on 2017/6/12.
 */
public class Solution {
    //Runtime:1ms Beats 35%
    /*public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null)
            return head;
        ListNode sentinel=new ListNode(-1),temp=head,next;
        sentinel.next=head;
        temp=head.next;
        head.next=null;
        while(temp!=null) {
            next=temp.next;
            temp.next=sentinel.next;
            sentinel.next=temp;
            temp=next;
        }
        return sentinel.next;
    }
*/
/*
    //Improved. Iterative Version Reference:https://discuss.leetcode.com/topic/13268/in-place-iterative-and-recursive-java-solution
    //Runtime:0ms
    public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null)
            return head;
        return reverseListIter(head, null);
    }

    public ListNode reverseListIter(ListNode head, ListNode rev){
        ListNode next;
        while(head!=null){
            next=head.next;
            head.next=rev;
            rev=head;
            head=next;
        }
        return rev;
    }*/

    //Improved. Recursive Version Reference:https://discuss.leetcode.com/topic/13268/in-place-iterative-and-recursive-java-solution
    //Runtime:1ms
    public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null)
            return head;
        return reverseListRecur(head, null);
    }

    public ListNode reverseListRecur(ListNode head, ListNode rev){
        if(head==null){
            return rev;
        }
        ListNode next=head.next;
        head.next=rev;
        return reverseListRecur(next,head);
    }


    public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }



    public static void main(String[] args) {
        ListNode p1=new ListNode(1),p2=new ListNode(2),p3=new ListNode(3);
        p1.next=p2;
        //p2.next=p3;
        Solution s=new Solution();
        ListNode res=s.reverseList(p1);
        System.out.println();
        System.out.println("Done.");
    }
}
