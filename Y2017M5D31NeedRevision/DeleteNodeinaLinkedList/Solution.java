package DeleteNodeinaLinkedList;

/**
 * Created by Allan Wong on 2017/5/31.
 */
public class Solution {

    //Runtime:1ms Beats 9% (Fastest 1ms)
    public void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
    }



    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
