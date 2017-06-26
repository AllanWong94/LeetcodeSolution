package Y2017.M6.Y2017M6D23.CopyListwithRandomPointer;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Allan Wong on 2017/6/23.
 */
public class Solution {
    //Runtime:ms Better than or equals to %
    //Comment: Not sure about what "a deep copy" was before reading others' solutions
    //Reference: https://discuss.leetcode.com/topic/18086/java-o-n-solution
    public RandomListNode copyRandomList(RandomListNode head) {
        if (head == null) return null;

        Map<RandomListNode, RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();

        // loop 1. copy all the nodes
        RandomListNode node = head;
        while (node != null) {
            map.put(node, new RandomListNode(node.label));
            node = node.next;
        }

        // loop 2. assign next and random pointers
        node = head;
        while (node != null) {
            map.get(node).next = map.get(node.next);
            map.get(node).random = map.get(node.random);
            node = node.next;
        }

        return map.get(head);

    }
    //Runtime:
    /*
    */


    class RandomListNode {
        int label;
        RandomListNode next, random;

        RandomListNode(int x) {
            this.label = x;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println();
        System.out.println("Done.");
    }


}
