package AddTwoNumbers;

/**
 * Created by Allan Wong on 2017/5/27.
 */



/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    //Runtime:61ms
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum=l1.val+l2.val;
        int carry=sum/10;
        ListNode ln=new ListNode(sum%10);
        ListNode pointer=ln;
        while(l1.next!=null&&l2.next!=null){
            sum=l1.next.val+l2.next.val+carry;
            pointer.next=new ListNode((sum)%10);
            carry=sum/10;
            pointer=pointer.next;
            l1=l1.next;
            l2=l2.next;
        }
        while(l1.next!=null){
            sum=carry+l1.next.val;
            pointer.next=new ListNode(sum%10);
            carry=sum/10;
            pointer=pointer.next;
            l1=l1.next;
        }
        while(l2.next!=null){
            sum=carry+l2.next.val;
            pointer.next=new ListNode(sum%10);
            carry=sum/10;
            pointer=pointer.next;
            l2=l2.next;
        }
        if(carry>0)
            pointer.next=new ListNode(carry);

        return ln;
    }

    /*Runtime 41ms

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p1 = l1, p2 = l2;
		ListNode head = null, curr = null;

		int addNext = 0;
	    while( p1 != null || p2 != null || addNext != 0)
		{
			int v1 = 0;
			int v2 = 0;
			int sum = 0;
			if( p1 != null )
			{
				v1 = p1.val;
				p1 = p1.next;
			}
			if( p2 != null )
			{
				v2 = p2.val;
				p2 = p2.next;
			}
			sum = (v1 + v2 + addNext);

			ListNode temp = new ListNode(sum% 10);

			addNext = sum / 10;

			if( head == null )
				head = curr = temp;
			else
				curr.next = temp;

			curr = temp;
		}

		return head;
    }
    *
    *
    *
    *
    *
    *
    *
    *
    *
    * */
}