package Y2017.M6.Y2017M6D18.OddEvenLinkedList;

/**
 * Created by Allan Wong on 2017/6/18.
 */
public class Solution {
    //Runtime:1ms Better than or equals to 72%
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null)
            return head;
        ListNode newtailodd = head, newtaileven = head.next, evenhead = head.next;
        while (newtaileven!=null&&newtaileven.next!=null) {
            newtailodd.next = newtailodd.next.next;
            newtailodd = newtailodd.next;
            newtaileven.next = newtaileven.next.next;
            newtaileven = newtaileven.next;
        }
        newtailodd.next = evenhead;
        return head;
    }

    //Runtime:0ms
    /*
    public ListNode oddEvenList(ListNode head) {
        if(head==null)return null;
        else
        {
            ListNode p=head;
            ListNode q=head.next;
            while(q!=null && q.next!=null)
            {
                ListNode temp=p.next;
                p.next=q.next;
                q.next=q.next.next;
                p.next.next=temp;
                p=p.next;
                q=q.next;
            }
            return head;
        }
    }
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
        ListNode prev = new ListNode(1), head = prev;
        for (int i = 2; i <= 10; i++) {
            ListNode k = new ListNode(i);
            prev.next = k;
            prev = prev.next;
        }
        head = s.oddEvenList(head);
        System.out.println();
        System.out.println("Done.");
    }


}
